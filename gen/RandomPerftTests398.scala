package chess

import weaver.*
import chess.variant.*

object RandomPerftTests398 extends SimpleIOSuite:

  test("random.perft - part 398") {
    Perft
      .perfts(Perft.randomPerfts(398), Chess960)
      .map(assert(_))
  }
