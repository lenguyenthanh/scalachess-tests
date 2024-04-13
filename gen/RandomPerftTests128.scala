import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests128 extends SimpleIOSuite:

  test("random.perft - part 128") {
    Perft
      .perfts(Perft.randomPerfts(128), Chess960)
      .map(assert(_))
  }
