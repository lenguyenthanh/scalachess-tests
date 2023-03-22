import cats.kernel.Monoid

object Common:
  given Monoid[Boolean] with
    def empty                           = true
    def combine(x: Boolean, y: Boolean) = x && y
