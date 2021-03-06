package org.scalablytyped.converter.internal
package importer

import org.scalablytyped.converter.internal.ts.TsIdentLibrarySimple

object PathsFromTsLibSource {
  def apply(source: Source.TsLibSource): Set[Source.TsHelperFile] = {

    val files: IArray[InFile] =
      source match {
        case Source.StdLibSource(_, files, _) =>
          files
        case f @ Source.FromFolder(_, TsIdentLibrarySimple("typescript")) =>
          /* don't include std */
          f.shortenedFiles
        case f: Source.FromFolder =>
          /* There are often whole trees parallel to what is specified in `typings` (or similar). This ignores them */
          val bound = f.shortenedFiles.headOption.map(_.folder).getOrElse(f.folder)
          filesFrom(bound)
      }

    files.map(Source.helperFile(source)).toSet
  }

  val V  = "v[\\d\\.]+".r
  val TS = "ts[\\d\\.]+".r

  def allTopLevel(folder: InFolder): IArray[InFile] =
    IArray.fromTraversable(
      os.list(folder.path)
        .filter(_.last.endsWith("d.ts"))
        .map(InFile.apply),
    )

  def filesFrom(bound: InFolder): IArray[InFile] = {
    def skip(dir: os.Path) =
      dir.last match {
        case "node_modules" => true
        /* The presence of these folders mostly means unnecessary duplication.
           If we desperately want these perhaps the user can configure that,
            though it won't be as easy as just discarding them
         */
        case "amd" => true
        case "umd" => true
        case "es"  => true
        case "es6" => true
        /* DefinitelyTyped uses this pattern for newer versions of typescript. We just use the default */
        case TS() => true
        /* DefinitelyTyped uses this pattern for old versions of the library */
        case V() => true
        case _   => false
      }

    IArray.fromTraversable(
      os.walk(bound.path, skip)
        .filter(path => path.last.endsWith(".d.ts") && os.isFile(path))
        .filterNot(_.last.contains(".src.")) // filter out files like highlight.src.d.ts,
        .map(InFile.apply),
    )
  }
}
