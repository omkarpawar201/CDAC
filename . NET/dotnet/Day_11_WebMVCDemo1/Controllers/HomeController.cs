using Microsoft.AspNetCore.Mvc;

namespace Day_11_WebMVCDemo1.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {   
            return View();
        }
    }
}
