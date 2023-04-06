val gen = "gen"

object Gen:

  import Perft.*
  def main(args: Array[String]): Unit =
    cleanup()
    write(os.pwd / ".github" / "workflows" / "insufficient.yml", prejob("insufficient", insufficient))
    write(os.pwd / ".github" / "workflows" / "variant.yml", prejob("variant", variant))
    genRandomTests()
    genChess960Tests()
    genTrickyTests()

  private def cleanup(): Unit =
    os.remove.all(os.pwd / ".github" / "workflows")
    os.remove.all(os.pwd / gen)

  def genRandomTests(): Unit =
    val size = 6838 / randomSplit
    (0 to size).foreach(genRandomTests)

  def genChess960Tests(): Unit =
    val size = 960 / chess960Split
    (0 to size).foreach(genChess960Tests)

  def genTrickyTests(): Unit =
    (0 to 1).foreach(genTrickyTests)

  private def genRandomTests(i: Int): Unit =
    val scala     = randomScala(i)
    val scalaPath = os.pwd / gen / s"RandomPerftTests$i.scala"
    write(scalaPath, scala)
    val ci     = randomCi(i)
    val ciPath = os.pwd / ".github" / "workflows" / s"random-perft-$i.yml"
    write(ciPath, ci)

  private def genChess960Tests(i: Int): Unit =
    val scala     = chess960Scala(i)
    val scalaPath = os.pwd / gen / s"Chess960PerftTests$i.scala"
    write(scalaPath, scala)
    val ci     = chess960Ci(i)
    val ciPath = os.pwd / ".github" / "workflows" / s"chess960-perft-$i.yml"
    write(ciPath, ci)

  private def genTrickyTests(i: Int): Unit =
    val scala     = trickyScala(i)
    val scalaPath = os.pwd / gen / s"TrickyPerftTests$i.scala"
    write(scalaPath, scala)
    val ci     = trickyCi(i)
    val ciPath = os.pwd / ".github" / "workflows" / s"tricky-perft-$i.yml"
    write(ciPath, ci)

  private def write(path: os.Path, content: String): Unit =
    os.write(path, content, createFolders = true)

def prejob(name: String, job: String) = s"""
name: $name
on:
  push:
    branches:
    - main
  pull_request:

jobs:
$job
""".strip

val insufficient = """
  hord-insufficient-material:
    runs-on: "ubuntu-latest"
    steps:
    - uses: actions/checkout@v3
      with:
        fetch-depth: 0
    - uses: coursier/cache-action@v6
    - uses: VirtusLab/scala-cli-setup@main
    - name: Test
      run: scala-cli test HordeInsufficientMaterialTests.scala Common.scala project.scala
"""

val variant = """
  variant:
    runs-on: "ubuntu-latest"
    steps:
    - uses: actions/checkout@v3
      with:
        fetch-depth: 0
    - uses: coursier/cache-action@v6
    - uses: VirtusLab/scala-cli-setup@main
    - name: Test
      run: scala-cli test VariantPerftTests.scala Common.scala project.scala
"""

def randomScala(i: Int) = s"""
import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests$i extends SimpleIOSuite:

  test("random.perft - part $i") {
    Perft
      .perfts(Perft.randomPerfts($i), Chess960)
      .map(assert(_))
  }
""".stripLeading()

def randomCi(i: Int) =
  val name = s"random-perft-$i"
  val ci = s"""
  random-perft-$i:
    runs-on: "ubuntu-latest"
    steps:
    - uses: actions/checkout@v3
      with:
        fetch-depth: 0
    - uses: coursier/cache-action@v6
    - uses: VirtusLab/scala-cli-setup@main
    - name: Test
      run: scala-cli test gen/RandomPerftTests$i.scala Common.scala project.scala
"""
  prejob(name, ci)

def chess960Scala(i: Int) = s"""
import weaver.*

import chess.format.EpdFen
import chess.variant.*

object Chess960PerftTests$i extends SimpleIOSuite:

  test("chess960 - part $i") {
    Perft
      .perfts(Perft.chess960($i), Chess960)
      .map(assert(_))
  }
""".stripLeading()

def chess960Ci(i: Int) =
  val name = s"chess960-perft-$i"
  val ci = s"""
  chess960-perft-$i:
    runs-on: "ubuntu-latest"
    steps:
    - uses: actions/checkout@v3
      with:
        fetch-depth: 0
    - uses: coursier/cache-action@v6
    - uses: VirtusLab/scala-cli-setup@main
    - name: Test
      run: scala-cli test gen/Chess960PerftTests$i.scala Common.scala project.scala
"""
  prejob(name, ci)

def trickyScala(i: Int) = s"""
import weaver.*

import chess.format.EpdFen
import chess.variant.*

object TrickyPerftTests$i extends SimpleIOSuite:

  test("tricky - part $i") {
    Perft
      .perfts(Perft.chess960($i), Chess960)
      .map(assert(_))
  }
""".stripLeading()

def trickyCi(i: Int) =
  val name = s"tricky-perft-$i"
  val ci = s"""
  tricky-perft-$i:
    runs-on: "ubuntu-latest"
    steps:
    - uses: actions/checkout@v3
      with:
        fetch-depth: 0
    - uses: coursier/cache-action@v6
    - uses: VirtusLab/scala-cli-setup@main
    - name: Test
      run: scala-cli test gen/TrickyPerftTests$i.scala Common.scala project.scala
"""
  prejob(name, ci)
