import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests586 extends SimpleIOSuite:

  test("random.perft - part 586") {
    Perft
      .perfts(Perft.randomPerfts(586), Chess960)
      .map(assert(_))
  }
