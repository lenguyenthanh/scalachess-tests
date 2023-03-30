import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests494 extends SimpleIOSuite:

  test("random.perft - part 494") {
    Perft
      .perfts(Perft.randomPerfts(494), Chess960)
      .map(assert(_))
  }
