import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests479 extends SimpleIOSuite:

  test("random.perft - part 479") {
    Perft
      .perfts(Perft.randomPerfts(479), Chess960)
      .map(assert(_))
  }
