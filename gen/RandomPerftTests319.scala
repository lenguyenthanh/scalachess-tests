import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests319 extends SimpleIOSuite:

  test("random.perft - part 319") {
    Perft
      .perfts(Perft.randomPerfts(319), Chess960)
      .map(assert(_))
  }
