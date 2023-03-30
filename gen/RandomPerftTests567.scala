import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests567 extends SimpleIOSuite:

  test("random.perft - part 567") {
    Perft
      .perfts(Perft.randomPerfts(567), Chess960)
      .map(assert(_))
  }
