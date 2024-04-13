import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests504 extends SimpleIOSuite:

  test("random.perft - part 504") {
    Perft
      .perfts(Perft.randomPerfts(504), Chess960)
      .map(assert(_))
  }
