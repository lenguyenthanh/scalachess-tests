import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests130 extends SimpleIOSuite:

  test("random.perft - part 130") {
    Perft
      .perfts(Perft.randomPerfts(130), Chess960)
      .map(assert(_))
  }
