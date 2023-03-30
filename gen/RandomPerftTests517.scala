import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests517 extends SimpleIOSuite:

  test("random.perft - part 517") {
    Perft
      .perfts(Perft.randomPerfts(517), Chess960)
      .map(assert(_))
  }
