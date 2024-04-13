import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests531 extends SimpleIOSuite:

  test("random.perft - part 531") {
    Perft
      .perfts(Perft.randomPerfts(531), Chess960)
      .map(assert(_))
  }
