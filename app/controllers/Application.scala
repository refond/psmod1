package controllers

import play.api._
import play.api.mvc._

import javax.inject.Inject

/**
 * Constructor injection of Psmod1Component
 */
class Application @Inject() (psmod1: Psmod1Component) extends Controller {

  def index = Action {
    // Basic test of Psmod1Component component wave method call. (Not a pure function, it logs the message.)
    Ok(views.html.index(psmod1.wave("Message from psmod1")))
  }

}
