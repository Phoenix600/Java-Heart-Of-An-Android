// import java classes here 
import java.util.*;

// Declare and define user classes here 
class UserAccount
{
  String name;
  int accountNumber;
  int balance;
  boolean savingsType;

  // static var for accout deletion purpose 
  static int count = 0;

  // Methods
  void getDetails()
  {
    Scanner Input = new Scanner(System.in);
    
    System.out.print("[+]Enter your name : ");
    name = Input.nextLine();

    System.out.print("[+]Enter account number : ");
    accountNumber = Input.nextInt();

    System.out.print("[+]Do you want this account to be Savings Account => Type Y/N : ");
    savingsType = Input.nextBoolean();


    // Default => State : 
    balance = 0;
      
    Input.close();
  }


  void deposit()
  {
    Scanner Input = new Scanner(System.in);

    System.out.print("[+]Enter the ammount to deposit : ");
    int temp = Input.nextInt(); 

    Input.close();
    // Validation 
    if(temp <= 0){ 
      System.out.print("Cann't Deposit\n"); 
      return ;
    }
    else{
    balance = balance + temp;
    return ;
    }

  }

  void withdrawn()
  {
    Scanner Input = new Scanner(System.in);
    System.out.print("[+]Enter the ammount to withdraw : ");

    int temp = Input.nextInt();
    Input.close();

    if(temp > balance && temp != balance)
    {
        System.out.print("Cann't withdraw the ammount\n");
        return;
    }
    else{
        balance = balance - temp;
        return;
    }

  }

  void displayUser()
  {
    System.out.printf("Name         : %s\n",name);
    System.out.printf("Account No.  : %d\n",accountNumber);
    System.out.printf("Account Type : %s\n",savingsType?"Savings":"Current");
    System.out.printf("Account Bal  : %d\n",balance);
  }

}


class ReserveBank
{

  UserAccount node;
  private List <UserAccount> DataBase;

  public ReserveBank()
  {
      UserAccount node = new UserAccount();
      this.DataBase = new ArrayList<UserAccount>();
  }

  void createAccount()
  {
     node.getDetails(); 
     this.DataBase.add(node);
  }

  void removeAccount()
  {
      Scanner Input = new Scanner(System.in);
      int index = 0;
      System.out.printf("[+]Enter your account number : ");
      int key = Input.nextInt();
      boolean flag = false;
        

      for(int i=0; i< DataBase.size(); i++)
      {
          if(key == DataBase.get(i).accountNumber)
          { 
            flag = true; 
            index = i;
            break;
          }

      }

      if(flag)
      {
          DataBase.remove(index); 
          return;
      }
      else{ 
        System.out.println("Account Doesn't Exists :("); 
        return; 
      }
  }

  void deposit()
  {
      Scanner Input = new Scanner(System.in);
      System.out.println("[+]Enter account number : ");
      int key = Input.nextInt();
      int index;
      boolean flag = false;

      // 0(N) in Worst-Case 
      for(int i=0; i< DataBase.size(); i++)
      {
        if(key == DataBase.get(i).accountNumber)
        { 
          index = i;
          flag = true;
          break;
        }
      }

      if()


  }

}

public class Main
{
    public static void main(String...args)
    {
      
    }
}

