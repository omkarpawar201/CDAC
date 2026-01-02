using Microsoft.AspNetCore.Mvc;

namespace Day_12_AttributeBasedRouting.Controllers
{
    [Route("Demo1")]
    public class Demo1 : Controller
    {
        [Route("Demo")]
        public IActionResult Index()
        {
            return View();
        }

        [Route("Greet")]
        public string sayHi()
        {
            return "Hello";
        }
    }
}
