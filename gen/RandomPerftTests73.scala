import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests73 extends SimpleIOSuite:

  test("random.perft - part 73") {
    Perft
      .perfts(Perft.randomPerfts(73), Chess960)
      .map(assert(_))
  }
