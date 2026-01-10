using Microsoft.AspNetCore.Mvc;
using WebMVC_Practice.Models;

namespace WebMVC_Practice.Controllers
{
    public class LoginController : Controller
    {
        private DacDBContext _context;

        public LoginController(DacDBContext context)
        {
            _context = context;
        }

        [HttpGet]
        public IActionResult Login()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Login(User user)
        {
            var users = _context.users.ToList();

            foreach (var item in users)
            {
                if (user.UserName.Equals(item.UserName)  && user.Password.Equals(item.Password))
                {
                    return Redirect("/Test/Index");
                }
            }

            ViewBag.message = "Invalid Credentials";
            return View();

        }
    }
}
