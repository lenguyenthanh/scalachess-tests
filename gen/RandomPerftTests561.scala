import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests561 extends SimpleIOSuite:

  test("random.perft - part 561") {
    Perft
      .perfts(Perft.randomPerfts(561), Chess960)
      .map(assert(_))
  }
