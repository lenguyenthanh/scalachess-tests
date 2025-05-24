package chess

import weaver.*
import chess.variant.*

object RandomPerftTests320 extends SimpleIOSuite:

  test("random.perft - part 320") {
    Perft
      .perfts(Perft.randomPerfts(320), Chess960)
      .map(assert(_))
  }
