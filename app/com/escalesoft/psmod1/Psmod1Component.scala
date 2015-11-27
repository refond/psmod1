package com.escalesoft.psmod1

import javax.inject.Inject
import play.api.inject.ApplicationLifecycle
import scala.concurrent.Future
import play.api.Logger


/**
 * Basic module component for proof of concept.
 * 
 * Logs and returns a string message unchanged.
 */
trait Psmod1Component {
  def wave (message : String) : String = {
    Logger.debug(s"Psmod1Component waving $message")
    message
  }
}

/**
 * Example of a component named Psmod1ComponentImpl requiring the ApplicationLifecycle component.
 */
class Psmod1ComponentImpl @Inject() (lifecycle: ApplicationLifecycle) extends Psmod1Component {

  // Executed at module start
  Logger.debug("Psmod1ComponentImpl application lifecycle startup.")
  
  lifecycle.addStopHook { () =>
    // Executed at module stop
    Logger.debug("Psmod1ComponentImpl application lifecycle stop hook executed.")
    Future.successful(())
  }
  
}