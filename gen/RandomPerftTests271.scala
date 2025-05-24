package chess

import weaver.*
import chess.variant.*

object RandomPerftTests271 extends SimpleIOSuite:

  test("random.perft - part 271") {
    Perft
      .perfts(Perft.randomPerfts(271), Chess960)
      .map(assert(_))
  }
