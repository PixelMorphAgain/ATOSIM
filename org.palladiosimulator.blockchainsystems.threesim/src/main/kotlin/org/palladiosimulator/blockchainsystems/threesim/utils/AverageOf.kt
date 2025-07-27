package org.palladiosimulator.blockchainsystems.threesim.utils

@JvmName("averageOfIntWithSelector")
@OptIn(kotlin.experimental.ExperimentalTypeInference::class)
@OverloadResolutionByLambdaReturnType
inline fun <T> Collection<T>.averageOf(selector: (T) -> Int): Double {
  return sumOf(selector).toDouble() / size
}

@JvmName("averageOfLongWithSelector")
@OptIn(kotlin.experimental.ExperimentalTypeInference::class)
@OverloadResolutionByLambdaReturnType
inline fun <T> Collection<T>.averageOf(selector: (T) -> Long): Double {
  return sumOf(selector).toDouble() / size
}

@JvmName("averageOfDoubleWithSelector")
@OptIn(kotlin.experimental.ExperimentalTypeInference::class)
@OverloadResolutionByLambdaReturnType
inline fun <T> Collection<T>.averageOf(selector: (T) -> Double): Double {
  return sumOf(selector) / size
}
