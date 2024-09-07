package DSA2.ADVANCE_DSA.TEST_PRACTICE.HASHING_NEW;

import java.util.*;

// Find itinerary from tickets
public class FIVE {

    public static String getStartingPoint(HashMap<String, String> ticketMap) {
        HashMap<String, String> reverseMap = new HashMap<>();
        for (String key : ticketMap.keySet()) {
            // add elements in reverse map
            reverseMap.put(ticketMap.get(key), key);

        }

        for (String key : ticketMap.keySet()) {
            if (!reverseMap.containsKey(key)) {
                return key;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStartingPoint(tickets);
        while (tickets.containsKey(start)) {
            System.out.print(start + " -> ");
            start = tickets.get(start);
        }

        System.out.println(start);

    }
}
