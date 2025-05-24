package chess

import weaver.*
import chess.variant.*

object RandomPerftTests97 extends SimpleIOSuite:

  test("random.perft - part 97") {
    Perft
      .perfts(Perft.randomPerfts(97), Chess960)
      .map(assert(_))
  }
