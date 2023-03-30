import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests512 extends SimpleIOSuite:

  test("random.perft - part 512") {
    Perft
      .perfts(Perft.randomPerfts(512), Chess960)
      .map(assert(_))
  }
