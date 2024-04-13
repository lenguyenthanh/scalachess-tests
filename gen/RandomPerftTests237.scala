import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests237 extends SimpleIOSuite:

  test("random.perft - part 237") {
    Perft
      .perfts(Perft.randomPerfts(237), Chess960)
      .map(assert(_))
  }
