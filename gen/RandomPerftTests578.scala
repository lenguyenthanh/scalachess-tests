import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests578 extends SimpleIOSuite:

  test("random.perft - part 578") {
    Perft
      .perfts(Perft.randomPerfts(578), Chess960)
      .map(assert(_))
  }
