package org.example.helpers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamHealper {
    public List<Integer> exchangePlusToMinus(ArrayList<Integer> list) {
      return list.stream().map(Math::abs).collect(Collectors.toList());
    }

    public List<Integer> plus100ForCountableAndMinus100ForUncountable(ArrayList<Integer> list) {
        return list.stream().map(x-> {
            if (x%2 == 0) {
               return x + 100;
            } else {
               return x - 100;
            }
        }).collect(Collectors.toList());
    }

    public List<String> getLastNamesStartsWithA(ArrayList<String> list) {
        return list.stream().filter(x->x.startsWith("A")).collect(Collectors.toList());
    }
}
