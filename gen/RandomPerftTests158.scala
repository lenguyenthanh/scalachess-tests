import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests158 extends SimpleIOSuite:

  test("random.perft - part 158") {
    Perft
      .perfts(Perft.randomPerfts(158), Chess960)
      .map(assert(_))
  }
