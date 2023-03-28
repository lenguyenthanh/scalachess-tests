import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests409 extends SimpleIOSuite:

  test("random.perft - part 409") {
    Perft
      .perfts(Perft.randomPerfts(409), Chess960)
      .map(assert(_))
  }
