import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests471 extends SimpleIOSuite:

  test("random.perft - part 471") {
    Perft
      .perfts(Perft.randomPerfts(471), Chess960)
      .map(assert(_))
  }
