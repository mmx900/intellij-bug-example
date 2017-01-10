import org.scalajs.dom._

import scala.language.implicitConversions
import scala.scalajs.js

package object example {

	@js.native
	trait ExtendedNode extends Node {

		def contains(node: Node): Boolean = js.native
	}

	implicit def toExtendedNode(node: Node): ExtendedNode = node.asInstanceOf[ExtendedNode]

	implicit class ExtendedElement(val elem: Element) {

		def query(selectors: String): Option[Element] = Option(elem.querySelector(selectors))
	}

}
