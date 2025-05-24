package chess

import weaver.*
import chess.variant.*

object RandomPerftTests344 extends SimpleIOSuite:

  test("random.perft - part 344") {
    Perft
      .perfts(Perft.randomPerfts(344), Chess960)
      .map(assert(_))
  }
