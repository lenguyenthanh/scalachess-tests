import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests537 extends SimpleIOSuite:

  test("random.perft - part 537") {
    Perft
      .perfts(Perft.randomPerfts(537), Chess960)
      .map(assert(_))
  }
