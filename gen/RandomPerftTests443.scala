import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests443 extends SimpleIOSuite:

  test("random.perft - part 443") {
    Perft
      .perfts(Perft.randomPerfts(443), Chess960)
      .map(assert(_))
  }
