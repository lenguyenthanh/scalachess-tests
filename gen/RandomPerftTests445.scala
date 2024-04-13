import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests445 extends SimpleIOSuite:

  test("random.perft - part 445") {
    Perft
      .perfts(Perft.randomPerfts(445), Chess960)
      .map(assert(_))
  }
