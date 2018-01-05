import objsets._

object objsetsWorkSheet {
  val myTweet1: Tweet = new Tweet("me", "hei this is my tweet", 3)
  val myTweet2: Tweet = new Tweet("me2", "hei this is my tweet2", 5)
  val myTweet3: Tweet = new Tweet("me3", "hei this is my tweet3", 6)

  val myTweet4: Tweet = new Tweet("him","fan",3)
  val myTweet5: Tweet = new Tweet("her","fann",12)
  val myTweet6: Tweet = new Tweet("herr","frann",9)


  val myTweetSet: TweetSet = (new Empty).incl(myTweet1).incl(myTweet2).incl(myTweet3)
  val myTweetSet2: TweetSet = (new Empty).incl(myTweet4).incl(myTweet5)

  //val myFilteredTweetSet = myTweetSet.filter(x => x.text.contains("thei"))
  val myFilteredTweetSet = myTweetSet.filter(x => x.retweets > 3)

  val myUnionTweetSet = myTweetSet.union(myTweetSet2)

  myUnionTweetSet.contains(myTweet1)
  myUnionTweetSet.contains(myTweet5)
  myUnionTweetSet.contains(myTweet6)

  TweetReader.allTweets.head.toString

  val strA = "any car is black"
  val listB = List("any","red")

  if (strA.split(" ") exists (x => listB exists (_ contains x)))
    println("true")













}
