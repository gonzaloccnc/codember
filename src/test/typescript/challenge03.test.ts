import { getWord, processLineByLine } from '../../main/typescript/challenge03'

const policies = await processLineByLine()

describe('Testing challenge 3 from codember 2023, get position x of word error', () => {
  test('Should be return the 5th word with error in the list', () => {
    const shouldBe = 'gifzgmpab'

    expect(getWord(policies, 5)).toBe<string>(shouldBe)
  })

  test('Should be returns the 42th error word', () => {
    const shouldBe = 'bgamidqewtbus'

    expect(getWord(policies, 42)).toBe<string>(shouldBe)
  })

  test(' should be return the 13th word with error in the list', () => {
    const shouldBe = 'nljzuyfzb'

    expect(getWord(policies, 13)).toBe<string>(shouldBe)
  })
})
