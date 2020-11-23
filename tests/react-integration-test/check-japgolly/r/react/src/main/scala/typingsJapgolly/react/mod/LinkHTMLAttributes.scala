package typingsJapgolly.react.mod

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var as: scala.Unit | String = js.native
  
  var crossOrigin: scala.Unit | String = js.native
  
  var href: scala.Unit | String = js.native
  
  var hrefLang: scala.Unit | String = js.native
  
  var integrity: scala.Unit | String = js.native
  
  var media: scala.Unit | String = js.native
  
  var rel: scala.Unit | String = js.native
  
  var sizes: scala.Unit | String = js.native
  
  var `type`: scala.Unit | String = js.native
}
object LinkHTMLAttributes {
  
  @scala.inline
  def apply[T](): LinkHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class LinkHTMLAttributesOps[Self <: LinkHTMLAttributes[?], T] (val x: Self & LinkHTMLAttributes[T]) extends AnyVal {
    
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
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", ())
    
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", ())
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHref: Self = this.set("href", ())
    
    @scala.inline
    def setHrefLang(value: String): Self = this.set("hrefLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHrefLang: Self = this.set("hrefLang", ())
    
    @scala.inline
    def setIntegrity(value: String): Self = this.set("integrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrity: Self = this.set("integrity", ())
    
    @scala.inline
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", ())
    
    @scala.inline
    def setRel(value: String): Self = this.set("rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRel: Self = this.set("rel", ())
    
    @scala.inline
    def setSizes(value: String): Self = this.set("sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizes: Self = this.set("sizes", ())
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", ())
  }
}
