import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests190 extends SimpleIOSuite:

  test("random.perft - part 190") {
    Perft
      .perfts(Perft.randomPerfts(190), Chess960)
      .map(assert(_))
  }
