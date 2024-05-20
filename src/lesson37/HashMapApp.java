package lesson37;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {
        final String word = "AZERBAIJAN";
        char[] charArray = word.toCharArray();
        Map <Character, Integer> hashMap = new HashMap<>();
//        char chr = '';

        for (char chr: charArray) {
//            Integer count = hashMap.getOrDefault(chr, 0);
//            if (!count.equals(null)) {
                hashMap.merge(chr, 1, Integer:: sum);
//                hashMap.merge(chr, count, Integer:: sum);
//                hashMap.put(chr, count + 1);
//            }
//            if (hashMap.containsKey(chr)) {
//                Integer count = hashMap.get(chr);
//
//                hashMap.put(chr, count + 1);
//            }
//            else {
//                    hashMap.put(chr, 1);
//                }
//            if (chr == charArray[i]) {
//                hashMap.put(chr, i);
//            }
        }
        System.out.println(hashMap);

//        Map <Character, Integer> hashMap = new HashMap<>();
//        @Override
//        public Integer apply (Integer integer, Integer integer2) {
//            return integer + integer2;
//        }
    }
}
