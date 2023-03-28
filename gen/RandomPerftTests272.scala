import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests272 extends SimpleIOSuite:

  test("random.perft - part 272") {
    Perft
      .perfts(Perft.randomPerfts(272), Chess960)
      .map(assert(_))
  }
