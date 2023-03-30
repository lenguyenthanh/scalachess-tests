import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests541 extends SimpleIOSuite:

  test("random.perft - part 541") {
    Perft
      .perfts(Perft.randomPerfts(541), Chess960)
      .map(assert(_))
  }
