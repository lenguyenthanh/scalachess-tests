import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests364 extends SimpleIOSuite:

  test("random.perft - part 364") {
    Perft
      .perfts(Perft.randomPerfts(364), Chess960)
      .map(assert(_))
  }
