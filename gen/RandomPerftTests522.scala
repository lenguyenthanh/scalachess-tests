import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests522 extends SimpleIOSuite:

  test("random.perft - part 522") {
    Perft
      .perfts(Perft.randomPerfts(522), Chess960)
      .map(assert(_))
  }
