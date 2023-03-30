import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests552 extends SimpleIOSuite:

  test("random.perft - part 552") {
    Perft
      .perfts(Perft.randomPerfts(552), Chess960)
      .map(assert(_))
  }
