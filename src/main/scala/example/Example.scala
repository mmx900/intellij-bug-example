package example

import scala.language.implicitConversions

import org.scalajs.dom._

class Example(element: Element) {

	element.query("div") foreach { elem =>
		println(elem.innerHTML)
	}
}
