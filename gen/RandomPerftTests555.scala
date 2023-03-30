import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests555 extends SimpleIOSuite:

  test("random.perft - part 555") {
    Perft
      .perfts(Perft.randomPerfts(555), Chess960)
      .map(assert(_))
  }
