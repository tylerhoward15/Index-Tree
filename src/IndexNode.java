import java.util.ArrayList;
import java.util.List;

public class IndexNode  {

	// The word for this entry
	String word;
	// The number of occurrences for this word
	int occurences;
	// A list of line numbers for this word.
	List<Integer> list; 
	
	
	
	IndexNode left;
	IndexNode right;
	
	
	// Constructors
	// Constructor should take in a word and a line number
	// it should initialize the list and set occurrences to 1
	IndexNode(String word, int line){
		this.word = word;
		list = new ArrayList<>();
		this.list.add(line);
		this.occurences = 1;
	}
	
	
	
	// Complete This
	// return the word, the number of occurrences, and the lines it appears on.
	// string must be one line
	
	public String toString(){
		return String.format("Word: %s	Occurences: %d	Lines: %s\n", this.word, this.occurences, this.list.toString());
	}
	
	
	
}
