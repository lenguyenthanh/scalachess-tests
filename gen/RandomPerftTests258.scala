import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests258 extends SimpleIOSuite:

  test("random.perft - part 258") {
    Perft
      .perfts(Perft.randomPerfts(258), Chess960)
      .map(assert(_))
  }
