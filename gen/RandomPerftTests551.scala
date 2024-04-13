import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests551 extends SimpleIOSuite:

  test("random.perft - part 551") {
    Perft
      .perfts(Perft.randomPerfts(551), Chess960)
      .map(assert(_))
  }
