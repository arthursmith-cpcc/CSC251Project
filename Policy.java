public class Policy{

   private String policyNumber;
   private String providerName;
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private String smokingStatus;
   private double heightInches;
   private double weightPounds;
   
   //No arg constructor
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
   
   //Arg constructor
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
   
   //Set policy number
   public void setPolicyNumber(String policyNum){
      
      policyNumber = policyNum;
   }
   //Get policy number
   public String getPolicyNumber(){
      
      return policyNumber;
   }
   
   //Set provider name
   public void setProvider(String provider){
      
      providerName = provider;
   }
   //Get provider name
   public String getProvider(){
   
      return providerName;
   }
   
   //Set policy holder first name
   public void setFirstName(String holderFN){
      
      holderFirstName = holderFN;
   }
   //Get policy holder first name
   public String getFirstName(){
      
      return holderFirstName;
   }
   
   //Set policy holder last name
   public void setLastName(String holderLN){
      
      holderLastName = holderLN;
   }
   //Get policy holder first name
   public String getLastName(){
      
      return holderLastName;
   }
   
   //Set policy holder age
   public void setAge(int age){
      
      holderAge = age;
   }
   //Get policy holder age
   public int getAge(){
      
      return holderAge;
   }
   
   //Set smoking status
   public void setSmokingStatus(String smokeStat){
      
      smokingStatus = smokeStat;
   }
   //Get smoking status
   public String getSmokingStatus(){
      
      return smokingStatus;
   }
   
   //Set height
   public void setHeight(double height){
      
      heightInches = height;
   }
   //Get height
   public double getHeight(){
      
      return heightInches;
   }
   
   //Set weight
   public void setWeight(double weight){
      
      weightPounds = weight;
   }
   //Get weight
   public double getWeight(){
      
      return weightPounds;
   }
   
   //BMI calculation
   public double getBMI(){
      
      double BMI = (weightPounds*703)/(heightInches*heightInches);
      return BMI;
   }
   
   //Policy price calculation
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