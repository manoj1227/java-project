package c_n_dao;
import java.util.Scanner;
import c_n_pojo.Student;
import c_n_pojo.Address;
public class College{
	
	static Student[] stda;
	
	public static void multiplejoins(Student... saa){
		stda=saa;
		System.out.println("Students joined Successfully");
		}
	public static void display(){
		for (int i=0;i<stda.length ;i++ )
		{
	    System.out.println(stda[i].sno);
		System.out.println(stda[i].sname);
		System.out.println(stda[i].course);
		System.out.println(stda[i].fee);
		System.out.println(stda[i].email);
		System.out.println(stda[i].mobilenum);
		System.out.println(stda[i].gender);
		System.out.println(stda[i].a1.strtnum);
		System.out.println(stda[i].a1.city);
		System.out.println();
		}
	}
		public static void display(int findno){
			int value=1;
			for (int i=0;i<stda.length ;i++ )
			{
		 if(stda[i].sno==findno){
		System.out.println("Selected from "+value+" "+"Student");
		System.out.println(stda[i].sno);
		System.out.println(stda[i].sname);
		System.out.println(stda[i].course);
		System.out.println(stda[i].fee);
		System.out.println(stda[i].email);
		System.out.println(stda[i].mobilenum);
		System.out.println(stda[i].gender);
		System.out.println(stda[i].a1.strtnum);
		System.out.println(stda[i].a1.city);
		System.out.println();
		value++;
				}
			}
		}

		public static void display(String findcou){
			int value=1;
			for (int i=0;i<stda.length ;i++ )
			{
	   if(stda[i].course.equalsIgnoreCase(findcou)){
		 System.out.println("Selected from"+value+" "+"Student");
		 System.out.println(stda[i].sno);
		System.out.println(stda[i].sname);
		System.out.println(stda[i].course);
		System.out.println(stda[i].fee);
		System.out.println(stda[i].email);
		System.out.println(stda[i].mobilenum);
		System.out.println(stda[i].gender);
		System.out.println(stda[i].a1.strtnum);
		System.out.println(stda[i].a1.city);
		System.out.println();
		value++;
				}
			}
			
	}
	   public static void update(int updno){
		   int value=1;
	    for (int i=0;i<stda.length ;i++ )
	    {
			if(stda[i].sno==updno){
            Scanner scn=new Scanner(System.in);
			System.out.println("Updating from"+ value+" "+"Student");
			System.out.print("Enter new Student Number:");
			stda[i].sno=scn.nextInt();
			System.out.print("Enter new Student Name:");
			stda[i].sname=scn.next();
			System.out.print("Enter new Student Course:");
			stda[i].course=scn.next();
			System.out.print("Enter new Student Fee:");
			stda[i].fee=scn.nextDouble();
			System.out.print("Enter new Student Email:");
			stda[i].email=scn.next();
			System.out.print("Enter new Student MobileNumber:");
			stda[i].mobilenum=scn.nextLong();
			System.out.print("Enter new Student Gender:");
			stda[i].gender=scn.next().charAt(0);
			System.out.print("Enter new Student StreetNumber:");
			stda[i].a1.strtnum=scn.nextInt();
			System.out.print("Enter new Student City:");
			stda[i].a1.city=scn.next();
			System.out.println("Updated Successfully");
			value++;
			}
			}
	   }
		public static void update(String updcou){
	    int value=1;
		for (int i=0;i<stda.length ;i++ )
	    {
			if(stda[i].course.equalsIgnoreCase(updcou)){
            Scanner scn=new Scanner(System.in);
			System.out.print("Updating from"+value+" "+" Student");
			System.out.print("Enter new Student Number:");
			stda[i].sno=scn.nextInt();
			System.out.print("Enter new Student Name:");
			stda[i].sname=scn.next();
			System.out.print("Enter new Student Course:");
			stda[i].course=scn.next();
			System.out.print("Enter new Student Fee:");
			stda[i].fee=scn.nextDouble();
			System.out.print("Enter new Student Email:");
			stda[i].email=scn.next();
			System.out.print("Enter new Student MobileNumber:");
			stda[i].mobilenum=scn.nextLong();
			System.out.print("Enter new Student Gender:");
			stda[i].gender=scn.next().charAt(0);
			System.out.print("Enter new Student StreetNumber:");
			stda[i].a1.strtnum=scn.nextInt();
			System.out.print("Enter new Student City:");
			stda[i].a1.city=scn.next();
			System.out.println("Updated Successfully");
			value++;
			}
	    }

	   }
	   public static void delete(int delno){
	   for (int i=0;i<stda.length ;i++ )
	   {
		   if(stda[i].sno==delno){
		    stda[i]=null;
			System.out.println("Deleted Successfully");
		}
	   }
	   }
	    public static void delete(String delcou){
	   for (int i=0;i<stda.length ;i++ )
	   {
		   if(stda[i].course==delcou){
		    stda[i]=null;
			System.out.println("Deleted Successfully"); 
		   }
	   }
	   }
        
}