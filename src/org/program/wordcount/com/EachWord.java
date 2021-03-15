package org.program.wordcount.com;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;




public class EachWord {

           public static void main(String[] args) {
            System.out.println("Test");
            //str to count
            String str = "phani kumar kandibanda";

            // p -1 , h -1, ...
// used map to store
            Map<Character, AtomicInteger> map = new HashMap<>();

            for (int i = 0; i < str.length(); i++) {
                Character ch = str.charAt(i);

                if (ch == ' ') {
                    continue;
                }

                if (map.containsKey(ch) ) {
                    map.get(ch).getAndIncrement();
                } else {
                    map.put(ch, new AtomicInteger(1));
                }
            }

            map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
        }



    }


