import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests259 extends SimpleIOSuite:

  test("random.perft - part 259") {
    Perft
      .perfts(Perft.randomPerfts(259), Chess960)
      .map(assert(_))
  }
