# bender

Clojure code for Bender, a simple [FIRST FRC](https://www.usfirst.org/roboticsprograms/frc) robot. We use the WPILib libraries for robot communication, a task made trivial by Java-InterOp in Clojure.

## Setup

Clone the project locally. Install Leiningen.

Edit the `./deploy` script and change `team` to be your team number.

### Build and Deploy

```bash
# creates uberjar and uploads to roborio
./deploy
```

## License

See LICENSE.
