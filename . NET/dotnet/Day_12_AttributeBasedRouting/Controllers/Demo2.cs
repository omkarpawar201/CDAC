using Microsoft.AspNetCore.Mvc;

namespace Day_12_AttributeBasedRouting.Controllers
{
    [Route("Demo2")]
    public class Demo2 : Controller
    {
        [Route("Main")]
        public IActionResult Index()
        {
            return View();
        }
    }
}
