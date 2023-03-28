import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests267 extends SimpleIOSuite:

  test("random.perft - part 267") {
    Perft
      .perfts(Perft.randomPerfts(267), Chess960)
      .map(assert(_))
  }
