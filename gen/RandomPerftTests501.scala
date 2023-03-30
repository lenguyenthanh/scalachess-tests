import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests501 extends SimpleIOSuite:

  test("random.perft - part 501") {
    Perft
      .perfts(Perft.randomPerfts(501), Chess960)
      .map(assert(_))
  }
