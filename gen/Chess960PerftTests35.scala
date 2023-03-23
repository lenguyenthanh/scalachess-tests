//> using scala "3.2.2"
//> using repository "https://raw.githubusercontent.com/lichess-org/lila-maven/master"
//> using lib "org.lichess::scalachess:14.6.3"
//> using lib "com.disneystreaming::weaver-cats:0.8.1"
//> using testFramework "weaver.framework.CatsEffect"

import weaver.*

import chess.format.EpdFen
import chess.variant.*

object Chess960PerftTests35 extends SimpleIOSuite:

  test("chess960 - part 35") {
    Perft
      .perfts(Perft.chess960(35), Chess960)
      .map(assert(_))
  }
