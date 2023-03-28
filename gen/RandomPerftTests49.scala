import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests49 extends SimpleIOSuite:

  test("random.perft - part 49") {
    Perft
      .perfts(Perft.randomPerfts(49), Chess960)
      .map(assert(_))
  }
