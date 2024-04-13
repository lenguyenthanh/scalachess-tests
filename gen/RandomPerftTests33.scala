import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests33 extends SimpleIOSuite:

  test("random.perft - part 33") {
    Perft
      .perfts(Perft.randomPerfts(33), Chess960)
      .map(assert(_))
  }
