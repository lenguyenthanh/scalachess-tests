import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests440 extends SimpleIOSuite:

  test("random.perft - part 440") {
    Perft
      .perfts(Perft.randomPerfts(440), Chess960)
      .map(assert(_))
  }
