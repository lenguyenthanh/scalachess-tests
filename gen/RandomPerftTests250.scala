package chess

import weaver.*
import chess.variant.*

object RandomPerftTests250 extends SimpleIOSuite:

  test("random.perft - part 250") {
    Perft
      .perfts(Perft.randomPerfts(250), Chess960)
      .map(assert(_))
  }
