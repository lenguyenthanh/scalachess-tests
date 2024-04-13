import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests403 extends SimpleIOSuite:

  test("random.perft - part 403") {
    Perft
      .perfts(Perft.randomPerfts(403), Chess960)
      .map(assert(_))
  }
