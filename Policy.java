public class Policy{

   private String policyNumber;
   private String providerName;
      
   /**
      No arg constructor for Policy class
   */
   public Policy(){
   
      policyNumber = "0000";
      providerName = "No Provider Set";
   }
   
   /**
      Arg constructor for Policy class
      @param policyNum Policy number as String
      @param provider  Policy provider
   */
   public Policy(String policyNum, String provider){
   
      policyNumber = policyNum;
      providerName = provider;
   }
   
   /**
      Method to set policy number
      @param policyNum Policy number as string
   */
   public void setPolicyNumber(String policyNum){
      
      policyNumber = policyNum;
   }
   /**
      Method to get policy number
      @return Policy number as string
   */
   public String getPolicyNumber(){
      
      return policyNumber;
   }
   
   /**
      Method to set Policy provider
      @param provider Policy provider
   */
   public void setProvider(String provider){
      
      providerName = provider;
   }
   /**
      Method to get Policy provider
      @return Policy provider
   */
   public String getProvider(){
   
      return providerName;
   }
   
   /**
      Method to calculate price of policy
      @return Calculated price as a double
   */
   public double getPrice(){
      
      double price = 600.00;
      
      if (holderAge > 50)
         price += 75.00;
      
      if (smokingStatus.equals("smoker"))
         price += 100.00;
         
      if (getBMI() > 35)
         price += ((getBMI() - 35) * 20);
         
      return price;
   }
   
   /**
      Method to return String object containing data from class fields
      @return Class field data as String
   **/
   public String toString() {
      
      String str = "Policy Number: " + policyNumber +
                   "\nProvider Name: " + providerName + "\n";
      return str;
   }
}