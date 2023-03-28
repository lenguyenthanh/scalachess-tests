import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests353 extends SimpleIOSuite:

  test("random.perft - part 353") {
    Perft
      .perfts(Perft.randomPerfts(353), Chess960)
      .map(assert(_))
  }
