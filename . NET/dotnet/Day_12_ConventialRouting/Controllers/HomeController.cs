using Microsoft.AspNetCore.Mvc;

namespace Day_12_ConventialRouting.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
