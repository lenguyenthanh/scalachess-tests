import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests579 extends SimpleIOSuite:

  test("random.perft - part 579") {
    Perft
      .perfts(Perft.randomPerfts(579), Chess960)
      .map(assert(_))
  }
