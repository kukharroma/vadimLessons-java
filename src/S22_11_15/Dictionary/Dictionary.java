package S22_11_15.Dictionary;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by roma on 22.11.15.
 */
public class Dictionary implements Translator<String, List<String>> {

    HashMap<String, List<String>> EnglishDictionary=new HashMap<>();
    HashMap<String, List<String>> UkraineDictionary=new HashMap<>();


    @Override
    public void putInEnglish(String s, List<String> strings) {
        EnglishDictionary.put(s, strings);
    }

    @Override
    public void putInUkraine(String s, List<String> strings) {
        UkraineDictionary.put(s, strings);
    }

    @Override
    public void removeFromEnglish(String s) {
        EnglishDictionary.remove(s);
    }

    @Override
    public void removeFromUkraine(String s) {
        UkraineDictionary.remove(s);
    }

    @Override
    public void translateFromEnglish(String s) {
        System.out.println(EnglishDictionary.get(s));
    }

    @Override
    public void translateFromUkraine(String s) {
        System.out.println(UkraineDictionary.get(s));
    }
}
