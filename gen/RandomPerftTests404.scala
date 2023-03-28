import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests404 extends SimpleIOSuite:

  test("random.perft - part 404") {
    Perft
      .perfts(Perft.randomPerfts(404), Chess960)
      .map(assert(_))
  }
