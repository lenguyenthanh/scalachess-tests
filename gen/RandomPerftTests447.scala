import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests447 extends SimpleIOSuite:

  test("random.perft - part 447") {
    Perft
      .perfts(Perft.randomPerfts(447), Chess960)
      .map(assert(_))
  }
