import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests558 extends SimpleIOSuite:

  test("random.perft - part 558") {
    Perft
      .perfts(Perft.randomPerfts(558), Chess960)
      .map(assert(_))
  }
