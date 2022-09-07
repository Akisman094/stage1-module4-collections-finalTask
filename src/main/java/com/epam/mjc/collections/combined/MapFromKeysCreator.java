package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> wordLengths = new HashMap<>();
        for(String numStr : sourceMap.keySet())
            if(wordLengths.containsKey(numStr.length()))
                wordLengths.get(numStr.length()).add(numStr);
            else
                wordLengths.put(numStr.length(), new HashSet<>(List.of(numStr)));

        return wordLengths;
    }
}
