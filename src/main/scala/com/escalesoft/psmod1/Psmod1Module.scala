package com.escalesoft.psmod1

import play.api.Configuration
import play.api.Environment
import play.api.inject.Binding
import play.api.inject.Module

/**
 * Binds components to their implementations. Configuration and Environment are accessible 
 * but not making any use of them for simplicity sake.
 */
class Psmod1Module extends Module {
  def bindings(environment: Environment, configuration: Configuration): Seq[Binding[_]] = {
    Seq(
      bind[Psmod1Component].to[Psmod1ComponentImpl]
    )
  }
}
  

