package javachallenges;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Example: 1
		String s = "Hello World";
		String[] words = s.split(" ");
		String word = words[words.length - 1];
		System.out.println("The last word of the String \"Hello World\"Length is : " +word.length());
		
		//Example: 2
		String s1 = "fly me to the moon";
		String[] ch = s1.split(" ");
		String chlength = ch[ch.length -1];
		System.out.println("The last word of the String \"fly me to the moon\" lenth is :" + chlength.length());
		
		//Example: 3
		String s2 = "luffy is still joyboy";
		String[] ch2 = s2.split(" ");
		String chlength2 = ch2[ch2.length -1];
		System.out.println("The last word of the String\" luffy is still joyboy\" length is : " + chlength2.length());
		

	}

}
