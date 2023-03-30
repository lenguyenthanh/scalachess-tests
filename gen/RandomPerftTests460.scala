import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests460 extends SimpleIOSuite:

  test("random.perft - part 460") {
    Perft
      .perfts(Perft.randomPerfts(460), Chess960)
      .map(assert(_))
  }
