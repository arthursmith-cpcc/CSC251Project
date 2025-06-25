public class PolicyHolder {
   
   private String firstName;
   private String lastName;
   private int holderAge;
   private String smokingStatus;
   private double heightInches;
   private double weightPounds;
   
   /**
      No arg constructor for PolicyHolder class
   **/
   public PolicyHolder() {
      
      firstName = "No First Name Set";
      lastName = "No Last Name Set";
      holderAge = 0;
      smokingStatus = "No Status Set";
      heightInches = 0.0;
      weightPounds = 0.0;   
   }
   
   /**
      Arg constructor for PolicyHolder class
      @param holderFN  First name of policyholder
      @param holderLN  Last name of policyholder
      @param age Policyholder's age as integer
      @param smokeStat Policyholder's smoking status
      @param height Policyholder's height as double
      @param weight Policyholder's weight as double
   */
   public PolicyHolder(String holderFN, String holderLN, int age,
                       String smokeStat, double height, double weight) {
      
      firstName = holderFN;
      lastName = holderLN;
      holderAge = age;
      smokingStatus = smokeStat;
      heightInches = height;
      weightPounds = weight;
   }
   
   /**
      Method to set policyholder's first name
      @param holderFN Policyholder's first name
   */
   public void setFirstName(String holderFN){
      
      firstName = holderFN;
   }
   /**
      Method to get policyholder's first name
      @return Policyholder's first name
   */
   public String getFirstName(){
      
      return firstName;
   }
   
   /**
      Method to set policyholder's last name
      @param holderLN Policyholder's last name
   */
   public void setLastName(String holderLN){
      
      lastName = holderLN;
   }
   /**
      Method to get policyholder's last name
      @return Policyholder's last name
   */
   public String getLastName(){
      
      return lastName;
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
}