import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests384 extends SimpleIOSuite:

  test("random.perft - part 384") {
    Perft
      .perfts(Perft.randomPerfts(384), Chess960)
      .map(assert(_))
  }
