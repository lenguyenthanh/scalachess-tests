import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests457 extends SimpleIOSuite:

  test("random.perft - part 457") {
    Perft
      .perfts(Perft.randomPerfts(457), Chess960)
      .map(assert(_))
  }
