import java.util.ArrayList;
import java.util.*;
//second semester has arrays and ArrayLists which this program demonstrates

public class spellcheck {
    public static String Checker(String input)
    {
        //declared variables
        HashSet<String> wordsDict = new HashSet<String>();
        String[] wordsList = {"being", "brown", "currently", "dog", "fox", "is", "jumped", "lazy", "over", "program", "quick", "tested", "the", "This",}; //only words found in the demo sentences are listed for simplicity, and for demonstration
        ArrayList<String> incorrectWords = new ArrayList<String>();
        String[] sentenceWords = input.split("\\s+"); //splits sentence into list of words
        String incorrectWordsString = "";

        for(String s : wordsList) //makes list into an array
        {
            wordsDict.add(s);
        }
        for (int i = 0; i < sentenceWords.length; i++)//checks for incorrect words and adds them to incorrectWords
        {
                if(!(wordsDict.contains(sentenceWords[i])))
                {
                    incorrectWords.add(sentenceWords[i]);
                }
        } 
        for (String s : incorrectWords)//converts the arrayList incorrectWords to a String
        {
            incorrectWordsString += s + ", ";
        }
        if(incorrectWordsString.isEmpty())
        {
            incorrectWordsString = "no errors found in this sentence";//result prints that there are no errors if the string is blank
        }
        else
        {
            incorrectWordsString = incorrectWordsString.substring(0, incorrectWordsString.length() - 2);// removes the last comma and space
        }
            return incorrectWordsString;
    }
    public static void main(String[] args)
    {
        String sentence1 = ("the quick brown fox jumped over the lazy dog");
        String sentence2 = ("the quick brown foxx jumped over the lazzy dog");
        String sentence3 = ("This program is currently being tested");
        String sentence4 = ("This programm is curently being tested");
        
        String result1 = Checker(sentence1);
        System.out.println(result1);
        String result2 = Checker(sentence2);
        System.out.println(result2);
        String result3 = Checker(sentence3);
        System.out.println(result3);
        String result4 = Checker(sentence4);
        System.out.println(result4);
    }
}

