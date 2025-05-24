package chess

import weaver.*
import chess.variant.*

object RandomPerftTests433 extends SimpleIOSuite:

  test("random.perft - part 433") {
    Perft
      .perfts(Perft.randomPerfts(433), Chess960)
      .map(assert(_))
  }
