package chess

import weaver.*
import chess.variant.*

object RandomPerftTests423 extends SimpleIOSuite:

  test("random.perft - part 423") {
    Perft
      .perfts(Perft.randomPerfts(423), Chess960)
      .map(assert(_))
  }
