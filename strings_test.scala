import org.scalatest._
import strings._
import scala.util.{Try, Success, Failure}

/*
 * Note to student: You may not change this file (the tests)
 */

class RationalScalaTestFlatSpecMatchers extends FlatSpec with Matchers {

  "these sentences" should "be interrogative" in {
     getSentenceType("?") should be ("interrogative")
     getSentenceType("Is this a question?") should be ("interrogative")
     getSentenceType("Is this a question?#$@#$#??") should be ("interrogative")
     getSentenceType("A sentence not ending in ? or other punctuation is not a sentence") should be ("unknown")
  }

  it should "be declarative" in {
     getSentenceType(".") should be ("declarative")
     getSentenceType("To be or not to be, that is the question.") should be ("declarative")
     getSentenceType("Is this a question?#$@#$#??,.") should be ("declarative")
     getSentenceType("A sentence not ending in . or other punctuation is not a sentence") should be ("unknown")
  }

  it should "be exclamatory" in {
     getSentenceType("!") should be ("exclamatory")
     getSentenceType("This rocks!") should be ("exclamatory")
     getSentenceType("Is this a question?#$@#$#??,.!") should be ("exclamatory")
     getSentenceType("A sentence not ending in ! or other punctuation is not a sentence") should be ("unknown")    
  }

  "name formatting" should "handle common case of First Last" in {
    getFormattedName("Adam Smith") should be ("Smith, Adam")
  }

  it should "handle First Middle Last" in {
    getFormattedName("George K. Thiruvathukal") should be ("Thiruvathukal, George K.")
    getFormattedName("Ludwig van Beethoven") should be ("Beethoven, Ludwig van")
  }

  it should "handle only one name" in {
    getFormattedName("Madonna") should be ("Madonna")
  }

  it should "handle empty name" in {
    getFormattedName("") should be ("")
  }

}

 
