import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests98 extends SimpleIOSuite:

  test("random.perft - part 98") {
    Perft
      .perfts(Perft.randomPerfts(98), Chess960)
      .map(assert(_))
  }
