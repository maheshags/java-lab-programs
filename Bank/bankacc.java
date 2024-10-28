import java.util.*;
class Bank{
	String name;
	String accno;
	String acctype;
	double balance=0;
Bank(String name, String accno, String acctype){
	this.name=name;
	this.accno=accno;	
	this.acctype=acctype;

}
void deposit(double amount){
	balance=amount;
	System.out.println("the amount "+amount+" is successfully deposited");
	System.out.println("current balance is:"+balance);
}
void display(){
	System.out.println("NAME:"+name);
	System.out.println("ACCONT NUMBER:"+accno);
	System.out.println("ACCOUNT TYPE:"+acctype);
	System.out.println("BALANCE:"+balance);
}
}
class curracc extends Bank{
	double minimumBalance = 1000;
	double penalty = 50;
curracc(String name, String accno){
	super(name, accno, "Current");
}
void withdraw(double amount){
	if (balance-amount < 0){
		System.out.println("influcient funds");
	  }else{
		balance-=amount;
		System.out.println("the amount"+amount+" withdrawal succesfully /n new balance is:"+balance);
}
checkMinimumBalance();
}
 void checkMinimumBalance() {
        if (balance < minimumBalance) {
            balance -= penalty;
            System.out.println("Balance below minimum. Imposed penalty of " + penalty + ". New balance is " + balance);
}
}
}

class saveacc extends Bank{
	double interestRate = 0.04;
saveacc(String name, String accno){
	super(name, accno, "savings");
}
void camputeintereast(){
	double interest=balance*interestRate;
	balance+=interest;
	System.out.println("Interest of " + interest + " deposited. \n New balance is " + balance);
}
void withdraw(double amount){
	if (balance-amount < 0){
		System.out.println("influcient funds");
  	}else{
		balance-=amount;
		System.out.println("the amount"+amount+" withdrawal succesfully \n new balance 	is:"+balance);
}
}
}
class bankacc{
public static void main(String args[]){

Scanner input=new Scanner(System.in);
boolean exit=false;
System.out.println("--------------CURRENT ACCOUNT-------------");
System.out.println("enter a name:");
String n=input.nextLine();
System.out.println("enter account number");
String a=input.nextLine();
curracc s=new curracc(n,a);

while(!exit){
System.out.println("\nEnter the the operation \n");
System.out.println("1,deposit the amount");
System.out.println("2,withdrawal amount");
System.out.println("3,display the details");
int ch=input.nextInt();
switch(ch){
	case 1:
		System.out.println("enter the deposit amount");
		double amount=input.nextDouble();
		s.deposit(amount);
		break;
	case 2:
		System.out.println("enter the withdrawal amount");
		double w=input.nextDouble();
		s.withdraw(w);
		break;
	case 3:
		s.display();
		break;
	case 4:
		System.out.println("invalid choice");
		exit=true;
}
}


System.out.println("--------------SAVING ACCOUNT-------------");
System.out.println("Enter a name and account number");
String n1=input.nextLine();
String n2=input.nextLine();
String a1=input.nextLine();

boolean exit1=false;
saveacc s1=new saveacc(n2,a1);
while(!exit1){
System.out.println("\nEnter the the operation");
System.out.println("1,deposit the amount");
System.out.println("2,compute interest");
System.out.println("3,withdrawal ammount");
System.out.println("4display the details");

int ch1=input.nextInt();
switch(ch1){
	case 1:
		System.out.println("enter the deposit amount");
		double amount1=input.nextDouble();
		s1.deposit(amount1);
		break;
	case 2:
		System.out.println("comput interest");
		s1.camputeintereast();
		break;
	case 3:
		System.out.println("enter the withdrawal amount");
		double w1=input.nextDouble();
		s1.withdraw(w1);
		break;
	case 4:
		s1.display();
		break;
	case 5:
		System.out.println("invalid choice");
		exit1=true;
}
}

}
}
