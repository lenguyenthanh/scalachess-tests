package chess

import weaver.*
import chess.variant.*

object RandomPerftTests145 extends SimpleIOSuite:

  test("random.perft - part 145") {
    Perft
      .perfts(Perft.randomPerfts(145), Chess960)
      .map(assert(_))
  }
