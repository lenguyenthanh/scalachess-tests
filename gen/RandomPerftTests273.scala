import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests273 extends SimpleIOSuite:

  test("random.perft - part 273") {
    Perft
      .perfts(Perft.randomPerfts(273), Chess960)
      .map(assert(_))
  }
