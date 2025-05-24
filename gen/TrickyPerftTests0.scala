package chess

import weaver.*
import chess.variant.*

object TrickyPerftTests0 extends SimpleIOSuite:

  test("tricky - part 0") {
    Perft
      .perfts(Perft.chess960(0), Chess960)
      .map(assert(_))
  }
