export const countWords = (words: string): string => {
  const wordsArray = words.split(' ')
  const wordCounts = new Map<string, number>()
  wordsArray.forEach(word => {
    wordCounts.set(word, (wordCounts.get(word) ?? 0) + 1)
  })

  let wordConcat = ''

  wordCounts.forEach((count, word) => {
    wordConcat += word + count
  })

  return wordConcat
}
