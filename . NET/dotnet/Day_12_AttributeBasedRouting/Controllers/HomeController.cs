using Microsoft.AspNetCore.Mvc;

namespace Day_12_AttributeBasedRouting.Controllers
{
    [Route("/")]
    public class HomeController : Controller
    {
        [Route("/")]
        public IActionResult Index()
        {
            return View();
        }

        
    }
}
