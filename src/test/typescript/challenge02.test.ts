import { compileThisWord } from '../../main/typescript/challenge02'

/*
"#" Increases the numeric value by 1.
"@" Decreases the numeric value by 1.
"*" Multiplies the numeric value by itself.
"&" Prints the current numeric value.
*/

describe('should be count repeats words and return string', () => {
  test('count repeat words input 1', () => {
    const input = '##*&'
    const shouldBe = '4'

    expect(compileThisWord(input)).toBe<string>(shouldBe)
  })

  test('count repeats words input 2 from codember', () => {
    const input = '&##&*&@&'
    const shouldBe = '0243'
    expect(compileThisWord(input)).toBe<string>(shouldBe)
  })
})
