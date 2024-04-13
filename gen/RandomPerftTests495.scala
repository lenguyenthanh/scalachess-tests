import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests495 extends SimpleIOSuite:

  test("random.perft - part 495") {
    Perft
      .perfts(Perft.randomPerfts(495), Chess960)
      .map(assert(_))
  }
