import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests122 extends SimpleIOSuite:

  test("random.perft - part 122") {
    Perft
      .perfts(Perft.randomPerfts(122), Chess960)
      .map(assert(_))
  }
