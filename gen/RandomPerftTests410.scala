package chess

import weaver.*
import chess.variant.*

object RandomPerftTests410 extends SimpleIOSuite:

  test("random.perft - part 410") {
    Perft
      .perfts(Perft.randomPerfts(410), Chess960)
      .map(assert(_))
  }
