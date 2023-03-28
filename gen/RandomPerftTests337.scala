import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests337 extends SimpleIOSuite:

  test("random.perft - part 337") {
    Perft
      .perfts(Perft.randomPerfts(337), Chess960)
      .map(assert(_))
  }
