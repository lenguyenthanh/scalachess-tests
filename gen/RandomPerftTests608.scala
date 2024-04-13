import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests608 extends SimpleIOSuite:

  test("random.perft - part 608") {
    Perft
      .perfts(Perft.randomPerfts(608), Chess960)
      .map(assert(_))
  }
