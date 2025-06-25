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
            PolicyHolder newCustomer = new PolicyHolder(firstName, lastName, age, smokeStat,
                                                        height, weight);
            Policy newPolicy = new Policy(policyNum, provider, newCustomer);
            
            //Add new policy to arraylist
            allPolicies.add(newPolicy);
         }
      }
            
      //Display policy info from arraylist
      int smokerPolicy = 0; //Accumulator for smoker policy count
      int nonSmokerPolicy = 0; //Accumulator for non-smoker policy count
      
      for(int i = 0; i < allPolicies.size(); i++) {
      
         Policy newPolicyOne = allPolicies.get(i);
         PolicyHolder tempCustomer = newPolicyOne.getPolicyHolder();
         String status = tempCustomer.getSmokingStatus();
      
         System.out.print(newPolicyOne);
         System.out.printf("Policyholder's BMI: %.2f\n", tempCustomer.getBMI());
         System.out.printf("Policy Price: $%.2f\n", newPolicyOne.getPrice());
         System.out.println();
         
         if(status.equals("smoker"))
            smokerPolicy++;
         else
            nonSmokerPolicy++;
      }
      
      System.out.printf("There were %d Policy objects created.\n\n", allPolicies.get(0).getPolicyCount());      
      System.out.printf("The number of policies with a smoker is: %d\n", smokerPolicy);
      System.out.printf("The number of policies with a non-smoker is: %d", nonSmokerPolicy);
   }
}