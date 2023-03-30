import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests475 extends SimpleIOSuite:

  test("random.perft - part 475") {
    Perft
      .perfts(Perft.randomPerfts(475), Chess960)
      .map(assert(_))
  }
