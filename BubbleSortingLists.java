import java.util.ArrayList;

public class BubbleSortingLists {

//returns more than 1 if word1 comes after word2
// returns 1 if word1 is similar to word2 but longer than it e.g., apple vs app
// return -1 if word1 is similar to word2 but shorter than it e.g., app vs apple
// return 0 if exactly identical
public static int compareStrings(String word1, String word2) {
    int difference = 0;
    int asc1, asc2;

    for(int i = 0; i < word1.length() && i < word2.length(); i++) {
        // getting the ascii code for the chars
        asc1 = (int) word1.toLowerCase().charAt(i);   
        asc2 = (int) word2.toLowerCase().charAt(i);  
        
        // getting the difference
        difference = asc1 - asc2;  
        
        // returning the difference if the two characters are different
        if(difference != 0)    
            return difference;
    }

    if(word1.length() > word2.length())    // word1 is longer
    return 1;
    else if (word1.length() < word2.length()) // word2 is longer
        return -1;
    else
        return 0; // they are identical

}

public static void main(String[] args) {
        ArrayList<String> Values = new ArrayList<>();
        Values.add("Apple");
        Values.add("Fish");
        Values.add("Carrot");
        Values.add("Banana");
        
        Values.add("Honey");
        Values.add("Icecream");
        Values.add("Elephant");
        Values.add("Honey");
        Values.add("Grape");
        Values.add("App");
        
     
         System.out.println("Before Sorting");
         System.out.println(Values);
String word1, word2;
boolean continueSwapping=true;
while(continueSwapping){
continueSwapping=false;
for(int i=0; i<Values.size()-1; i++){
word1=Values.get(i);
word2=Values.get(i+1);

if(compareStrings(word1.toLowerCase(), word2.toLowerCase())>=1){
continueSwapping=true;
Values.set(i, word2);
Values.set(i+1, word1);
} 


System.out.println(Values); 

}
}
System.out.println("final version");
System.out.println(Values); 
        
        }
}