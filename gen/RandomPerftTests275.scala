import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests275 extends SimpleIOSuite:

  test("random.perft - part 275") {
    Perft
      .perfts(Perft.randomPerfts(275), Chess960)
      .map(assert(_))
  }
