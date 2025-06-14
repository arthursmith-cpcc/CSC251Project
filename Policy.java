public class Policy{

   private String policyNumber;
   private String providerName;
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private String smokingStatus;
   private double heightInches;
   private double weightPounds;
   
   /**
      No arg constructor for Policy class
   */
   public Policy(){
   
      policyNumber = "0000";
      providerName = "No Provider Set";
      holderFirstName = "No First Name Set";
      holderLastName = "No Last Name Set";
      holderAge = 0;
      smokingStatus = "No Status Set";
      heightInches = 0.0;
      weightPounds = 0.0;
   }
   
   /**
      Arg constructor for Policy class
      @param policyNum Policy number as String
      @param provider  Policy provider
      @param holderFN  First name of policyholder
      @param holderLN  Last name of policyholder
      @param age Policyholder's age as integer
      @param smokeStat Policyholder's smoking status
      @param height Policyholder's height as double
      @param weight Policyholder's weight as double
   */
   public Policy(String policyNum, String provider, String holderFN,
                 String holderLN, int age, String smokeStat,
                 double height, double weight){
   
      policyNumber = policyNum;
      providerName = provider;
      holderFirstName = holderFN;
      holderLastName = holderLN;
      holderAge = age;
      smokingStatus = smokeStat;
      heightInches = height;
      weightPounds = weight;
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
      Method to set policyholder's first name
      @param holderFN Policyholder's first name
   */
   public void setFirstName(String holderFN){
      
      holderFirstName = holderFN;
   }
   /**
      Method to get policyholder's first name
      @return Policyholder's first name
   */
   public String getFirstName(){
      
      return holderFirstName;
   }
   
   /**
      Method to set policyholder's last name
      @param holderLN Policyholder's last name
   */
   public void setLastName(String holderLN){
      
      holderLastName = holderLN;
   }
   /**
      Method to get policyholder's last name
      @return Policyholder's last name
   */
   public String getLastName(){
      
      return holderLastName;
   }
   
   /**
      Method to set policyholder's age
      @param age Policyholder's age as an integer
   */
   public void setAge(int age){
      
      holderAge = age;
   }
   /**
      Method to get policyholder's age
      @return Policyholder's age as an integer
   */
   public int getAge(){
      
      return holderAge;
   }
   
   /**
      Method to set policyholder's smoking status
      @param smokeStat Policyholder's smoking status
   */
   public void setSmokingStatus(String smokeStat){
      
      smokingStatus = smokeStat;
   }
   /**
      Method to get policyholder's smoking status
      @return Policyholder's smoking status
   */
   public String getSmokingStatus(){
      
      return smokingStatus;
   }
   
   /**
      Method to set policyholder's height
      @param height Policyholder's height in inches as a double
   */
   public void setHeight(double height){
      
      heightInches = height;
   }
   /**
      Method to get policyholder's height
      @return Policyholder's height in inches as a double
   */
   public double getHeight(){
      
      return heightInches;
   }
   
   /**
      Method to set policyholder's weight
      @param weight Policyholder's weight in pounds as a double
   */
   public void setWeight(double weight){
      
      weightPounds = weight;
   }
   /**
      Method to get policyholder's weight
      @return Policyholder's weight in pounds as a double
   */
   public double getWeight(){
      
      return weightPounds;
   }
   
   /**
      Method to calculate policyholder's BMI
      @return Calculated BMI as a double
   */
   public double getBMI(){
      
      double BMI = (weightPounds*703)/(heightInches*heightInches);
      return BMI;
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
}