package chess

import weaver.*
import chess.variant.*

object RandomPerftTests83 extends SimpleIOSuite:

  test("random.perft - part 83") {
    Perft
      .perfts(Perft.randomPerfts(83), Chess960)
      .map(assert(_))
  }
