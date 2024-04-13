import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests523 extends SimpleIOSuite:

  test("random.perft - part 523") {
    Perft
      .perfts(Perft.randomPerfts(523), Chess960)
      .map(assert(_))
  }
