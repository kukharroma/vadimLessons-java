package S22_11_15.Dictionary;

import java.util.Arrays;

/**
 * Created by roma on 22.11.15.
 */
public class Main {
    public static void main(String[] args) {
        Dictionary EnglishDictionary = new Dictionary();
        Dictionary UkraineDictionary = new Dictionary();
        EnglishDictionary.putInEnglish("alcoholic", Arrays.asList("алкоголік", "питець", "той, що п'є", "пияка"));
        EnglishDictionary.putInEnglish("athlete", Arrays.asList("атлет", "учасник атлетичного змагання", "спортсмен", "фізкультурник"));
        EnglishDictionary.putInEnglish("fighter", Arrays.asList("боєць", "борець", "воїн"));
        UkraineDictionary.putInUkraine("алкоголік", Arrays.asList("alcoholic", "drinker", "dipsomaniac"));
        UkraineDictionary.putInUkraine("спортсмен", Arrays.asList("athlete", "sportsman", "champion"));
        UkraineDictionary.putInUkraine("борець", Arrays.asList("wrestler", "champion", "fighter"));
        EnglishDictionary.removeFromEnglish("athlete");
        UkraineDictionary.removeFromUkraine("спортсмен");
        EnglishDictionary.translateFromEnglish("alcoholic");
        UkraineDictionary.translateFromUkraine("алкоголік");
    }
}
