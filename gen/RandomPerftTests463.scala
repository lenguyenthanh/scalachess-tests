import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests463 extends SimpleIOSuite:

  test("random.perft - part 463") {
    Perft
      .perfts(Perft.randomPerfts(463), Chess960)
      .map(assert(_))
  }
