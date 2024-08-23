package DSA2.ADVANCE_DSA.RECURSION;

// tower of hanoi

public class fourteen {
    public static void towerOfHanoi(int totalNoOfDisks, String source, String helper, String destination) {

        if (totalNoOfDisks == 1) {
            System.out.println("transfer disk " + totalNoOfDisks + "from " + source + " " + "to " + destination);
            return;
        }

        // move n - 1 disks to source to helper
        towerOfHanoi(totalNoOfDisks - 1, source, destination, helper);
        // move 1st disk from source to destination
        System.out.println("transfer disk " + totalNoOfDisks + "from " + source + " " + "to " + destination);
        // move n - 1 disks from helper to desctination
        towerOfHanoi(totalNoOfDisks - 1, helper, source, destination);

    }

    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "S Tower", "H Tower", "D Tower");

    }
}
