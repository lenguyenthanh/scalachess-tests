import weaver.*

import chess.format.EpdFen
import chess.variant.*

object CommonTests extends SimpleIOSuite:

  pureTest("perft split") {
    expect(
      Perft.splitPerft("resources/random.perft", 16).flatten.toSet ==
        Perft.read("resources/random.perft").toSet
    )
  }
