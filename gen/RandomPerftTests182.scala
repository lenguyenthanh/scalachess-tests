package chess

import weaver.*
import chess.variant.*

object RandomPerftTests182 extends SimpleIOSuite:

  test("random.perft - part 182") {
    Perft
      .perfts(Perft.randomPerfts(182), Chess960)
      .map(assert(_))
  }
