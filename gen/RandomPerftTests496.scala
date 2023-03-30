import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests496 extends SimpleIOSuite:

  test("random.perft - part 496") {
    Perft
      .perfts(Perft.randomPerfts(496), Chess960)
      .map(assert(_))
  }
