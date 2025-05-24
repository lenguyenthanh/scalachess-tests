package chess

import weaver.*
import chess.variant.*

object RandomPerftTests343 extends SimpleIOSuite:

  test("random.perft - part 343") {
    Perft
      .perfts(Perft.randomPerfts(343), Chess960)
      .map(assert(_))
  }
