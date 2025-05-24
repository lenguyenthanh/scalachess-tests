package chess

import weaver.*
import chess.variant.*

object RandomPerftTests104 extends SimpleIOSuite:

  test("random.perft - part 104") {
    Perft
      .perfts(Perft.randomPerfts(104), Chess960)
      .map(assert(_))
  }
