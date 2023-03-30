import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests597 extends SimpleIOSuite:

  test("random.perft - part 597") {
    Perft
      .perfts(Perft.randomPerfts(597), Chess960)
      .map(assert(_))
  }
