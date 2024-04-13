import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests413 extends SimpleIOSuite:

  test("random.perft - part 413") {
    Perft
      .perfts(Perft.randomPerfts(413), Chess960)
      .map(assert(_))
  }
