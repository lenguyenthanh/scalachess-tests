package chess

import weaver.*
import chess.variant.*

object RandomPerftTests444 extends SimpleIOSuite:

  test("random.perft - part 444") {
    Perft
      .perfts(Perft.randomPerfts(444), Chess960)
      .map(assert(_))
  }
