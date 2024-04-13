import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests615 extends SimpleIOSuite:

  test("random.perft - part 615") {
    Perft
      .perfts(Perft.randomPerfts(615), Chess960)
      .map(assert(_))
  }
