import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests572 extends SimpleIOSuite:

  test("random.perft - part 572") {
    Perft
      .perfts(Perft.randomPerfts(572), Chess960)
      .map(assert(_))
  }
