import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests349 extends SimpleIOSuite:

  test("random.perft - part 349") {
    Perft
      .perfts(Perft.randomPerfts(349), Chess960)
      .map(assert(_))
  }
