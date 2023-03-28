import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests256 extends SimpleIOSuite:

  test("random.perft - part 256") {
    Perft
      .perfts(Perft.randomPerfts(256), Chess960)
      .map(assert(_))
  }
