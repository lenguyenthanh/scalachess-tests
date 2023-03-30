import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests528 extends SimpleIOSuite:

  test("random.perft - part 528") {
    Perft
      .perfts(Perft.randomPerfts(528), Chess960)
      .map(assert(_))
  }
