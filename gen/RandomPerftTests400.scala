import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests400 extends SimpleIOSuite:

  test("random.perft - part 400") {
    Perft
      .perfts(Perft.randomPerfts(400), Chess960)
      .map(assert(_))
  }
