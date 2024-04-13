import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests380 extends SimpleIOSuite:

  test("random.perft - part 380") {
    Perft
      .perfts(Perft.randomPerfts(380), Chess960)
      .map(assert(_))
  }
