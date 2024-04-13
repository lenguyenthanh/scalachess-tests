import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests201 extends SimpleIOSuite:

  test("random.perft - part 201") {
    Perft
      .perfts(Perft.randomPerfts(201), Chess960)
      .map(assert(_))
  }
