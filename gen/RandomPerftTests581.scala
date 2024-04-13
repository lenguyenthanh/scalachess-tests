import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests581 extends SimpleIOSuite:

  test("random.perft - part 581") {
    Perft
      .perfts(Perft.randomPerfts(581), Chess960)
      .map(assert(_))
  }
