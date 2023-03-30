import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests559 extends SimpleIOSuite:

  test("random.perft - part 559") {
    Perft
      .perfts(Perft.randomPerfts(559), Chess960)
      .map(assert(_))
  }
