import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests317 extends SimpleIOSuite:

  test("random.perft - part 317") {
    Perft
      .perfts(Perft.randomPerfts(317), Chess960)
      .map(assert(_))
  }
