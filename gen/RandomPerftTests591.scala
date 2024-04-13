import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests591 extends SimpleIOSuite:

  test("random.perft - part 591") {
    Perft
      .perfts(Perft.randomPerfts(591), Chess960)
      .map(assert(_))
  }
