import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests361 extends SimpleIOSuite:

  test("random.perft - part 361") {
    Perft
      .perfts(Perft.randomPerfts(361), Chess960)
      .map(assert(_))
  }
