import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests548 extends SimpleIOSuite:

  test("random.perft - part 548") {
    Perft
      .perfts(Perft.randomPerfts(548), Chess960)
      .map(assert(_))
  }
