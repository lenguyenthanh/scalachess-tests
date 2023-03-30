import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests491 extends SimpleIOSuite:

  test("random.perft - part 491") {
    Perft
      .perfts(Perft.randomPerfts(491), Chess960)
      .map(assert(_))
  }
