import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests308 extends SimpleIOSuite:

  test("random.perft - part 308") {
    Perft
      .perfts(Perft.randomPerfts(308), Chess960)
      .map(assert(_))
  }
