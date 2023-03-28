//> using scala "3.2.2"
//> using repository "https://raw.githubusercontent.com/lichess-org/lila-maven/master"
//> using lib "org.lichess::scalachess:14.6.3"
//> using lib "com.disneystreaming::weaver-cats:0.8.1"
//> using testFramework "weaver.framework.CatsEffect"

import weaver.*

import chess.format.EpdFen
import chess.variant.*

object CommonTests extends SimpleIOSuite:

  pureTest("perft split") {
    expect(
      Perft.splitPerft("resources/random.perft", 16).flatten.toSet ==
        Perft.read("resources/random.perft").toSet
    )
  }
