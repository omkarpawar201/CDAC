using Microsoft.AspNetCore.Mvc;

namespace Day_12_ReturnTypesOfActionMethod.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }

        public ViewResult demo()
        {
            return View("~/Views/Home/About.cshtml");
        }

        public string getData(string nm, string addr) {
            return $"Name : {nm}, Address : {addr}";
        }

        public  JsonResult getJData()
        {
            var data = new
            {
                EID = 101,
                Ename = "Omkar",
                Addre = "Pune"
            };
            return Json(data);
        }

        public ObjectResult GetObject()
        {
            var obj = new
            {
                ID = 101,
                Name = "Hugh Jackman",
                Address = "NYC"
            };
            return new ObjectResult(obj);
        }

        public StatusCodeResult GetStatus()
        {
            return StatusCode(404);
        }
    }
}
