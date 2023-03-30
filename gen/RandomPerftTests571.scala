import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests571 extends SimpleIOSuite:

  test("random.perft - part 571") {
    Perft
      .perfts(Perft.randomPerfts(571), Chess960)
      .map(assert(_))
  }
