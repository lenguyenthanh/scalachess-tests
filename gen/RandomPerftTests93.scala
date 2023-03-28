import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests93 extends SimpleIOSuite:

  test("random.perft - part 93") {
    Perft
      .perfts(Perft.randomPerfts(93), Chess960)
      .map(assert(_))
  }
