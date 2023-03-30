import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests568 extends SimpleIOSuite:

  test("random.perft - part 568") {
    Perft
      .perfts(Perft.randomPerfts(568), Chess960)
      .map(assert(_))
  }
