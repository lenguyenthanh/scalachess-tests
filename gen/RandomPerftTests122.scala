import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests122 extends SimpleIOSuite:

  test("random.perft - part 122") {
    Perft
      .perfts(Perft.randomPerfts(122), Chess960)
      .map(assert(_))
  }
