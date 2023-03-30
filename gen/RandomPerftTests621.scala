import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests621 extends SimpleIOSuite:

  test("random.perft - part 621") {
    Perft
      .perfts(Perft.randomPerfts(621), Chess960)
      .map(assert(_))
  }
