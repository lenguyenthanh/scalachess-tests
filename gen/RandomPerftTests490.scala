import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests490 extends SimpleIOSuite:

  test("random.perft - part 490") {
    Perft
      .perfts(Perft.randomPerfts(490), Chess960)
      .map(assert(_))
  }
