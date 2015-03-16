import scala.math.min

object strings  {

   def getlength (args: Array[String]) {
       var sentence = Console.readLine
       var numberofcharacters = sentence.length
       numberofcharacters
       
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
       
       var ar = name.split("\\s+")
       //var indexing = Array (ar.size-1)
       var str = ""
       
       if (ar.size == 1)
            return name
           
       for (a <- 0 to ar.size - 2) {
        str += " " + ar(a)
       }
       return ar.last + "," + str 
       
   }
    
   
}
