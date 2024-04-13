import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests34 extends SimpleIOSuite:

  test("random.perft - part 34") {
    Perft
      .perfts(Perft.randomPerfts(34), Chess960)
      .map(assert(_))
  }
