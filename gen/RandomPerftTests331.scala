import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests331 extends SimpleIOSuite:

  test("random.perft - part 331") {
    Perft
      .perfts(Perft.randomPerfts(331), Chess960)
      .map(assert(_))
  }
