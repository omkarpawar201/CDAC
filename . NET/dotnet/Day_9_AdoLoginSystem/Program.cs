
using Day_9_AdoLoginSystem.Models;
using Day_9_AdoLoginSystem.Services;

namespace Day_9_AdoLoginSystem
{
    internal class Program
    {
        static void Main(string[] args)
        {
            UserService uService = new UserService();
            int choice = 0;

            do
            {
                Console.WriteLine("---------------------------------");
                Console.WriteLine("1. Login\n2. Register\n3. Update Password\n4. Exit");
                Console.WriteLine("---------------------------------");
                Console.Write("Enter your choice : ");
                choice = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("---------------------------------");

                switch (choice) 
                {
                    case 1:
                        User user = uService.validateUser();

                        if(user != null) Console.WriteLine($"Welcome {user.UName}");
                        else Console.WriteLine("Invalid username or password!!!");
                            break;

                    case 2:
                        Boolean status = uService.registerUser();

                        if (status) Console.WriteLine($"Registered Successfully!!!");
                        else Console.WriteLine("Error!!!");
                        break;

                    case 3:
                        status = uService.updatePassword();

                        if (status) Console.WriteLine($"Password Updated Successfully!!!");
                        else Console.WriteLine("Password Not Updated!!!");
                        break;
                }
            }
            while (choice != 4);
        }
    }
}
