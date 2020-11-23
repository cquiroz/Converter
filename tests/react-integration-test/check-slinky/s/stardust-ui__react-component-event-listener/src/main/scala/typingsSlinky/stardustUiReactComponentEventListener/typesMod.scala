package typingsSlinky.stardustUiReactComponentEventListener

import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait EventListenerOptions[T /* <: EventTypes */] extends js.Object {
    
    /** Indicating that events of this type will be dispatched to the registered listener before being dispatched to any EventTarget beneath it in the DOM tree. */
    var capture: scala.Unit | Boolean = js.native
    
    /** A function which receives a notification when an event of the specified type occurs. */
    var listener: EventHandler[T] = js.native
    
    /** A ref object with a target node. */
    var targetRef: ReactRef[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Node */ js.Any
      ] = js.native
    
    /** A case-sensitive string representing the event type to listen for. */
    var `type`: T = js.native
  }
  object EventListenerOptions {
    
    @scala.inline
    def apply[T /* <: EventTypes */](
      listener: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentEventMap * / any[T] */ /* e */ js.Any => Unit,
      targetRef: ReactRef[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Node */ js.Any
        ],
      `type`: T
    ): EventListenerOptions[T] = {
      val __obj = js.Dynamic.literal(listener = js.Any.fromFunction1(listener), targetRef = targetRef.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventListenerOptions[T]]
    }
    
    @scala.inline
    implicit class EventListenerOptionsOps[Self <: EventListenerOptions[?], T /* <: EventTypes */] (val x: Self & EventListenerOptions[T]) extends AnyVal {
      
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
      def setListener(
        value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentEventMap * / any[T] */ /* e */ js.Any => Unit
      ): Self = this.set("listener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTargetRef(
        value: ReactRef[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Node */ js.Any
            ]
      ): Self = this.set("targetRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapture(value: Boolean): Self = this.set("capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteCapture: Self = this.set("capture", ())
    }
  }
  
  type EventHandler[T /* <: EventTypes */] = js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentEventMap * / any[T] */ /* e */ js.Any, 
    Unit
  ]
  
  type EventTypes = /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentEventMap * / any */ String
  
  type TargetRef = ReactRef[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Node */ js.Any
  ]
}
