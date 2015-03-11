import scala.math.min

object strings  {

   def main (args: Array[String]) {
       println("Please enter a sentence:")
       
       var sentence = Console.readLine
       println(s"You typed in '$sentence'")
        
       var numberofcharacters = sentence.length
       println(s"This sentence is $numberofcharacters characters in length.")
       
       getSentenceType(sentence)
       
       println("Please enter a name:")
       var name = Console.readLine
       
       getFormattedName(name)
   }


   def getSentenceType(sentence : String) : String = {
       
       if (sentence.endsWith("?"))  
            "interrogative" 
       else if (sentence.endsWith("."))  
            "declarative"
       else if (sentence.endsWith("!"))  
            "exclamatory"
       else 
            "unknown"
        
   }

   def getFormattedName(name : String) : String = {
     
       var toremove = ",".toSet
       var removed = name.filterNot(toremove)
       if(removed.contains(" ")) {
           val derp = removed.split(" ")
           derp(1) + ", " + derp(0)
       }
       else {
           removed
       }
   }

}
