import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests527 extends SimpleIOSuite:

  test("random.perft - part 527") {
    Perft
      .perfts(Perft.randomPerfts(527), Chess960)
      .map(assert(_))
  }
