import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests594 extends SimpleIOSuite:

  test("random.perft - part 594") {
    Perft
      .perfts(Perft.randomPerfts(594), Chess960)
      .map(assert(_))
  }
