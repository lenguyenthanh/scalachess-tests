import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests313 extends SimpleIOSuite:

  test("random.perft - part 313") {
    Perft
      .perfts(Perft.randomPerfts(313), Chess960)
      .map(assert(_))
  }
