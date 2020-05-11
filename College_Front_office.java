package c_n_user;
import java.util.Scanner;
import c_n_pojo.Student;
import c_n_pojo.Address;
import c_n_dao.College;
class College_Front_office{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter How many numbers do you want to Join:");
		int num=scn.nextInt();
		Student[] stda=new Student[num];
			     int value=1;
		        for (int i=0;i<stda.length ;i++ )
		        {
            System.out.println("********Enter "+value+" "+" Student:*********");
			 stda[i]=new Student();
            System.out.print("Enter Student Number:");
			stda[i].sno=scn.nextInt();
			System.out.print("Enter Student Name:");
			stda[i].sname=scn.next();
			System.out.print("Enter Student Course:");
			stda[i].course=scn.next();
			System.out.print("Enter Student Fee:");
			stda[i].fee=scn.nextDouble();
			System.out.print("Enter Student Email:");
			stda[i].email=scn.next();
			System.out.print("Enter Student MobileNumber:");
			stda[i].mobilenum=scn.nextLong();
			System.out.print("Enter Student Gender:");
			stda[i].gender=scn.next().charAt(0);
			System.out.print("Enter Student StreetNumber:");
			stda[i].a1.strtnum=scn.nextInt();
			System.out.print("Enter Student City:");
			stda[i].a1.city=scn.next();
		        value++;
				}	
			College.multiplejoins(stda);		
		System.out.print("Do you want to Change/diplay your details(Y/N):");
		String opt=scn.next();
		if(opt.equalsIgnoreCase("Y")){
		String opt1="A";
		do{
			System.out.println("Select an option");
			System.out.println("1.Select");
			System.out.println("2.Update");
			System.out.println("3.Delete");
			System.out.print("Select one option from above:");
			int optnum=scn.nextInt();
			if(optnum==1){
				System.out.println("1.Select by  student no");
				System.out.println("2.Select by  student course");
				System.out.println("3.Display all student course");
				System.out.print("Enter any one option to continue...:");
			    int sw=0;
				switch (sw=scn.nextInt())
				{
				case 1:
					System.out.print("Enter student number:");
					College.display(scn.nextInt());
				    break;
                 case 2:
					System.out.print("Enter student Course:");
					College.display(scn.next());
					case 3:
						College.display();
				    break;
					default:
						System.out.println("Matches not found");
				}	
			}
		else if(optnum==2){
			System.out.println("1.Update by student no");
				System.out.println("2.Update by student course");
				System.out.print("Enter any one option to continue...:");
				switch (scn.nextInt())
				{
				case 1:
					System.out.print("Enter Student Number to update:");
				      College.update(scn.nextInt());
					  break;
				case 2:
					System.out.print("Enter Student Course to update:");
				      College.update(scn.next());
					  break;
			    default: 
						System.out.println("Matches not found");
				}

		  }
		else if(optnum==3){
		System.out.println("1.Delete by student no");
				System.out.println("2.Delete by student course");
				System.out.print("Enter any one option to continue...:");
				switch (scn.nextInt())
				{
				case 1:
					System.out.print("Enter Student Number to Delete:");
				      College.delete(scn.nextInt());
					  break;
				case 2:
					System.out.print("Enter Student Course to Delete:");
				      College.delete(scn.next());
					  break;
                default:
						System.out.println("Matches not found");
		       }
		}		
			 else{
				 System.out.println("Invalid Option");
		}
        System.out.print("Do you want to make another Change/diplay your details(Y/N):");
		opt1=scn.next();
	}while(opt1.equalsIgnoreCase("Y"));
		
		}

	}
} 
