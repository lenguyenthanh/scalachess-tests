import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests451 extends SimpleIOSuite:

  test("random.perft - part 451") {
    Perft
      .perfts(Perft.randomPerfts(451), Chess960)
      .map(assert(_))
  }
