import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests520 extends SimpleIOSuite:

  test("random.perft - part 520") {
    Perft
      .perfts(Perft.randomPerfts(520), Chess960)
      .map(assert(_))
  }
