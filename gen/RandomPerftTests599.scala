import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests599 extends SimpleIOSuite:

  test("random.perft - part 599") {
    Perft
      .perfts(Perft.randomPerfts(599), Chess960)
      .map(assert(_))
  }
