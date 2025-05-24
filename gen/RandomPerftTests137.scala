package chess

import weaver.*
import chess.variant.*

object RandomPerftTests137 extends SimpleIOSuite:

  test("random.perft - part 137") {
    Perft
      .perfts(Perft.randomPerfts(137), Chess960)
      .map(assert(_))
  }
