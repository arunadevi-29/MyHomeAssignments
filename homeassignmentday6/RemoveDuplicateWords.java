package homeassignmentday6;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
	String text = "We learn Java basics as part of java sessions in java week1";
	
	String[] words = text.split(" "); 
    Set<String> uniqueWords = new LinkedHashSet<>();
        
    for (String word : words) 
    {
    uniqueWords.add(word.toLowerCase()); 
    }
        
       System.out.println(String.join(" ", uniqueWords));
    }


	}


