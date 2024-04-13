import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests458 extends SimpleIOSuite:

  test("random.perft - part 458") {
    Perft
      .perfts(Perft.randomPerfts(458), Chess960)
      .map(assert(_))
  }
