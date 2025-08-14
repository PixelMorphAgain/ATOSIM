# Load environment variables from .env file

set dotenv-load := true

# We need to disable tycho javadoc, because it is not compatible with the current JDK.
# We also disable xtend compilation, because xtend is not used in 3SIM.

MVN_ARGS := "-P '!tycho-javadoc-for-bundle,!tycho-javadoc-for-updatesite,!compile-xtend'"

clean:
    mvn clean {{ MVN_ARGS }}

verify:
    mvn verify {{ MVN_ARGS }}

build:
    mvn install {{ MVN_ARGS }}

install:
    $ECLIPSE_EXECUTABLE -application org.eclipse.equinox.p2.director \
        -repository $THREESIM_UPDATESITE_URL,https://download.eclipse.org/releases/2025-06,https://updatesite.palladio-simulator.com/palladio-build-updatesite/releases/latest/ \
        -installIU org.palladiosimulator.blockchainsystems.threesim_feature.feature.group,org.palladiosimulator.blockchainsystems.threesim_feature.source.feature.group \
        -destination $ECLIPSE_EXECUTABLE_DIR \
        -profile $ECLIPSE_PROFILE

# Run Eclipse with remote debugging enabled.
debug:
    $ECLIPSE_EXECUTABLE -vmargs -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=*:5005

# Build with maven tycho, install into the Eclipse IDE and run it with remote debugging enabled.
dev: build install debug
