using Day_9_ConnectedEmployeeManagement.DAL;
using Day_9_ConnectedEmployeeManagement.Models;

namespace Day_9_ConnectedEmployeeManagement
{
    internal class Program
    {
        static void Main(string[] args)
        {
            EmployeeDAL eDal = new EmployeeDAL();
            int choice = 0;
            do
            {
                Console.WriteLine("1. Display all\n2. Add new Employee\n3. Search by ID");
                Console.WriteLine("4. Update Employee details\n5. Delete Employee\n6. Exit");
                Console.WriteLine("Enter your choice : ");
                choice = Convert.ToInt32(Console.ReadLine());

                switch (choice)
                {
                    case 1:
                        List<Employee> list = eDal.displayALL();

                        Console.WriteLine("---------------------------------------------------------");
                        foreach (var item in list)
                        {
                            Console.WriteLine($"Id : {item.Id}, Name : {item.Name}, Address : {item.Address}");
                        }
                        Console.WriteLine("---------------------------------------------------------");

                        break;

                    case 2:
                        Boolean status = eDal.addNewEmployee();

                        if (status) Console.WriteLine("Employee added succesfully!!!");
                        else Console.WriteLine("Employee not added!!!");

                        break;

                    case 3:

                        Console.WriteLine("Enter id to search : ");
                        int id = Convert.ToInt32(Console.ReadLine()) ;

                        Employee emp = eDal.searchById(id);

                        if (emp!=null) Console.WriteLine($"Id : {emp.Id}, Name : {emp.Name}, Address : {emp.Address}");
                        else Console.WriteLine("Employee not found!!!");

                        break;

                    case 4:

                        Console.WriteLine("Enter id to update : ");
                        id = Convert.ToInt32(Console.ReadLine());

                        status = eDal.updateEmployee(id);

                        if (status) Console.WriteLine("Employee updated succesfully!!!");
                        else Console.WriteLine("Employee not updated!!!");

                        break;

                    case 5:

                        Console.WriteLine("Enter id to delete : ");
                        id = Convert.ToInt32(Console.ReadLine());

                        status = eDal.deleteEmployee(id);

                        if (status) Console.WriteLine("Employee deleted succesfully!!!");
                        else Console.WriteLine("Employee not deleted!!!");

                        break;
                }
            }
            while (choice != 6);
        }
    }
}
