import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests502 extends SimpleIOSuite:

  test("random.perft - part 502") {
    Perft
      .perfts(Perft.randomPerfts(502), Chess960)
      .map(assert(_))
  }
