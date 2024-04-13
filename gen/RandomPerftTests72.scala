import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests72 extends SimpleIOSuite:

  test("random.perft - part 72") {
    Perft
      .perfts(Perft.randomPerfts(72), Chess960)
      .map(assert(_))
  }
