import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests261 extends SimpleIOSuite:

  test("random.perft - part 261") {
    Perft
      .perfts(Perft.randomPerfts(261), Chess960)
      .map(assert(_))
  }
