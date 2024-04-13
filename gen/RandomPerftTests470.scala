import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests470 extends SimpleIOSuite:

  test("random.perft - part 470") {
    Perft
      .perfts(Perft.randomPerfts(470), Chess960)
      .map(assert(_))
  }
