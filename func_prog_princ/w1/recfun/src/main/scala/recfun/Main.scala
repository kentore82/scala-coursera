package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }


    // paranthesis balancing
    val myTests: List[String] = List("(This) IS (my(string))",")This( IS )my)string((",
                                      "(()")
    val myResult: List[Boolean] = myTests.map(x => balance(x.toList))

    println(myResult)

  }


  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if ( c==0 || r==0 || c==r) 1
      else pascal(c-1,r-1) + pascal(c,r-1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      val filtered = chars.filter(x => x==')' || x=='(')

      def iterate(filtered: List[Char], acc: Int): Int = {
        if (filtered.isEmpty || acc < 0) acc
        else if (filtered.head == '(') iterate(filtered.tail, acc+1)
        else iterate(filtered.tail, acc-1)
      }

      val accumulator: Int = iterate(filtered,0)
      return accumulator == 0
    }

  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if (money == 0) 1
      else if (money < 0 || coins.isEmpty) 0
      else if (money <= 0 && !coins.isEmpty) 0
      else countChange(money, coins.tail) + countChange(money - coins.head, coins)
    }
  }
