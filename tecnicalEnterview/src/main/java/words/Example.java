package words;

public class Example {
	public void reverseWordInMyString(String str)
	   {
		/* El método split()de un String class splits
		 * es un string en varios strings basados en el
		 * delimitador pasado como un argumento
		 */
		String[] words = str.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++)
	        {
	           String word = words[i]; 
	           String reverseWord = "";
	           for (int j = word.length()-1; j >= 0; j--) 
		   {
			/* La función charAt() regresa el caracter
			 * a la posición dada por el String ()
			 */
			reverseWord = reverseWord + word.charAt(j);
		   }
		   reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(str);
		System.out.println(reversedString);
	   }
	   public static void main(String[] args) 
	   {
		Example obj = new Example();
		obj.reverseWordInMyString("Welcome to this JavaScript guide!");
	   }
}
