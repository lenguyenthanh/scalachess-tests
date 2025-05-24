package chess

import weaver.*
import chess.variant.*

object RandomPerftTests295 extends SimpleIOSuite:

  test("random.perft - part 295") {
    Perft
      .perfts(Perft.randomPerfts(295), Chess960)
      .map(assert(_))
  }
