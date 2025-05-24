package chess

import weaver.*
import chess.variant.*

object RandomPerftTests321 extends SimpleIOSuite:

  test("random.perft - part 321") {
    Perft
      .perfts(Perft.randomPerfts(321), Chess960)
      .map(assert(_))
  }
