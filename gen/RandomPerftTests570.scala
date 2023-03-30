import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests570 extends SimpleIOSuite:

  test("random.perft - part 570") {
    Perft
      .perfts(Perft.randomPerfts(570), Chess960)
      .map(assert(_))
  }
