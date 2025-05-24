package chess

import weaver.*
import chess.variant.*

object RandomPerftTests435 extends SimpleIOSuite:

  test("random.perft - part 435") {
    Perft
      .perfts(Perft.randomPerfts(435), Chess960)
      .map(assert(_))
  }
