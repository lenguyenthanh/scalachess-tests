import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests82 extends SimpleIOSuite:

  test("random.perft - part 82") {
    Perft
      .perfts(Perft.randomPerfts(82), Chess960)
      .map(assert(_))
  }
