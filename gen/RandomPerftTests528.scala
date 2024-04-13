import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests528 extends SimpleIOSuite:

  test("random.perft - part 528") {
    Perft
      .perfts(Perft.randomPerfts(528), Chess960)
      .map(assert(_))
  }
