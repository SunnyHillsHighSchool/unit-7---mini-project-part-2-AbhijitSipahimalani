import java.util.ArrayList;

public class ComputingStatistics {
   /**
   * The ArrayList containing all of the loan data.
   */
   private ArrayList<Loan> data;
   
   /**
    * Creates a new ComputingStatistics object with an empty ArrayList 
    */
   public ComputingStatistics() {
      data = new ArrayList<Loan>();
   }
   
   /**
    * Creates a new ComputingStatistics object with the data passed in
    */
   public ComputingStatistics(ArrayList<Loan> d) {
      data = d;
   }
   
   /**
    * Calclates the total amount funded from all of the loans in the file.
    * @return the total loan amount.
    */
   public double totalAmount() {
      double amount = 0.0;
      for(int i = 0; i < data.size(); i++) {
         amount = amount + data.get(i).getLoanAmount();
      }
      return amount;
   }
    public double avgLoan {
      double amount = 0.0;
      for(int i = 0; i < data.size(); i++){
        amount += data.get(i).getLoanAmount();
      }
      amount /= (double)data.size();
      return amount;
    }
      public double largestLoan {

        double amount = data.get(i).getLoanAmount();
        for(int i = 0; i < data.size(); i++) {
        if data.get(i).getLoanAmount() > amount{
          amount =  data.get(i).getLoanAmount();
        }
      }
    return amount;    
    }
    public double smallestLoan {

      double amount = data.get(0).getLoanAmount();
      for(int i = 0; i < data.size(); i++) {
        if data.get(i).getLoanAmount() < amount{
          amount =  data.get(i).getLoanAmount();
        }
      }
    return amount;    
    }
  
    public String smallestLoanCountry{
      double amount = data.get(0).getLoanAmount();
      String country = "";
        for(int i = 0; i  < data.size(); i++){
        if data.get(i).getLoanAmount() < amount {
          country = data.get(i).getCountry();
          amount = data.get(i).getLoanAmount();
        }
        }
      return country;
    }
    public String largestLoanCountry{
      double amount = data.get(0).getLoanAmount();
      String country = "";
        for(int i = 0; i  < data.size(); i++){ 
          if data.get(i).getLoanAmount() > amount {
          country = data.get(i).getCountry;
          amount = data.get(i).getLoanAmount;
        }
      }
    return country;
    }
    public double avgDaysToFund{
      double avgdays = 0.0;
      for(int i = 0; i < data.size(); i++){
        avgdays += data.get(i).getDaysToFund();
      }
      avgdays /= (double)data.size();
      return avgdays;
    }
    
    public double largestLoanKenya{
      double amount= 0.0;
      for(int i = 0; i < data.size(); i++){
        if (data.get(i).getCountry() == "Kenya")
          if (data.get(i).getLoanAmount > amount)
            amount = data.get(i).getLoanAmount();
      }
      return amount;
    }

    public double avgLoanPhillippines {
      double amount = 0.0;
      int num = 0;
      for(int i = 0; i < data.size(); i++){
        if(data.get(i).getCountry() == "Phillippines"){          
          amount += (double)data.get(i).getLoanAmount();
          num ++;
        }
      }
      return amount / (double)num;
    }
}