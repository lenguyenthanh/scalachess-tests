import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests147 extends SimpleIOSuite:

  test("random.perft - part 147") {
    Perft
      .perfts(Perft.randomPerfts(147), Chess960)
      .map(assert(_))
  }
