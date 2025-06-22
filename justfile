verify:
    mvn verify

build:
    mvn package
    just copy-packages-to-root

# TODO: Does not work at the moment. Palladio Bench does not support dropins folder.
#PALLADIO_BENCH_PATH := "/Users/davisriedel/Desktop/Bachelorarbeit/EclipseBA2023.app"
#copy-packages-to-palladio-bench:
#    rm -rf {{ PALLADIO_BENCH_PATH }}/Contents/Eclipse/dropins
#    mkdir -p {{ PALLADIO_BENCH_PATH }}/Contents/Eclipse/dropins
#    cp org.palladiosimulator.blockchainsystems.*/target/*.jar {{ PALLADIO_BENCH_PATH }}/Contents/Eclipse/dropins
#run build copy-packages-to-palladio-bench:
#    open {{ PALLADIO_BENCH_PATH }}

copy-packages-to-root:
    rm -rf build
    mkdir -p build
    cp org.palladiosimulator.blockchainsystems.*/target/*.jar build
