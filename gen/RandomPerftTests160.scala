package chess

import weaver.*
import chess.variant.*

object RandomPerftTests160 extends SimpleIOSuite:

  test("random.perft - part 160") {
    Perft
      .perfts(Perft.randomPerfts(160), Chess960)
      .map(assert(_))
  }
