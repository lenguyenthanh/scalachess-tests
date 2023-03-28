import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests204 extends SimpleIOSuite:

  test("random.perft - part 204") {
    Perft
      .perfts(Perft.randomPerfts(204), Chess960)
      .map(assert(_))
  }
