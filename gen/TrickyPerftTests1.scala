package chess

import weaver.*
import chess.variant.*

object TrickyPerftTests1 extends SimpleIOSuite:

  test("tricky - part 1") {
    Perft
      .perfts(Perft.chess960(1), Chess960)
      .map(assert(_))
  }
