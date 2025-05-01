public class Addition {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }
}
// Go to jenkins click freestyle project
// Click "Add build step"


// Choose "Execute Windows batch command"
// cd "C:\Users\RAMEEZ\OneDrive\Desktop\Devops" - check this in vs code terminal
// javac Addition.java
// java Addition

// 3. Demonstrate Continuous Integration process in Jenkins. Build a java program every 2 minutes (addition of two numbers) residing in Github repository. 
// public class Addition {
//     public static void main(String[] args) {
//         int a = 10, b = 20;
//         int sum = a + b;
//         System.out.println("Sum of " + a + " and " + b + " is: " + sum);
//     }
// }
// Go to jenkins click free style project
// Under scm paste github link
//  Add Build Step
// Under Build section:
// Click Add build step → "Execute Windows batch command"
// javac Addition.java
// java Addition
// Skip cd for github one
// cd %WORKSPACE%


// Why It's Used
// It makes your build script portable and safe across jobs, without hardcoding paths like:
// bat
// CopyEdit
// cd C:\Users\RAMEEZ\Desktop\Devops


// 5. Add Build Trigger (Every 2 Minutes)
// Scroll to Build Triggers and check:
// ✅ Build periodically
//  Then in the box, type:
// CopyEdit
// H/2 * * * *

