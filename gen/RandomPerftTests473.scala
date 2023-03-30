import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests473 extends SimpleIOSuite:

  test("random.perft - part 473") {
    Perft
      .perfts(Perft.randomPerfts(473), Chess960)
      .map(assert(_))
  }
