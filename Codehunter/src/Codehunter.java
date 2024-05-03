
import java.util.*;

/**
 *
 * @author arunk
 */
public class Codehunter {
   public static void main(String args[] ) throws Exception {
       // Get the number of test cases
       try (Scanner scanner = new Scanner(System.in)) {
           // Get the number of test cases
           int t = scanner.nextInt();
           
           for (int i = 0; i < t; i++) {
               // Read input for Paul
               int p = scanner.nextInt();
               int x = scanner.nextInt();
               int r1 = scanner.nextInt();
               
               // Read input for Nina
               int n = scanner.nextInt();
               int y = scanner.nextInt();
               int r2 = scanner.nextInt();
               
               // Determine who reaches first and print the result
               String result = whoReachesFirst(p, x, r1, n, y, r2);
               System.out.println(result);
               
               
           }  }
  }

  public static String whoReachesFirst(int p, int x, int r1, int n, int y, int r2) {
    // Time taken for repairs by Paul and Nina (in hours)
    double paulRepairTime = r1;
    double ninaRepairTime = r2;

    // Time taken to travel to the meeting point without repairs (in hours)
    double paulTravelTime = (double) p / x;
    double ninaTravelTime = (double) n / y;

    // Total time taken by Paul (including repairs)
    double totalTimePaul = paulTravelTime + paulRepairTime;

    // Total time taken by Nina (including repairs)
    double totalTimeNina = ninaTravelTime + ninaRepairTime;

    // Determine who reaches first
    if (totalTimePaul < totalTimeNina) {
      return "PAUL \n" +(int)totalTimePaul;
    } else if (totalTimePaul > totalTimeNina) {
      return "NINA \n" + (int)totalTimeNina;
    } else 
    {
      return "BOTH \n" + (int)totalTimePaul;  // They reach at the same time
    }
  }
}

	