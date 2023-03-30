import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests592 extends SimpleIOSuite:

  test("random.perft - part 592") {
    Perft
      .perfts(Perft.randomPerfts(592), Chess960)
      .map(assert(_))
  }
