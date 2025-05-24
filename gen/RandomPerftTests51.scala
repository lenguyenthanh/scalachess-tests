package chess

import weaver.*
import chess.variant.*

object RandomPerftTests51 extends SimpleIOSuite:

  test("random.perft - part 51") {
    Perft
      .perfts(Perft.randomPerfts(51), Chess960)
      .map(assert(_))
  }
