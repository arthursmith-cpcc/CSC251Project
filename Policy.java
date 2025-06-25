public class Policy{

   private String policyNumber;
   private String providerName;
   private PolicyHolder customer;
   
   private static int policyCount = 0;
      
   /**
      No arg constructor for Policy class
   */
   public Policy(){
   
      policyNumber = "0000";
      providerName = "No Provider Set";
      customer = new PolicyHolder();
      policyCount++;
   }
   
   /**
      Arg constructor for Policy class
      @param policyNum Policy number as String
      @param provider  Policy provider
      @param newPH PolicyHolder object for deep copy
   */
   public Policy(String policyNum, String provider, PolicyHolder newPH){
   
      policyNumber = policyNum;
      providerName = provider;
      customer = new PolicyHolder(newPH);
      policyCount++;
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
      Method to set PolicyHolder
      @param newPH PolicyHolder object for deep copy
   **/
   public void setPolicyHolder(PolicyHolder newPH) {
   
      customer = new PolicyHolder(newPH);
   }
   
   /**
      Method to get PolicyHolder object
      @return Deep copy of PolicyHolder object
   **/
   public PolicyHolder getPolicyHolder() {
      
      PolicyHolder newPH = new PolicyHolder(customer);
      return newPH;
   }
   
   /**
      Method to calculate price of policy
      @return Calculated price as a double
   */
   public double getPrice(){
      
      double price = 600.00;
      PolicyHolder customerCopy = new PolicyHolder(customer);
            
      if (customerCopy.getAge() > 50)
         price += 75.00;
      
      if (customerCopy.getSmokingStatus().equals("smoker"))
         price += 100.00;
         
      if (customerCopy.getBMI() > 35)
         price += ((getBMI() - 35) * 20);
         
      return price;
   }
   
   /**
      Method to return String object containing data from class fields
      @return Class field data as String
   **/
   public String toString() {
      
      String str = "Policy Number: " + policyNumber +
                   "\nProvider Name: " + providerName + "\n" + customer;
      return str;
   }
   
   /** 
      Method to return number of policy objects created
      @return Number of policy objects as int from static counter field
   **/
   public int getPolicyCount() {
      
      return policyCount;
   }
}