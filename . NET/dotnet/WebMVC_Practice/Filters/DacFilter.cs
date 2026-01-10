using Microsoft.AspNetCore.Mvc.Filters;

namespace WebMVC_Practice.Filters
{
    public class DacFilter : ActionFilterAttribute
    {
        public override void OnActionExecuting(ActionExecutingContext context)
        {
            
        }

        public override void OnActionExecuted(ActionExecutedContext context)
        {
            
        }

        public override void OnResultExecuting(ResultExecutingContext context)
        {

        }
        public override void OnResultExecuted(ResultExecutedContext context)
        {

        }
    }
}
