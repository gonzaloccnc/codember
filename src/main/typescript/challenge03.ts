import * as fs from 'fs'
import * as readline from 'readline'
import path from 'path'

export async function processLineByLine (): Promise<string[]> {
  const policiesPath = path.join(process.cwd(), 'src/main/resources/encryption_policies.txt')
  const fileStream = fs.createReadStream(policiesPath)
  const array: string[] = []

  const rl = readline.createInterface({
    input: fileStream,
    crlfDelay: Infinity
  })

  for await (const line of rl) {
    array.push(line)
  }

  return array
}

/*
  TODO this code works in low positions, the code gets the string
       earlier than expected, it gives a string earlier than the correct one
*/

export function getWord (policies: string[], position: number): string {
  let word = ''
  let errors = 0

  for (const policy of policies) {
    const firstCompact = policy.split(' ')
    const [min, max] = firstCompact[0].split('-')
    const letter = firstCompact[1].replace(':', '')
    const key = firstCompact[2]

    const countLetter = key.length - key.replace(letter, '').length

    const isValid = countLetter >= +min && countLetter <= +max

    if (!isValid) ++errors

    if (errors === position) {
      word = key
      break
    }
  }

  return word
}

// const policies = await processLineByLine()
// const pos = 42
// const word = getWord(policies, pos)
//
// console.log(`the word in the position ${pos} is ${word}`)
