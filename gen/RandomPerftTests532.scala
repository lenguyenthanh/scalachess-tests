import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests532 extends SimpleIOSuite:

  test("random.perft - part 532") {
    Perft
      .perfts(Perft.randomPerfts(532), Chess960)
      .map(assert(_))
  }
