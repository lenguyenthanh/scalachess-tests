import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests241 extends SimpleIOSuite:

  test("random.perft - part 241") {
    Perft
      .perfts(Perft.randomPerfts(241), Chess960)
      .map(assert(_))
  }
