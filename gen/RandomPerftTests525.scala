import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests525 extends SimpleIOSuite:

  test("random.perft - part 525") {
    Perft
      .perfts(Perft.randomPerfts(525), Chess960)
      .map(assert(_))
  }
