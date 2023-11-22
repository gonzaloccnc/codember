import { compileThisWord } from '../../main/typescript/challenge02'

/*
"#" Increases the numeric value by 1.
"@" Decreases the numeric value by 1.
"*" Multiplies the numeric value by itself.
"&" Prints the current numeric value.
*/

describe('Testing challenge 2 from codember 2023, its a mini compiler!!', () => {
  test('Should be returns a string depending on how many prints string (&) there are', () => {
    const input = '##*&'
    const shouldBe = '4'

    expect(compileThisWord(input)).toBe<string>(shouldBe)
  })

  test('Should be returns a string depending on how many prints string (&) there are', () => {
    const input = '&##&*&@&'
    const shouldBe = '0243'
    expect(compileThisWord(input)).toBe<string>(shouldBe)
  })
})
