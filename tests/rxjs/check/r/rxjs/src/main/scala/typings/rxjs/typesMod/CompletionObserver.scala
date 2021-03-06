package typings.rxjs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletionObserver[T] extends PartialObserver[T] {
  
  var closed: js.UndefOr[Boolean] = js.native
  
  def complete(): Unit = js.native
  
  var error: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.native
  
  var next: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
}
object CompletionObserver {
  
  @scala.inline
  def apply[T](complete: () => Unit): CompletionObserver[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[CompletionObserver[T]]
  }
  
  @scala.inline
  implicit class CompletionObserverOps[Self <: CompletionObserver[_], T] (val x: Self with CompletionObserver[T]) extends AnyVal {
    
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClosed(value: Boolean): Self = this.set("closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosed: Self = this.set("closed", js.undefined)
    
    @scala.inline
    def setError(value: /* err */ js.Any => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setNext(value: /* value */ T => Unit): Self = this.set("next", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
  }
}
