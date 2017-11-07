object recfunSheet {

  val testStr: String = "(This) IS (my(string))"
  val testList: List[Char] = testStr.toList

  val filteredList = testList.filter(x => x==')' || x=='(')


  def iterate(chars: List[Char], acc: Int): Int = {
      println(chars.head)
      println(chars.tail)
      println(acc)
      if (acc < chars.length) iterate(chars.tail,acc+1)
      else acc
    }

  iterate("heo på asdf".toList,0)





}