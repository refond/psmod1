package com.escalesoft.psmod1.controllers


import play.api.http.LazyHttpErrorHandler

/**
 * Assets in module specific package 
 * 
 * This to avoid routes clashes with project using module own routes.
 * Check sub-module doc: https://www.playframework.com/documentation/2.4.x/SBTSubProjects#Assets-and-controller-classes-should-be-all-defined-in-the-controllers.admin-package
 */
class Assets extends controllers.AssetsBuilder(LazyHttpErrorHandler)
