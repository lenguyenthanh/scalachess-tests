package chess

import weaver.*
import chess.variant.*

object RandomPerftTests395 extends SimpleIOSuite:

  test("random.perft - part 395") {
    Perft
      .perfts(Perft.randomPerfts(395), Chess960)
      .map(assert(_))
  }
