import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests585 extends SimpleIOSuite:

  test("random.perft - part 585") {
    Perft
      .perfts(Perft.randomPerfts(585), Chess960)
      .map(assert(_))
  }
