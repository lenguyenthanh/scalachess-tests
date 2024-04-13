import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests418 extends SimpleIOSuite:

  test("random.perft - part 418") {
    Perft
      .perfts(Perft.randomPerfts(418), Chess960)
      .map(assert(_))
  }
