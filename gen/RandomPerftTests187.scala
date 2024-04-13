import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests187 extends SimpleIOSuite:

  test("random.perft - part 187") {
    Perft
      .perfts(Perft.randomPerfts(187), Chess960)
      .map(assert(_))
  }
