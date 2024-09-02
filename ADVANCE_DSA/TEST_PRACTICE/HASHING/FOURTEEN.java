package DSA2.ADVANCE_DSA.TEST_PRACTICE.HASHING;

import java.util.*;

// Count of distinct elements in every window of size B
public class FOURTEEN {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 3, 1, 2, 1 };
        int B = 4;
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        // create the window of size B
        for (int i = 0; i < B; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        ans.add(map.size());

        // slide the window across the window
        for (int i = B; i < arr.length; i++) {
            // remove the element that is sliding out of the window
            int outgoing = arr[i - B];
            if (map.get(outgoing) == 1) {
                map.remove(outgoing);
            } else {
                map.put(outgoing, map.get(outgoing) - 1);
            }

            // Add the new element that is adding in the window
            int incoming = arr[i];
            map.put(incoming, map.getOrDefault(incoming, 0) + 1);

            ans.add(map.size());
        }

        System.out.println(ans);

    }
}
