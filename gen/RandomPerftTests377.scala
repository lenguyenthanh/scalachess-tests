import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests377 extends SimpleIOSuite:

  test("random.perft - part 377") {
    Perft
      .perfts(Perft.randomPerfts(377), Chess960)
      .map(assert(_))
  }
