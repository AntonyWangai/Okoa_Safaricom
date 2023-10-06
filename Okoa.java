package Pop_up;
import java.util.Scanner;
public class Okoa {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int choice1,choice2,choice3, choice4,choice5,choice6, choice7,choice8, choice9,choice10,choice11, choice12,choice13, choice14,choice15,choice16, choice17,choice18;
		int repeater=0;
//We print out the menu list
	
	do { System.out.println("0:Sh20 (30mins, 3hrs)\n1:Sh50(40Mins+50SMS,24hrs)\n2:Okoa Easy Sh100(100 Mins,2days)\n3:Okoa 250\n4:Okoa 100\n5:Okoa 50\n6:Okoa 20\n7:Okoa 10\n8:Okoa 5\n98:More");
       
       choice1=in.nextInt();
       //We use the switch case to allow each option to have different options in it
	switch (choice1)
	{
	case 0 -> {
		System.out.println("Existing Unpaid Okoa:0\nNew Okoa request:20\nTOTAL DEBT will be:20\n1.Accept\n2:Decline\n0:BACK\t00:HOME");
	choice2=in.nextInt();
	if(choice2==1) System.out.println("Your request has been received and is being processed");
	else if (choice2==2){ System.out.println("Thank you for using Safaricom");}
	else if (choice2==0||choice2==00)repeater++;
	else {System.out.println("Ivalid option");}
	
	}
	case 1 -> {System.out.println("Existing Unpaid Okoa:0\nNew Okoa request:50\nTOTAL DEBT will be:50\n1.Accept\n:Decline\n0:BACK\t00:HOME");
	choice3=in.nextInt();
	if(choice3==1) System.out.println("Your request has been received and is being processed");
	else if (choice3==2){ System.out.println("Thank you for using Safaricom");}
	else if (choice3==0||choice3==00)repeater++;
	else {System.out.println("Ivalid option");}
	}
	case 2 -> {System.out.println("Existing Unpaid Okoa:0\nNew Okoa request:100\nTOTAL DEBT will be:100\n1.Accept\n:Decline\n0:BACK\t00:HOME");
	choice4=in.nextInt();
	if(choice4==1) System.out.println("Your request has been received and is being processed");
	else if (choice4==2){ System.out.println("Thank you for using Safaricom");}
	else if (choice4==0||choice4==00)repeater++;
	else {System.out.println("Ivalid option");}
	}
	case 3 ->{System.out.println("Existing Unpaid Okoa:0\nNew Okoa request:250\nTOTAL DEBT will be:250\n1.Accept\n:Decline\n0:BACK\t00:HOME");
	choice5=in.nextInt();
	if(choice5==1) System.out.println("Your request has been received and is being processed");
	else if (choice5==2){ System.out.println("Thank you for using Safaricom");}
	else if (choice5==0||choice5==00)repeater++;
	else {System.out.println("Ivalid option");}
	}
	
	case 4 ->{ System.out.println("Unpaid Okoa:0\nNew Okoa:100\nTotal Okoa will be:100\n1.Accept\n2:Or GET EXTRA (CONVERT TO 170 bob Kredo for Calls & SMS valid midnight)\n0:BACK\t00:HOME");
	choice6=in.nextInt();
	if(choice6==1) System.out.println("Your request has been received and is being processed");
	else if (choice6==2){ System.out.println("Thank you for using Safaricom");}
	else if (choice6==0||choice6==00)repeater++;
	else {System.out.println("Ivalid option");}
	}
	
	case 5 -> {System.out.println("Unpaid Okoa:0\nNew Okoa:50\nTotal Okoa will be:50\n1.Accept\n2:Or GET EXTRA (CONVERT TO 150 bob Kredo for Calls & SMS valid midnight)\n0:BACK\t00:HOME");
	choice7=in.nextInt();
	if(choice7==1) System.out.println("Your request has been received and is being processed");
	else if (choice7==2){ System.out.println("Thank you for using Safaricom");}
	else if (choice7==0||choice7==00)repeater++;
	else {System.out.println("Ivalid option");}
	}
	
	case 6 -> {System.out.println("Unpaid Okoa:0\nNew Okoa:20\nTotal Okoa will be:20\n1.Accept\n2:Or GET EXTRA (CONVERT TO 50 bob Kredo for Calls & SMS valid midnight)\n0:BACK\t00:HOME");
	choice8=in.nextInt();
	if(choice8==1) System.out.println("Your request has been received and is being processed");
	else if (choice8==2){ System.out.println("Thank you for using Safaricom");}
	else if (choice8==0||choice8==00)repeater++;
	else {System.out.println("Ivalid option");}
	}
	
	case 7 -> {System.out.println("Unpaid Okoa:0\nNew Okoa:10\nTotal Okoa will be:10\n1.Accept\n2:Or GET EXTRA (CONVERT TO 17 bob Kredo for Calls & SMS valid midnight)\n0:BACK\t00:HOME");
	choice9=in.nextInt();
	if(choice9==1) System.out.println("Your request has been received and is being processed");
	else if (choice9==2){ System.out.println("Thank you for using Safaricom");}
	else if (choice9==0||choice9==00)repeater++;
	else {System.out.println("Ivalid option");}
	}
	case 8 -> {System.out.println("Existing Unpaid Okoa:0\nNew Okoa request:5\nTOTAL DEBT will be:5\n1.Accept\n0:BACK\t00:HOME");
	choice10=in.nextInt();
	if(choice10==1) System.out.println("Your request has been received and is being processed");
	else if (choice10==2){ System.out.println("Thank you for using Safaricom");}
	else if (choice10==0||choice10==00)repeater++;
	else {System.out.println("Ivalid option");}
	}
	
	case 98 ->{System.out.println("9:Okoa Internet\n10:Okoa Minutes\n11:Okoa SMS\n12:Lipa Okoa\n#Check Balance\n0:BACK");
	choice11=in.nextInt();
	{
	
	 switch(choice11)
	 {
	 case 9->{System.out.println("Okoa bundles\n1:Sh20(900MB,1hr)\n2:Sh50(1400MB,3hrs)\n3:Sh99(675MB,24hrs)\n4:Sh50(270MB,24hrs)\n5:Sh20(90MB,24hrs)\n6:Sh10(30MB,24hrs)\n98:More\t0:BACK");
	 choice12=in.nextInt();
	 
	 if(choice12==1) {System.out.println("OKOA 900MB@Sh20 for 1hr\n1:Accept\n2:Decline\n0:BACK\t00:HOME");
	 choice13=in.nextInt();
	 
	  if(choice13==1) System.out.println("Your request has been received and is being processed");
		else if (choice13==2){ System.out.println("Thank you for using Safaricom");}
		else if (choice13==0||choice13==00)repeater++;
		else {System.out.println("Ivalid option");}
	}
	 else if(choice12==2) {System.out.println("OKOA 1400MB@Sh50 for 3hr\n1:Accept\n2:Decline\n0:BACK\t00:HOME");
	 choice14=in.nextInt();
	 {
		  if(choice14==1) System.out.println("Your request has been received and is being processed");
			else if (choice14==2) System.out.println("Thank you for using Safaricom");
			else if (choice14==0||choice14==00)repeater++;
			else {System.out.println("Ivalid option");}
	}
		  }
	 else if(choice12==3) { System.out.println("OKOA 675@Sh99 for 24hrs\n1:Accept\n2:Decline\n0:BACK\t00:HOME");
	 choice15=in.nextInt();
	 {
		  if(choice15==1) System.out.println("Your request has been received and is being processed");
			else if (choice15==2) System.out.println("Thank you for using Safaricom");
			else if (choice15==0||choice15==00)repeater++;
			else {System.out.println("Ivalid option");
	}
	 }
	 }
	 
	 else if(choice12==4) { System.out.println("OKOA 270MB@Sh50 for 24hr\n1:Accept\n2:Decline\n0:BACK\t00:HOME");
	 choice16=in.nextInt();
	 {
		  if(choice16==1) System.out.println("Your request has been received and is being processed");
			else if (choice16==2){ System.out.println("Thank you for using Safaricom");}
			else if (choice16==0||choice16==00)repeater++;
			else {System.out.println("Ivalid option");}
	}
	 }
     else if(choice12==5) { System.out.println("OKOA 90MB@Sh20 for 24hrs\n1:Accept\n2:Decline\n0:BACK\t00:HOME");
     choice17=in.nextInt();
     {
   	  if(choice17==1) System.out.println("Your request has been received and is being processed");
   		else if (choice17==2) System.out.println("Thank you for using Safaricom");
   		else if (choice17==0||choice17==00)repeater++;
   		else {System.out.println("Ivalid option");}
   	 }
   	  
     }
     
     else if(choice12==6) {System.out.println("OKOA 30MB@Sh10 for 24hr\n1:Accept\n2:Decline\n0:BACK\t00:HOME"); 
     choice18=in.nextInt();
     {
      if(choice18==1) System.out.println("Your request has been received and is being processed");
		else if (choice18==2) System.out.println("Thank you for using Safaricom");
		else if (choice18==0||choice18==00)repeater++;
		else {System.out.println("Ivalid option"); }
     }
     }
	 }
	 case 10-> System.out.println("Minutes offers");
	 
	 case 11->System.out.println("SMS offers");
	 
	 case 12->System.out.println("Lipa okoa process");
	 
	 case '#'->System.out.println("Check Balance");
	 
	 case 0 ->repeater++;
 
	}

	}
	
	}
	
}
	} 
	while(repeater>=1);
	//to close method body
	}
	//to close class
}
	
	
