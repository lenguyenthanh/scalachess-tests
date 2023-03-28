import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests367 extends SimpleIOSuite:

  test("random.perft - part 367") {
    Perft
      .perfts(Perft.randomPerfts(367), Chess960)
      .map(assert(_))
  }
