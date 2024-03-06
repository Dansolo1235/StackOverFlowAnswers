import java.util.ArrayList;

public class BubbleSortingLists {


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

  if(word1.length() > word2.length())    
return 1;
else if (word1.length() < word2.length())
    return -1;
else
    return 0;

}

public static void main(String[] args) {
        ArrayList<String> Values = new ArrayList<>();
        Values.add("Apple");
        Values.add("PineApple");
        Values.add("Banana");
        Values.add("Sandia");
        Values.add("Nada");
        
     
         System.out.println("Before Sorting");
         System.out.println(Values);
String word1, word2;
boolean continueSwapping=true;
while(continueSwapping){
continueSwapping=false;
for(int i=0; i<Values.size()-1; i++){
word1=Values.get(i);
word2=Values.get(i+1);

if(compareStrings(word1.toLowerCase(), word2.toLowerCase())>1){
continueSwapping=true;
Values.set(i, word2);
Values.set(i+1, word1);
} 


System.out.println(Values); 

}
}
System.out.println(Values); 
        
        }
}