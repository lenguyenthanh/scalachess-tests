import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests582 extends SimpleIOSuite:

  test("random.perft - part 582") {
    Perft
      .perfts(Perft.randomPerfts(582), Chess960)
      .map(assert(_))
  }
