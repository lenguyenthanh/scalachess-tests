import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests162 extends SimpleIOSuite:

  test("random.perft - part 162") {
    Perft
      .perfts(Perft.randomPerfts(162), Chess960)
      .map(assert(_))
  }
