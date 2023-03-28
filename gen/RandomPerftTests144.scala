import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests144 extends SimpleIOSuite:

  test("random.perft - part 144") {
    Perft
      .perfts(Perft.randomPerfts(144), Chess960)
      .map(assert(_))
  }
