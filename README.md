

# psmod1

Testing ground for Play 2.4 module creation


## Note regarding current status

This basic Play module test does contain an issue regarding Assets routing.
Check stackoverflow.com question for a detailed issue description.

http://stackoverflow.com/questions/33985108/play-framework-2-4-x-module-route-specific-name-fails-with-assets-is-not-a


## Project creation

First commit created from: 

    activator new

Selecting: 

    play-scala template


## Running 

First publish the current module locally: 

    activator publish-local

Then run it from psmaster1 example Play application available at: 

    git clone https://github.com/refond/psmaster1
    cd psmaster1
    activator run


## Module specifics

Cannot be run as a Play application anymore as it has:

- Empty /conf/application.conf file (presence allows for )
- Specific /conf/psmod1.routes route file

