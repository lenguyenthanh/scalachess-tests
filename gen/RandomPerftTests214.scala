package chess

import weaver.*
import chess.variant.*

object RandomPerftTests214 extends SimpleIOSuite:

  test("random.perft - part 214") {
    Perft
      .perfts(Perft.randomPerfts(214), Chess960)
      .map(assert(_))
  }
