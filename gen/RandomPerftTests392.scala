package chess

import weaver.*
import chess.variant.*

object RandomPerftTests392 extends SimpleIOSuite:

  test("random.perft - part 392") {
    Perft
      .perfts(Perft.randomPerfts(392), Chess960)
      .map(assert(_))
  }
