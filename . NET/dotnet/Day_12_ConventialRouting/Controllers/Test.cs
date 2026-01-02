using Microsoft.AspNetCore.Mvc;

namespace Day_12_ConventialRouting.Controllers
{
    public class Test : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
