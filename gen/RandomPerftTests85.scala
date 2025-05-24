package chess

import weaver.*
import chess.variant.*

object RandomPerftTests85 extends SimpleIOSuite:

  test("random.perft - part 85") {
    Perft
      .perfts(Perft.randomPerfts(85), Chess960)
      .map(assert(_))
  }
