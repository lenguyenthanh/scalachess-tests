import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests605 extends SimpleIOSuite:

  test("random.perft - part 605") {
    Perft
      .perfts(Perft.randomPerfts(605), Chess960)
      .map(assert(_))
  }
