import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests188 extends SimpleIOSuite:

  test("random.perft - part 188") {
    Perft
      .perfts(Perft.randomPerfts(188), Chess960)
      .map(assert(_))
  }
