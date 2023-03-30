import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests535 extends SimpleIOSuite:

  test("random.perft - part 535") {
    Perft
      .perfts(Perft.randomPerfts(535), Chess960)
      .map(assert(_))
  }
