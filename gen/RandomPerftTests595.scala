import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests595 extends SimpleIOSuite:

  test("random.perft - part 595") {
    Perft
      .perfts(Perft.randomPerfts(595), Chess960)
      .map(assert(_))
  }
