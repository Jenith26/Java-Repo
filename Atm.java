import java.util.Scanner;
class Atm{	
		
			String userName="Jenith";
			int passWord=2001;
  			float availableBalance=0.0f;
			String cont;
			Scanner s= new Scanner(System.in);
			
			void userBank()
			{
			System.out.println("Enter your name:");
			String name=s.nextLine();
			System.out.println("Enter your password");
			int pass=s.nextInt();
			if(userName!=name &&  passWord!=pass )
			{
				System.out.println("Sorry try with correct name and password");
			}
			else{
				System.out.println("Welcome"+" "+name);
				do{
				System.out.println("Enter your choice:1.Deposit,2.Withdraw,3.Balance_Enquiry,4.Checkbook,5.Mini_Statement");
				int choice=s.nextInt();
				switch(choice)
						{
							case 1:
									Deposit();
									break;
							case 2:
									Withdraw();
									break;
							case 3:
									BalanceEnquiry();
									break;
							/*case 4:
									Checkbook();
									break;
							case 5:
 									MiniStatement();
									break;*/
							
							default:
									System.out.println("Enter the valid choice");
						}
					System.out.println("Do you want to continue?....(Y/N)");
					cont=s.next();
					if(cont.equals("N")){
						System.out.println("Thanks for your Transaction");
					}
			}while(cont.equals("Y"));
		}
}
		 	float Deposit()
			{
				System.out.println("Enter the deposit amount");
				int dep=s.nextInt();
				availableBalance=dep+availableBalance;
				System.out.println("Your Amount deposit successfully");
				return availableBalance;
			}
			float Withdraw()
			{
				System.out.println("Enter the Withdraw amount");
				int wd=s.nextInt();
				if(wd<availableBalance && wd>=0 && wd==availableBalance)
				{
					System.out.println("Sorry Wrong amount");
				}
				else if(wd>availableBalance){
					System.out.println("Insufficient Fund");
				}
				else
				{
				availableBalance=wd-availableBalance;
				}
				return availableBalance;
			}
			void  BalanceEnquiry()
			{
				
				System.out.println(availableBalance);
			}
		
		public static void main(String args[])
			{
				Atm iob=new Atm();
				iob.userBank();
			}
				
				
}
				
								
							
			


      			
				