package DSA2.ADVANCE_DSA.SORTING;

import java.util.*;
//You are developing a feature for Zomato that helps users find the nearest restaurants to their current location. It uses GPS to determine the user's location and has access to a database of restaurants, each with its own set of coordinates in a two-dimensional space representing their geographical location on a map. The goal is to identify the "B" closest restaurants to the user, providing a quick and convenient way to choose where to eat. Given a list of restaurant locations, denoted by A (each represented by its x and y coordinates on a map), and an integer B representing the number of closest restaurants to the user. The user's current location is assumed to be at the origin (0, 0).Here, the distance between two points on a plane is the Euclidean distance.You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in.),

// NOTE: Euclidean distance between two points P1(x1, y1) and P2(x2, y2) is sqrt( (x1-x2)2 + (y1-y2)2).

public class fifteen {
    // sort the restaurants on the basis of euclidean distance
    public static int[][] closestRestaurants(int[][] arr, int B) {
        Arrays.sort(arr, (a, b) -> {
            // Calculate the squared distance for restaurant a and restaurant b
            int distA = a[0] * a[0] + a[1] * a[1];
            int distB = b[0] * b[0] + b[1] * b[1];
            // Compare the distances
            return Integer.compare(distA, distB);
        });

        // extract the closest B restaurants
        int ans[][] = new int[B][2];
        for (int i = 0; i < B; i++) {
            ans[i] = arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] restaurants = { { 1, 3 }, { 2, -2 } };
        int B = 1;
        int[][] closest = closestRestaurants(restaurants, B);
        for (int[] res : closest) {
            System.out.println(Arrays.toString(res));
        }
    }
}
