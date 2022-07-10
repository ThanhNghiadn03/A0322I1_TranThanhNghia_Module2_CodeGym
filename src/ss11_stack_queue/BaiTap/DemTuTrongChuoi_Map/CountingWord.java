package ss11_stack_queue.BaiTap.DemTuTrongChuoi_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CountingWord {
    public static void countingWord(String sentence) {
        Map<String , Integer> mapWord = new TreeMap<>();
        String word = "";
        sentence = sentence.toLowerCase();
        for (int i=0 ; i<sentence.length() ; i++) {
            if (sentence.charAt(i) != ' ') {
                word += sentence.charAt(i);
                if (i == (sentence.length()-1)) {
                    if (mapWord.containsKey(word)) {
                        mapWord.put(word,mapWord.get(word)+1);
                    }else {
                        mapWord.put(word,1);
                    }
                }
            } else {
                if (mapWord.containsKey(word)) {
                    mapWord.put(word,mapWord.get(word)+1);
                    word = "";
                } else {
                    mapWord.put(word,1);
                    word = "";
                }
                word = "";
            }
        }
        Set<String> keySet = mapWord.keySet();
        for (String key : keySet) {
            System.out.println(key + " : "+ mapWord.get(key));
        }
    }
}
