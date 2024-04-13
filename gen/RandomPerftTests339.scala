import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests339 extends SimpleIOSuite:

  test("random.perft - part 339") {
    Perft
      .perfts(Perft.randomPerfts(339), Chess960)
      .map(assert(_))
  }
