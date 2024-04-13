import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests530 extends SimpleIOSuite:

  test("random.perft - part 530") {
    Perft
      .perfts(Perft.randomPerfts(530), Chess960)
      .map(assert(_))
  }
