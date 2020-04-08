
package words;


	
	//Author Name: Mackenzie Smith
	//Date:2/1/20
	//Program Name: Smith_text_analyzer
	//Purpose: to go through the play's words and check how many times each word is used






		// output word frequencies, starting with most frequent
		// pair containing a word and how many times

			import java.io.*;
			import java.util.HashMap;
			import java.util.Map;

			public class WordOccurrences2 {
			    public static void main(String[] args) throws IOException {

	              // read the file
			        File file = new File("C:\\Users\\macke\\Software Development\\macbeth.txt");
			        
			        System.out.println("Reading file... \n");
			        
	              // reading through and figuring out the number of each word
			        BufferedReader br = new BufferedReader(new FileReader(file));
			        String line;
			        Map<String, Long> counts = new HashMap<>();
			        while ((line = br.readLine()) != null) {

			            String[] words = line.split("[\\s.;,?':!-()\"]+");
			            for (String word : words) {
			                word = word.trim();
			                if (word.length() > 0) {
			                    if (counts.containsKey(word)) {
			                        counts.put(word, counts.get(word) + 1);
			                    } else {
			                        counts.put(word, 1L);
			                    }
			                }
			            }
			        }
			        for (Map.Entry<String, Long> entry : counts.entrySet()) {
			            System.out.println(entry.getKey() + ": " + entry.getValue());
			            
			        }
			        br.close();
			    }

				public void add(int index) {
					// TODO Auto-generated method stub
					
				}
			}



	
}
