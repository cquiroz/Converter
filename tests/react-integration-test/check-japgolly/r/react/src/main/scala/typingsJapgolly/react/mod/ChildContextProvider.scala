package typingsJapgolly.react.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildContextProvider[CC] extends js.Object {
  
  def getChildContext(): CC = js.native
}
object ChildContextProvider {
  
  @scala.inline
  def apply[CC](getChildContext: CallbackTo[CC]): ChildContextProvider[CC] = {
    val __obj = js.Dynamic.literal(getChildContext = getChildContext.toJsFn)
    __obj.asInstanceOf[ChildContextProvider[CC]]
  }
  
  @scala.inline
  implicit class ChildContextProviderOps[Self <: ChildContextProvider[_], CC] (val x: Self with ChildContextProvider[CC]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetChildContext(value: CallbackTo[CC]): Self = this.set("getChildContext", value.toJsFn)
  }
}
