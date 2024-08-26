import java.text.ParseException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the Mobile Brand:");
		String brandName=sc.nextLine();
		MobileBrand mobileBrand=new MobileBrand();
		mobileBrand.setName(brandName);
		int choice=0;
		
		do
		{
			System.out.println("1.Add Mobile\r\n"
					+ "2.Delete Mobile\r\n"
					+ "3.Display Mobiles\r\n"
					+ "4.Exit\r\n"
					+ "Enter your choice:\r\n");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:		//add
				String detail=sc.nextLine();
				if(detail.equals(""))
					detail=sc.nextLine();
				Mobile mobile = Mobile.createMobile(detail);
				mobileBrand.addMobileToMobileBrand(mobile);
				System.out.println("Mobile successfully added");
				break;
			case 2:		//delete
				System.out.println("Enter the reference id of the mobile to be deleted:");
				String refId=sc.nextLine();
				if(refId.equals(""))
					refId=sc.nextLine();
				if(mobileBrand.removeMobileFromMobileBrand(refId))
				{
					System.out.println("Mobile successfully deleted");
				}else
				{
					System.out.println("Mobile not found in the Mobile Brand");
				}
				break;
			case 3:		//display
				System.out.println("Mobiles in "+mobileBrand.getName());
				mobileBrand.displayMobiles();
				break;
			}
		}while(choice<4);
	}

}
