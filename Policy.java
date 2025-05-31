public class Policy{

   private String policyNumber;
   private String providerName;
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private String smokingStatus;
   private int heightInches;
   private int weightPounds;
   
   //No arg constructor
   public Policy(){
   
      policyNumber = "0000";
      providerName = "No Provider Set";
      holderFirstName = "No First Name Set";
      holderLastName = "No Last Name Set";
      holderAge = 0;
      smokingStatus = "No Status Set";
      heightInches = 0;
      weightPounds = 0;
   }
   
   //Arg constructor
   public Policy(String policyNum, String provider, String holderFN,
                 String holderLN, int age, String smokeStat,
                 int height, int weight){
   
      policyNumber = policyNum;
      providerName = provider;
      holderFirstName = holderFN;
      holderLastName = holderLN;
      holderage = age;
      smokingStatus = smokeStat;
      heightInches = height;
      weightPounds = weight;
   }
}