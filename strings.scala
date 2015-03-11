import scala.math.min

object strings  {

   def getlength (args: Array[String]) {
       var sentence = Console.readLine
       var numberofcharacters = sentence.length
       println(s"This sentence is $numberofcharacters characters in length.")
       
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
