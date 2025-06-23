# We need to disable tycho javadoc, because it is not compatible with the current JDK.
# We also disable xtend compilation, because xtend is not used in 3SIM.

MVN_ARGS := "-P '!tycho-javadoc-for-bundle,!tycho-javadoc-for-updatesite,!compile-xtend'"

clean:
    mvn clean {{ MVN_ARGS }}

verify:
    mvn verify {{ MVN_ARGS }}

build:
    mvn clean install {{ MVN_ARGS }}

# TODO: Does not work at the moment. Palladio Bench does not support dropins folder.
#PALLADIO_BENCH_PATH := "/Users/davisriedel/Desktop/Bachelorarbeit/EclipseBA2023.app"
#copy-packages-to-palladio-bench:
#    rm -rf {{ PALLADIO_BENCH_PATH }}/Contents/Eclipse/dropins
#    mkdir -p {{ PALLADIO_BENCH_PATH }}/Contents/Eclipse/dropins
#    cp org.palladiosimulator.blockchainsystems.*/target/*.jar {{ PALLADIO_BENCH_PATH }}/Contents/Eclipse/dropins
#run build copy-packages-to-palladio-bench:
#    open {{ PALLADIO_BENCH_PATH }}
