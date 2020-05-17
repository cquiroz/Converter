package typingsJapgolly.react.mod

import typingsJapgolly.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Try to resolve ill-defined props like for JS users: props can be any, or sometimes objects with properties of type any
/* Rewritten from type alias, can be one of: 
  - (typingsJapgolly.std.Pick[P, typingsJapgolly.react.mod.NotExactlyAnyPropertyKeys[P]]) with (typingsJapgolly.std.Pick[
T, 
/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Exclude<keyof T, NotExactlyAnyPropertyKeys<P>> * / _]) with (typingsJapgolly.std.Pick[
P, 
/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Exclude<keyof P, keyof T> * / _])
  - P
  - T
*/
trait MergePropTypes[P, T] extends js.Object

object MergePropTypes {
  @scala.inline
  implicit def apply[P, T](
    value: (Pick[P, NotExactlyAnyPropertyKeys[P]]) with (Pick[
      T, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Exclude<keyof T, NotExactlyAnyPropertyKeys<P>> */ _
    ]) with (Pick[
      P, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Exclude<keyof P, keyof T> */ _
    ])
  ): MergePropTypes[P, T] = value.asInstanceOf[MergePropTypes[P, T]]
  @scala.inline
  implicit def apply[P, T](value: P | T): MergePropTypes[P, T] = value.asInstanceOf[MergePropTypes[P, T]]
}
