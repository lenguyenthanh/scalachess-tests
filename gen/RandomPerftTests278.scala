import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests278 extends SimpleIOSuite:

  test("random.perft - part 278") {
    Perft
      .perfts(Perft.randomPerfts(278), Chess960)
      .map(assert(_))
  }
