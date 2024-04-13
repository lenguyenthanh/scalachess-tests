import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests281 extends SimpleIOSuite:

  test("random.perft - part 281") {
    Perft
      .perfts(Perft.randomPerfts(281), Chess960)
      .map(assert(_))
  }
