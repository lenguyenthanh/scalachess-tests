package chess

import weaver.*
import chess.variant.*

object RandomPerftTests322 extends SimpleIOSuite:

  test("random.perft - part 322") {
    Perft
      .perfts(Perft.randomPerfts(322), Chess960)
      .map(assert(_))
  }
