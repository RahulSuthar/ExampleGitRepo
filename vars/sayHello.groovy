#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "--------------SharedLibraryMethodCall--------------"
  echo "Hello , ${name}!! SharedLibrary method call successful!!"
  echo "-------------------------End-----------------------"
}
