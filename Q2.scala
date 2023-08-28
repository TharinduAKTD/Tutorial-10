def countLetterOccurrences(words: List[String]): Int = {
  val letterCounts = words.map(_.length)
  letterCounts.reduce(_ + _)
}

// Example usage
val inputWords = List("apple", "banana", "cherry", "date")
val totalLetterOccurrences = countLetterOccurrences(inputWords)
println(s"Total count of letter occurrences: $totalLetterOccurrences")
