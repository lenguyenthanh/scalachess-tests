import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests36 extends SimpleIOSuite:

  test("random.perft - part 36") {
    Perft
      .perfts(Perft.randomPerfts(36), Chess960)
      .map(assert(_))
  }
