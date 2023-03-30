import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests452 extends SimpleIOSuite:

  test("random.perft - part 452") {
    Perft
      .perfts(Perft.randomPerfts(452), Chess960)
      .map(assert(_))
  }
