package example

object Bug extends App {
  def foo0[F <: AnyKind]: F = null.asInstanceOf[F]
}
