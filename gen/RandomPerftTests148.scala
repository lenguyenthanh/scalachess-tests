package chess

import weaver.*
import chess.variant.*

object RandomPerftTests148 extends SimpleIOSuite:

  test("random.perft - part 148") {
    Perft
      .perfts(Perft.randomPerfts(148), Chess960)
      .map(assert(_))
  }
