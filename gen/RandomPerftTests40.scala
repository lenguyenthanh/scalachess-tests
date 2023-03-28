import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests40 extends SimpleIOSuite:

  test("random.perft - part 40") {
    Perft
      .perfts(Perft.randomPerfts(40), Chess960)
      .map(assert(_))
  }
