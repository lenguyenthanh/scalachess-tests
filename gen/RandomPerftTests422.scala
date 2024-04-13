import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests422 extends SimpleIOSuite:

  test("random.perft - part 422") {
    Perft
      .perfts(Perft.randomPerfts(422), Chess960)
      .map(assert(_))
  }
