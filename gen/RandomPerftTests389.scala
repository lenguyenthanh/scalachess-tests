import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests389 extends SimpleIOSuite:

  test("random.perft - part 389") {
    Perft
      .perfts(Perft.randomPerfts(389), Chess960)
      .map(assert(_))
  }
