import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests464 extends SimpleIOSuite:

  test("random.perft - part 464") {
    Perft
      .perfts(Perft.randomPerfts(464), Chess960)
      .map(assert(_))
  }
