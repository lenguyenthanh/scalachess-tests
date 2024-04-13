import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests68 extends SimpleIOSuite:

  test("random.perft - part 68") {
    Perft
      .perfts(Perft.randomPerfts(68), Chess960)
      .map(assert(_))
  }
