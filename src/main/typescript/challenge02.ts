/*
"#" Increases the numeric value by 1.
"@" Decreases the numeric value by 1.
"*" Multiplies the numeric value by itself.
"&" Prints the current numeric value.
*/

const keywords: Record<string, (value: number) => number> = {
  '#': (value: number) => {
    value += 1
    return value
  },
  '@': (value: number) => {
    value -= 1
    return value
  },
  '*': (value: number) => {
    value *= value
    return value
  }
}

export function compileThisWord (input: string): string {
  let result = ''
  let initValue = 0

  for (const letter of input) {
    if (keywords[letter] == null) {
      result += initValue
      continue
    }

    initValue = keywords[letter](initValue)
  }

  return result
}

// switch (letter) {
//   case '#': initValue += 1
//     break
//   case '@': initValue -= 1
//     break
//   case '*': initValue *= initValue
//     break
//   default: result += initValue
//     break
// }
