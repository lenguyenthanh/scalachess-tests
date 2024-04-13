import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests221 extends SimpleIOSuite:

  test("random.perft - part 221") {
    Perft
      .perfts(Perft.randomPerfts(221), Chess960)
      .map(assert(_))
  }
