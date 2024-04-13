import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests285 extends SimpleIOSuite:

  test("random.perft - part 285") {
    Perft
      .perfts(Perft.randomPerfts(285), Chess960)
      .map(assert(_))
  }
