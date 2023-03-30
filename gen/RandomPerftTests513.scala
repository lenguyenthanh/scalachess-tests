import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests513 extends SimpleIOSuite:

  test("random.perft - part 513") {
    Perft
      .perfts(Perft.randomPerfts(513), Chess960)
      .map(assert(_))
  }
