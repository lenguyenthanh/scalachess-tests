import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests620 extends SimpleIOSuite:

  test("random.perft - part 620") {
    Perft
      .perfts(Perft.randomPerfts(620), Chess960)
      .map(assert(_))
  }
