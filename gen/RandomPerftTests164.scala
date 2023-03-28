import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests164 extends SimpleIOSuite:

  test("random.perft - part 164") {
    Perft
      .perfts(Perft.randomPerfts(164), Chess960)
      .map(assert(_))
  }
