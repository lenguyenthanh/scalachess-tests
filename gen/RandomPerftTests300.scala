import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests300 extends SimpleIOSuite:

  test("random.perft - part 300") {
    Perft
      .perfts(Perft.randomPerfts(300), Chess960)
      .map(assert(_))
  }
