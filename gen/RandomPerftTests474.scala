import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests474 extends SimpleIOSuite:

  test("random.perft - part 474") {
    Perft
      .perfts(Perft.randomPerfts(474), Chess960)
      .map(assert(_))
  }
