package chess

import weaver.*
import chess.variant.*

object RandomPerftTests62 extends SimpleIOSuite:

  test("random.perft - part 62") {
    Perft
      .perfts(Perft.randomPerfts(62), Chess960)
      .map(assert(_))
  }
