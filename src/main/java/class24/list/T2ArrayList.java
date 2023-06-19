package class24.list;

import java.util.ArrayList;

public class T2ArrayList {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("fade");
        words.add("fiat");
        words.add("ford");
        words.add("blade");
        words.add("ford");
        System.out.println(words);
        words.get(3);

  /*      for(String word:words){
            if(word.endsWith("e")){    // when it change it's size enhanced for loop, it doesn't work
                words.remove(word);
            }
        }
*/
        /*for (int i = 0; i < words.size(); i++) {
            String s = words.get(i);
            if(s.endsWith("e")){
                words.remove(s);
                i--;    // when it finds the matching word which contains e , it removes
            }            // adjusting the index back to same index to fix the shifting, to check i < words.size()
        }              //before it satisfies i++ condition
        System.out.println(words);*/
    }


}
