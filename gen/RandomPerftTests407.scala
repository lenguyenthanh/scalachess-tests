import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests407 extends SimpleIOSuite:

  test("random.perft - part 407") {
    Perft
      .perfts(Perft.randomPerfts(407), Chess960)
      .map(assert(_))
  }
