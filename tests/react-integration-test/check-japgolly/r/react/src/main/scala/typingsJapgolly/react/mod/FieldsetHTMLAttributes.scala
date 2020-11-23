package typingsJapgolly.react.mod

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldsetHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var disabled: scala.Unit | Boolean = js.native
  
  var form: scala.Unit | String = js.native
  
  var name: scala.Unit | String = js.native
}
object FieldsetHTMLAttributes {
  
  @scala.inline
  def apply[T](): FieldsetHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldsetHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class FieldsetHTMLAttributesOps[Self <: FieldsetHTMLAttributes[?], T] (val x: Self & FieldsetHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self & Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self & Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", ())
    
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", ())
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", ())
  }
}
