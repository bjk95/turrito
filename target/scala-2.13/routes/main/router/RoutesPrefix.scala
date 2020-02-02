// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Gena/dev/play-samples-play-scala-starter-example/conf/routes
// @DATE:Sun Feb 02 12:47:57 AEDT 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
