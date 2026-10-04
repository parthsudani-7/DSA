import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String firstSentence, String secondSentence) {
        HashMap<String, Integer> wordFrequency = new HashMap<>();

        addWords(firstSentence, wordFrequency);
        addWords(secondSentence, wordFrequency);

        ArrayList<String> uncommonWords = new ArrayList<>();

        for (String currentWord : wordFrequency.keySet()) {
            if (wordFrequency.get(currentWord) == 1) {
                uncommonWords.add(currentWord);
            }
        }

        return uncommonWords.toArray(new String[0]);
    }

    private void addWords(String currentSentence, HashMap<String, Integer> wordFrequency) {
        String[] sentenceWords = currentSentence.split(" ");

        for (String currentWord : sentenceWords) {
            wordFrequency.put(currentWord, wordFrequency.getOrDefault(currentWord, 0) + 1);
        }
    }
}
