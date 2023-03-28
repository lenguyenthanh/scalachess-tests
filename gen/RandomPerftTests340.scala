import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests340 extends SimpleIOSuite:

  test("random.perft - part 340") {
    Perft
      .perfts(Perft.randomPerfts(340), Chess960)
      .map(assert(_))
  }
