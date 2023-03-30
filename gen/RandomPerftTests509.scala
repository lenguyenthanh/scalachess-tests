import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests509 extends SimpleIOSuite:

  test("random.perft - part 509") {
    Perft
      .perfts(Perft.randomPerfts(509), Chess960)
      .map(assert(_))
  }
