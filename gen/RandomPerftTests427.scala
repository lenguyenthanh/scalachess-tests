import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests427 extends SimpleIOSuite:

  test("random.perft - part 427") {
    Perft
      .perfts(Perft.randomPerfts(427), Chess960)
      .map(assert(_))
  }
