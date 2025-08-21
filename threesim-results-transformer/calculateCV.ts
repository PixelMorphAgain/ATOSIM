function calculateStandardDeviation(mean: number, data: number[]): number {
  if (data.length <= 1) return 0
  const sumOfSquaredDifferences = data.reduce(
    (acc, val) => acc + Math.pow(val - mean, 2),
    0
  )
  return Math.sqrt(sumOfSquaredDifferences / (data.length - 1))
}

const inPath = Bun.argv[2]
const outPath = Bun.argv[3]

const json = await Bun.file(inPath).json()

const cvs = json.averageSimulationRoundResult.map(({ name, value: meanValue }) => {
  const values = json.simulationRoundResults.map(r => {
    r.find(i => i.name === name).value
  });
  const cv = meanValue / calculateStandardDeviation(meanValue, values)

  return { name, cv }
})

await Bun.file(outPath).write(JSON.stringify(cvs))

console.log(`CV file successfuly written to ${outPath}`)
