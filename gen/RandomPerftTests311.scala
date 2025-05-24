package chess

import weaver.*
import chess.variant.*

object RandomPerftTests311 extends SimpleIOSuite:

  test("random.perft - part 311") {
    Perft
      .perfts(Perft.randomPerfts(311), Chess960)
      .map(assert(_))
  }
