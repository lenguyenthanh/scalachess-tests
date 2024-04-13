import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests113 extends SimpleIOSuite:

  test("random.perft - part 113") {
    Perft
      .perfts(Perft.randomPerfts(113), Chess960)
      .map(assert(_))
  }
