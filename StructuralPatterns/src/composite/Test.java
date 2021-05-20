package composite;

public class Test 
{
	public static void main (String[] args)
    {
        Developer dev1 = new Developer(100, "Lokesh Sharma", "Pro Developer");
        Developer dev2 = new Developer(101, "Vinay Sharma", "Developer");
        CompanyDirectory directory0 = new CompanyDirectory();
        directory0.addEmployee(dev1);
        directory0.addEmployee(dev2);
          
        Manager mng1 = new Manager(200, "Kushagra Garg", "SEO Manager");
        Manager mng2 = new Manager(201, "Vikram Sharma ", "Kushagra's Manager");
          
        CompanyDirectory directory1 = new CompanyDirectory();
        directory1.addEmployee(mng1);
        directory1.addEmployee(mng2);
      
        CompanyDirectory directory2 = new CompanyDirectory();
        directory2.addEmployee(directory0);
        directory2.addEmployee(directory1);
        directory2.showEmployeeDetails();
    }	
}
