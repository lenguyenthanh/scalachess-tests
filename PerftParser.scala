//> using scala "3.2.2"
//> using lib "org.typelevel::toolkit::0.0.4"
//> using lib "org.typelevel::cats-parse::0.3.9"
//> using repository "https://raw.githubusercontent.com/lichess-org/lila-maven/master"
//> using lib "org.lichess::scalachess:14.6.3"

import cats.syntax.all.*
import cats.parse.{ LocationMap, Numbers as N, Parser as P, Parser0 as P0, Rfc5234 as R }

import chess.format.EpdFen

object PerftParser:
  def parse: String => Either[P.Error, List[Perft]] = perfts.parseAll

  private val whitespace  = R.cr | R.lf | R.wsp
  private val blank       = P.until(!whitespace)
  private val nonNegative = N.nonNegativeIntString

  private val comment = (P.caret.filter(_.col == 0) *> P.char('#')).endWith(R.lf)
  private val ignored = (comment | blank).void

  private val id: P[String]  = "id".prefix
  private val epd: P[EpdFen] = "epd".prefix.map(EpdFen.clean)
  private val testCase: P[TestCase] =
    ((nonNegative.map(_.toInt) <* P.char(' ')) ~ nonNegative.map(_.toLong)).map(TestCase.apply)
  private val oneTestCase: P[TestCase] = P.string("perft ") *> testCase <* R.lf.?
  private val cases: P[List[TestCase]] = oneTestCase.rep.map(_.toList) <* (ignored.rep | R.lf.rep0)
  private val perft: P[Perft]          = (id, epd, cases).mapN(Perft.apply) <* R.lf.?
  private val perfts: P0[List[Perft]]  = ignored.rep0 *> perft.rep.map(_.toList)

  extension (p: P0[Any]) private def endWith(p1: P[Any]): P[String] = p.with1 *> (p1.string | (P.until(p1) <* p1))

  extension (str: String) private def prefix: P[String] = P.string(s"$str ").endWith(R.lf)
