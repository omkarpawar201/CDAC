using Microsoft.AspNetCore.Mvc;
using WebMVC_Practice.Models;

namespace WebMVC_Practice.Controllers
{
    public class TestController : Controller
    {
        private DacDBContext _context;

        public TestController(DacDBContext context)
        {
            _context = context;
        }

        public IActionResult Index()
        {
            var emp = _context.emps.ToList();

            return View();
        }

        //public IActionResult EmpDetails()
        //{
        //    var emp = _context.emps.ToList();
        //    return View(emp);
        //}

        public IActionResult DeleteEmp(int id)
        {
            var emp = _context.emps.Find(id);
            _context.emps.Remove(emp);
            _context.SaveChanges();

            return RedirectToAction(nameof(Index));
        }
    }
}
