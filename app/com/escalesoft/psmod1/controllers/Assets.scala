package com.escalesoft.psmod1.controllers

import controllers._

import play.api.http.LazyHttpErrorHandler

object Assets extends AssetsBuilder(LazyHttpErrorHandler)
