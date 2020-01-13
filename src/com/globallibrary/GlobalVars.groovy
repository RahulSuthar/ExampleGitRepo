#!/usr/bin/env groovy
package com.cleverbuilder

class GlobalVars {
   static String version = "V1.0"
   static String name = "SharedLibrary"

   // refer to this in a pipeline using:
   //
   // import com.cleverbuilder.GlobalVars
   // println GlobalVars.foo
}