import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests402 extends SimpleIOSuite:

  test("random.perft - part 402") {
    Perft
      .perfts(Perft.randomPerfts(402), Chess960)
      .map(assert(_))
  }
