import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests514 extends SimpleIOSuite:

  test("random.perft - part 514") {
    Perft
      .perfts(Perft.randomPerfts(514), Chess960)
      .map(assert(_))
  }
