import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests506 extends SimpleIOSuite:

  test("random.perft - part 506") {
    Perft
      .perfts(Perft.randomPerfts(506), Chess960)
      .map(assert(_))
  }
