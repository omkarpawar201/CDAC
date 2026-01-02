using Day_10_EntityFramewrok.DAL;
using Day_10_EntityFramewrok.Models;

namespace Day_10_EntityFramewrok
{
    internal class Program
    {
        static void Main(string[] args)
        {
            EmpContext empContext = new EmpContext();
            int choice = 0;

            do
            {
                Console.WriteLine("1. Display All\n2. Add new Employee\n3. Update Employee\n4. Delete Employee\n5. Exit");
                Console.Write("Choice : ");
                choice = Convert.ToInt32(Console.ReadLine());

                switch (choice) 
                {
                    case 1:
                        List<Emp> empList = new List<Emp>();

                        foreach (var item in empList)
                        {
                            Console.WriteLine($"Id : {item.Id}, Name : {item.Name}, Address : {item.Address}");
                        }
                        break;

                    case 2:
                        Emp newEmp = new Emp();

                        Console.Write("Enter name : ");
                        newEmp.Name = Console.ReadLine();
                        Console.Write("Enter Address : ");
                        newEmp.Address = Console.ReadLine();

                        empContext.emps.Add(newEmp);
                        empContext.SaveChanges();

                        break;

                    case 3:
                        Console.WriteLine("Enter Emp Id To be updated");
                        int id = Convert.ToInt32(Console.ReadLine());

                        Emp? emp =  empContext.emps.Find(id);

                        Console.Write("Enter updated name : ");
                        emp.Name = Console.ReadLine();
                        Console.Write("Enter updated Address : ");
                        emp.Address = Console.ReadLine();

                        empContext.SaveChanges();

                        break;

                    case 4:
                        Console.WriteLine("Enter Emp Id To be updated");
                        id = Convert.ToInt32(Console.ReadLine());

                        Emp? emp1 = empContext.emps.Find(id);

                        empContext.emps.Remove(emp1);
                        empContext.SaveChanges();

                        break;
                }
            }
            while (choice != 5);
        }
    }
}
