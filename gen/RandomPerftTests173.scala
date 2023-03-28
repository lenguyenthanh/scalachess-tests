import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests173 extends SimpleIOSuite:

  test("random.perft - part 173") {
    Perft
      .perfts(Perft.randomPerfts(173), Chess960)
      .map(assert(_))
  }
