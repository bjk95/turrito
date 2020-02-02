package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class HelloWorld @Inject()(cc: ControllerComponents) (implicit assetsFinder: AssetsFinder)
  extends AbstractController (cc) {

  def index(name: String) = Action{
    Ok(views.html.index(s"Good morning ${name}"))
  }
}
