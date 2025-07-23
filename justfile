# We need to disable tycho javadoc, because it is not compatible with the current JDK.
# We also disable xtend compilation, because xtend is not used in 3SIM.

MVN_ARGS := "-P '!tycho-javadoc-for-bundle,!tycho-javadoc-for-updatesite,!compile-xtend'"

clean:
    mvn clean {{ MVN_ARGS }}

verify:
    mvn verify {{ MVN_ARGS }}

build:
    mvn clean install {{ MVN_ARGS }}
