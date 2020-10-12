package typingsSlinky.stardustUiReactComponentRef

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import typingsSlinky.stardustUiReactComponentRef.anon.Children
import typingsSlinky.stardustUiReactComponentRef.anon.InnerRef
import typingsSlinky.stardustUiReactComponentRef.refFindNodeMod.default
import typingsSlinky.stardustUiReactComponentRef.typesMod.RefProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stardust-ui/react-component-ref", "Ref")
  @js.native
  val Ref: ReactComponentClass[RefProps] = js.native
  
  /**
    * The function that correctly handles passing refs.
    *
    * @param ref An ref object or function
    * @param node A node that should be passed by ref
    */
  @JSImport("@stardust-ui/react-component-ref", "handleRef")
  @js.native
  def handleRef[N](ref: typingsSlinky.react.mod.Ref[N], node: N): Unit = js.native
  
  /** Checks that the passed object is a valid React ref object. */
  @JSImport("@stardust-ui/react-component-ref", "isRefObject")
  @js.native
  def isRefObject(ref: js.Any): /* is react.react.RefObject<any> */ Boolean = js.native
  
  @JSImport("@stardust-ui/react-component-ref", "refPropType")
  @js.native
  val refPropType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropTypes.Requireable<React.Ref<any>> */ js.Any = js.native
  
  /** Creates a React ref object from existing DOM node. */
  @JSImport("@stardust-ui/react-component-ref", "toRefObject")
  @js.native
  def toRefObject[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Node */ js.Any */](node: T): ReactRef[T] = js.native
  
  @JSImport("@stardust-ui/react-component-ref", "RefFindNode")
  @js.native
  class RefFindNode () extends default
  /* static members */
  object RefFindNode {
    
    @JSImport("@stardust-ui/react-component-ref", "RefFindNode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@stardust-ui/react-component-ref", "RefFindNode.displayName")
    @js.native
    val displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@stardust-ui/react-component-ref", "RefFindNode.propTypes")
    @js.native
    val propTypes: Children | InnerRef = js.native
    @scala.inline
    def propTypes_=(x: Children | InnerRef): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@stardust-ui/react-component-ref", "RefForward")
  @js.native
  class RefForward ()
    extends typingsSlinky.stardustUiReactComponentRef.refForwardMod.default
  /* static members */
  object RefForward {
    
    @JSImport("@stardust-ui/react-component-ref", "RefForward")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@stardust-ui/react-component-ref", "RefForward.displayName")
    @js.native
    val displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@stardust-ui/react-component-ref", "RefForward.propTypes")
    @js.native
    val propTypes: Children | InnerRef = js.native
    @scala.inline
    def propTypes_=(x: Children | InnerRef): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
