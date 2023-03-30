import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests507 extends SimpleIOSuite:

  test("random.perft - part 507") {
    Perft
      .perfts(Perft.randomPerfts(507), Chess960)
      .map(assert(_))
  }
