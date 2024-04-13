import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests303 extends SimpleIOSuite:

  test("random.perft - part 303") {
    Perft
      .perfts(Perft.randomPerfts(303), Chess960)
      .map(assert(_))
  }
