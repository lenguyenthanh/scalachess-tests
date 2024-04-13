import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests484 extends SimpleIOSuite:

  test("random.perft - part 484") {
    Perft
      .perfts(Perft.randomPerfts(484), Chess960)
      .map(assert(_))
  }
