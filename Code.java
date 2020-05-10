//Neissa Doreen Dorsinville
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/*
 * This program will keep track of how many times a word has been repeated
 * The "Cupcake Ipsum Sugar-Coated Lorem Ipsum Generator" was used to generate random words
 */

public class WordFrequency {
  public static void main(String[] args) throws Exception {
	//Use a Scanner to read from File
    BufferedReader input = new BufferedReader(new FileReader("C:\\Users\\nd_do\\OneDrive\\Desktop\\CISC3130\\WordFrequency.txt"));
    //Initialize a string that the scanner will read
    String line = null;
    	//Use a while loop to go through the entire file
       while ((line = input.readLine()) != null) {
      String [] values = line.split(" ");
      //Create a Map
      Map<String, Integer> frequencyMap = new HashMap<>();
      	for(String s : values) {
      	  //Initialize a counter that will keep track of each element
    	  Integer countWords = frequencyMap.get(s);
    	  if(countWords == null)
    		  countWords = 0;
    	  frequencyMap.put(s,countWords+1);
      }
      //Print out the Map with each Key as a word and each Value as the number of times the word was repeated
      for(Map.Entry<String,Integer> entry : frequencyMap.entrySet()) {
    	  System.out.println(entry.getKey() + " :" + entry.getValue());
     }
      }
    input.close();
    }
  }


