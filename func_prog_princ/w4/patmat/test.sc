val a = 1

val myString = "hhhei på deg deg din din din din lille din"
val mylist = myString.toList

val myWordList = myString.toList

val myWordCount = myWordList.foldLeft(Map.empty[Char, Int]){
    (count, letter) => count + (letter -> (count.getOrElse(letter, 0) + 1))
  }

val myWordCountList: List[(Char, Int)] = myWordCount.toList


println(myWordCount)

def times(chars: List[Char]): List[(Char, Int)] = {
  chars.foldLeft(Map.empty[Char, Int])(
    (count, letter) => count + (letter -> (count.getOrElse(letter, 0) + 1))
    ).toList
}

times(List('a','b','c','a','a'))