# AspectJ

AspectJ is:
- a seamless aspect-oriented extension to the Java programming language
- Java platform compatible
- easy to learn and use

AspectJ enables:
- clean modularization of crosscutting concerns, such as error checking and handling, synchronization, context-sensitive behavior, performance optimizations, monitoring and logging, debugging support, and multi-object protocols

## Building

AspectJ has a multi-module Maven build. Although various modules produce intermediate results, the key artifacts at the end of the build are:

* `aspectjrt` - the AspectJ runtime
* `aspectjweaver` - the AspectJ weaver
* `aspectjtools` - the AspectJ compiler
* `aspectjmatcher` - the AspectJ matcher

These are the artifacts published to Maven Central for each release. In addition, there is an installer that can be run with `java -jar` to install AspectJ onto Windows/Mac/Linux. This installer is produced by the `installer` sub-module.

In the root of a cloned AspectJ simply run:

```shell
./mvnw clean install
```

Please make sure that your project root directory name is either _aspectj_ (default for `git clone`) or _org.aspectj_ (case-insensitive), if you wish to run the build with tests.
Some integration tests rely on this name when dynamically searching up the current path for the root folder.

You can also use a reasonably recent (3.6.3+), locally installed Maven installation instead of the Maven wrapper script.

This will build all the modules, run all the tests and install the key artifacts in your local repository.
Once built, access the Maven dependencies from your local repository or run the installer to install AspectJ locally:
```
java -jar installer/target/aspectj-<VERSION>.jar
```

## Running the tests in Eclipse

Once you have imported all the projects using `m2e`, there is a special module called `run-all-junit-tests` and within that a `RunTheseBeforeYouCommitTests` class that can be run with the JUnit launcher to execute thousands of tests.
Ensure you run this with a JDK - the more recent the better since some tests will not execute on older JDKs - tests that verify language features that only exist in the more up to date JDK version.

## Documentation for AspectJ users

* [Eclipse project page](https://projects.eclipse.org/projects/tools.aspectj)
* [AspectJ website](https://eclipse.dev/aspectj/)
* [AspectJ documentation overview](https://eclipse.dev/aspectj/doc/latest/index.html)
* [Setting up a development environment](docs/developer/IDE.md)
* [Getting started with AspectJ](https://eclipse.dev/aspectj/doc/latest/progguide/gettingstarted.html)
* [Programming Guide](https://eclipse.dev/aspectj/doc/latest/progguide/index.html)
* [AspectJ 5 Developer’s Notebook](https://eclipse.dev/aspectj/doc/latest/adk15notebook/index.html)
* [READMEs for each version of AspectJ](docs/release)
* [AspectJ Java version compatibility](https://eclipse.dev/aspectj/doc/latest/release/JavaVersionCompatibility.html)

## Documentation for AspectJ developers

* [How to contribute to AspectJ](CONTRIBUTING.md)
* [How to release AspectJ](docs/developer/RELEASE.md)
* [Maven build options (profiles, properties)](docs/developer/BUILD.md)

## Maven releases

AspectJ is published to Maven Central under [group ID `org.aspectj`](https://search.maven.org/search?q=g:org.aspectj).
