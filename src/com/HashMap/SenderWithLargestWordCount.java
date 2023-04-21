package com.HashMap;
//https://leetcode.com/problems/sender-with-largest-word-count/

import java.util.HashMap;
import java.util.Map;

public class SenderWithLargestWordCount {
    public static void main(String[] args) {
        String[] messages = {"Hello userTwooo", "Hi userThree", "Wonderful day Alice", "Nice day userThree"};
        String[] senders = {"Alice", "userTwo", "userThree", "Alice"};
        System.out.println(largestWordCount(messages, senders));
    }

    public static String largestWordCount(String[] messages, String[] senders) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < senders.length; i++) {
            map.put(senders[i], map.getOrDefault(senders[i], 0) + lenCount(messages[i]));
        }

        String maxSender = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String sender = entry.getKey();
            int count = entry.getValue();
            if (count > maxCount || (count == maxCount && sender.compareTo(maxSender) > 0)) {
                maxCount = count;
                maxSender = sender;
            }
        }
        return maxSender;
    }

    public static int lenCount(String s) {
        int count = 0;
        for (String i : s.split(" ")) count++;
        return count;
    }
}
