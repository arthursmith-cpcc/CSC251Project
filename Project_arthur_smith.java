import java.util.*;
import java.io.*;

public class Project_arthur_smith {
   
   public static void main(String[] args) throws IOException {
      
      //Declare and initialize variables
      String policyNum = " ";
      String provider = " ";
      String firstName = " ";
      String lastName = " ";
      int age = 0;
      String smokeStat = " ";
      double height = 0.0;
      double weight = 0.0;
      
      //ArrayList for policies
      ArrayList<Policy> allPolicies = new ArrayList<>();      
      
      //Open source file
      try(Scanner inputFile = new Scanner(new File("PolicyInformation.txt"))){
         
         while(inputFile.hasNext()){
            
            //Get input data for Policy from source file
            policyNum = inputFile.nextLine();
            provider = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();
            age = inputFile.nextInt();
            inputFile.nextLine(); //clear buffer
            smokeStat = inputFile.nextLine();
            height = inputFile.nextDouble();
            weight = inputFile.nextDouble();
            
            //Eat blank dividing line(s) between policies
            inputFile.nextLine();
            if(inputFile.hasNext())
               inputFile.nextLine();
            
            //Create policy instance
            Policy newPolicy = new Policy(policyNum, provider, firstName, lastName,
                                          age, smokeStat, height, weight);
            
            //Add new policy to arraylist
            allPolicies.add(newPolicy);
         }
      }
            
      //Display policy info from arraylist
      int smokerPolicy = 0; //Accumulator for smoker policy count
      int nonSmokerPolicy = 0; //Accumulator for non-smoker policy count
      
      for(int i = 0; i < allPolicies.size(); i++) {
      
         Policy newPolicyOne = allPolicies.get(i);
         String status = newPolicyOne.getSmokingStatus();
      
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
         System.out.println();
         
         if(status.equals("smoker"))
            smokerPolicy++;
         else
            nonSmokerPolicy++;
      }
      
      System.out.printf("The number of policies with a smoker is: %d\n\n", smokerPolicy);
      System.out.printf("The number of policies with a non-smoker is: %d", nonSmokerPolicy);
   }
}