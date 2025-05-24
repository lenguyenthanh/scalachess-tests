package chess

import weaver.*
import chess.variant.*

object RandomPerftTests417 extends SimpleIOSuite:

  test("random.perft - part 417") {
    Perft
      .perfts(Perft.randomPerfts(417), Chess960)
      .map(assert(_))
  }
