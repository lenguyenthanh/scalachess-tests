import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests227 extends SimpleIOSuite:

  test("random.perft - part 227") {
    Perft
      .perfts(Perft.randomPerfts(227), Chess960)
      .map(assert(_))
  }
