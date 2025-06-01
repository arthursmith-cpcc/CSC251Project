import java.util.*;

public class Project_arthur_smith {
   
   public static void main(String[] args){
      
      //Declare and initialize variables
      String policyNum = " ";
      String provider = " ";
      String firstName = " ";
      String lastName = " ";
      int age = 0;
      String smokeStat = " ";
      double height = 0.0;
      double weight = 0.0;
      
      //Input method
      Scanner input = new Scanner(System.in);
      
      //Get input
      System.out.print("Please enter the Policy Number: ");
      policyNum = input.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      provider = input.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = input.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = input.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      age = input.nextInt();
      
      while(age < 0){
         
         System.out.print("Please enter a valid age: ");
         age = input.nextInt();
      }
      input.nextLine(); //Clear buffer
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokeStat = input.nextLine();
      
      while(!smokeStat.equals("smoker") && !smokeStat.equals("non-smoker")){
         
         System.out.print("Please enter a valid status (smoker/non-smoker): ");
         smokeStat = input.nextLine();
      }
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = input.nextDouble();
      
      while(height < 0){
         
         System.out.print("Please enter a valid height (in inches): ");
         height = input.nextDouble();
      }
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = input.nextDouble();
      
      while(weight < 0){
         
         System.out.print("Please enter a valid weight (in pounds): ");
         weight = input.nextDouble();
      }
      
      //Create new Policy instance
      Policy newPolicyOne = new Policy(policyNum, provider, firstName, lastName,
                                       age, smokeStat, height, weight);
      
      //Display policy info
      System.out.println();
      System.out.println("Policy Number: " + newPolicyOne.getPolicyNumber());
      System.out.println("Provider Name: " + newPolicyOne.getProvider());
      System.out.println("Policyholder's First Name: " + newPolicyOne.getFirstName());
      System.out.println("Policyholder's Last Name: " + newPolicyOne.getLastName());
      System.out.println("Policyholder's Age: " + newPolicyOne.getAge());
      System.out.println("Policyholder's Smoking Status: " + newPolicyOne.getSmokingStatus());
      System.out.printf("Policyholder's Height: %.1f inches\n", newPolicyOne.getHeight());
      System.out.printf("Policyholder's Weight: %.1f pounds\n", newPolicyOne.getWeight());
      System.out.printf("Policyholder's BMI: %.2f\n", newPolicyOne.getBMI());
      System.out.printf("Policy Price: $%.2f\n", newPolicyOne.getPrice());
   }
}