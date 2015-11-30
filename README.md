

# psmod1

Testing ground for Play 2.4 module creation


## Note regarding current project status

This basic Play module test does contain an issue regarding Assets routing.
Check stackoverflow.com question for a detailed issue description.

http://stackoverflow.com/questions/33985108/play-framework-2-4-x-module-route-specific-name-fails-with-assets-is-not-a


## Project layout

The current project follows the standard SBT Maven layout. 
This is achieved using the new _experimental_ PlayLayoutPlugin feature introduced in 2.4.x   
as disablePlugins(PlayLayoutPlugin) in build.sbt file.

Official reference: https://playframework.com/documentation/2.4.x/Anatomy


## Running 

First publish the current module locally: 

    activator publish-local

Then run it from psmaster1 example Play application available at: 

    git clone https://github.com/refond/psmaster1
    cd psmaster1
    activator run

## Testing 

Basic tests are found in psmaster1 project src/main/test/scala


## Module specifics

Cannot be run as a Play application anymore as it has:

- Empty src/main/resources/application.conf file (presence allows for )
- Specific src/main/resources/psmod1.routes route file

