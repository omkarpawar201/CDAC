using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Day_9_AdoLoginSystem.DAL;
using Day_9_AdoLoginSystem.Models;

namespace Day_9_AdoLoginSystem.Services
{
    internal class UserService
    {
        UserDAL uDal = new UserDAL();

        public User validateUser()
        {
            Console.Write("- Enter Username : ");
            string? uname = Console.ReadLine();
            Console.Write("- Enter Password : ");
            string? pass = Console.ReadLine();

            return uDal.validateUser(uname, pass);
        }

        public bool registerUser()
        {
            Console.Write("# Enter Email : ");
            string? email = Console.ReadLine();
            Console.Write("# Enter Username : ");
            string? uname = Console.ReadLine();
            Console.Write("# Enter Password : ");
            string? pass = Console.ReadLine();

            return uDal.registerUser(email, uname, pass);
        }

        internal bool updatePassword()
        {
            User user = validateUser();

            if (user != null)
            {
                Console.Write("# Enter New Password : ");
                string? pass = Console.ReadLine();

                return uDal.updatePassword(pass, user.Id);
            }
            else return false;
        }
    }
}
