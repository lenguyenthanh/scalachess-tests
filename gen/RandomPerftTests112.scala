//> using scala "3.2.2"
//> using repository "https://raw.githubusercontent.com/lichess-org/lila-maven/master"
//> using lib "org.lichess::scalachess:14.6.3"
//> using lib "com.disneystreaming::weaver-cats:0.8.1"
//> using testFramework "weaver.framework.CatsEffect"

import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests112 extends SimpleIOSuite:

  test("random.perft - part 112") {
    Perft
      .perfts(Perft.randomPerfts(112), Chess960)
      .map(assert(_))
  }