import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests239 extends SimpleIOSuite:

  test("random.perft - part 239") {
    Perft
      .perfts(Perft.randomPerfts(239), Chess960)
      .map(assert(_))
  }
