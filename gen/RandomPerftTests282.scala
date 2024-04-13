import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests282 extends SimpleIOSuite:

  test("random.perft - part 282") {
    Perft
      .perfts(Perft.randomPerfts(282), Chess960)
      .map(assert(_))
  }
