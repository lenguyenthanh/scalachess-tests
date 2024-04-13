import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests405 extends SimpleIOSuite:

  test("random.perft - part 405") {
    Perft
      .perfts(Perft.randomPerfts(405), Chess960)
      .map(assert(_))
  }
