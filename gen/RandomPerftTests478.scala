import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests478 extends SimpleIOSuite:

  test("random.perft - part 478") {
    Perft
      .perfts(Perft.randomPerfts(478), Chess960)
      .map(assert(_))
  }
