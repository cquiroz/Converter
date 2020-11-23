package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.raw.React.ComponentClassP
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.accordionAccordionAccordionMod.AccordionAccordionProps
import typingsJapgolly.semanticUiReact.accordionAccordionAccordionMod.StrictAccordionAccordionProps
import typingsJapgolly.semanticUiReact.accordionContentMod.AccordionContentProps
import typingsJapgolly.semanticUiReact.accordionTitleMod.AccordionTitleProps
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionAccordionMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion/Accordion", JSImport.Default)
  @js.native
  val default: AccordionComponent = js.native
  
  @js.native
  trait AccordionComponent
    extends ComponentClass[AccordionProps, js.Object] {
    
    var Accordion: ComponentClassP[AccordionAccordionProps & js.Object] = js.native
    
    var Content: StatelessComponent[AccordionContentProps] = js.native
    
    var Title: ComponentClassP[AccordionTitleProps & js.Object] = js.native
  }
  
  @js.native
  trait AccordionProps
    extends StrictAccordionProps
       with /* key */ StringDictionary[js.Any]
  object AccordionProps {
    
    @scala.inline
    def apply(): AccordionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionProps]
    }
  }
  
  @js.native
  trait StrictAccordionProps extends StrictAccordionAccordionProps {
    
    /** Format to take up the width of its container. */
    var fluid: scala.Unit | Boolean = js.native
    
    /** Format for dark backgrounds. */
    var inverted: scala.Unit | Boolean = js.native
    
    /** Adds some basic styling to accordion panels. */
    var styled: scala.Unit | Boolean = js.native
  }
  object StrictAccordionProps {
    
    @scala.inline
    def apply(): StrictAccordionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictAccordionProps]
    }
    
    @scala.inline
    implicit class StrictAccordionPropsOps[Self <: StrictAccordionProps] (val x: Self) extends AnyVal {
      
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
      def setFluid(value: Boolean): Self = this.set("fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteFluid: Self = this.set("fluid", ())
      
      @scala.inline
      def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteInverted: Self = this.set("inverted", ())
      
      @scala.inline
      def setStyled(value: Boolean): Self = this.set("styled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def deleteStyled: Self = this.set("styled", ())
    }
  }
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion/Accordion", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[AccordionProps, js.Object, js.Any] {
    def this(props: AccordionProps) = this()
    def this(props: AccordionProps, context: js.Any) = this()
  }
}
