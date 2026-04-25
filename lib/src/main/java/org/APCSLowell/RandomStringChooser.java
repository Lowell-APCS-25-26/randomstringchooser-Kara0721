package org.APCSLowell;
import java.util.*;

// FRQ: https://secure-media.collegeboard.org/digitalServices/pdf/ap/ap16_frq_computer_science_a.pdf
public class RandomStringChooser {
    private ArrayList <String> words;
    public RandomStringChooser(String[]wordArray){
        words = new ArrayList<String>();
        for(int i = 0; i < wordArray.length; i++)
            words.add(wordArray[i]);
    }
    public String getNext(){
        while(words.size()>0){
            int k = (int)(Math.random()*words.size());
            return words.remove(k);
        }
        return "NONE";
    }
}
