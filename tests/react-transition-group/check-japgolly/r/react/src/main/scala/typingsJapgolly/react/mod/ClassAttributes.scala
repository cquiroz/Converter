package typingsJapgolly.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassAttributes[T] extends Attributes {
  
  var ref: js.UndefOr[japgolly.scalajs.react.raw.React.Ref] = js.native
}
object ClassAttributes {
  
  @scala.inline
  def apply[T](key: Key = null, ref: japgolly.scalajs.react.raw.React.Ref = null): ClassAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassAttributes[T]]
  }
}
