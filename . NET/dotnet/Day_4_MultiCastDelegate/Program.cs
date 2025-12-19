// Namespace to logically group related classes
namespace Day_4_MultiCastDelegate
{
    // Delegate declaration: defines a method signature with no parameters and no return value
    public delegate void Handler();

    internal class Program
    {
        static void Main(string[] args)
        {
            // Create an instance of CollegeEvent class
            CollegeEvent college = new CollegeEvent();

            Console.WriteLine("Is Guest arrived?");
            string str = Console.ReadLine();

            // Initialize delegate with the first method (Welcome)
            Handler handler = new Handler(college.WelCome);

            // Add more methods to the delegate (multicast behavior)
            handler += college.WelSpeech;

            // Conditionally add/remove GuestSpeech based on user input
            if (str.Equals("y"))
                handler += college.GuestSpeech;   // Add GuestSpeech if guest arrived
            else
                handler -= college.GuestSpeech;   // Ensure GuestSpeech is not in the invocation list

            // Add remaining event methods
            handler += college.Dance;
            handler += college.Dinner;
            handler += college.GoodBye;
            handler += college.EndEvent;

            // Invoke the delegate (calls all attached methods in sequence)
            handler();
            // Equivalent: handler.Invoke();
        }

        // Class containing various event methods
        public class CollegeEvent
        {
            public void WelCome()
            {
                Console.WriteLine("Wel-come Everyone!!");
            }
            public void WelSpeech()
            {
                Console.WriteLine("Host: blah blah blah blah!!");
            }
            public void GuestSpeech()
            {
                Console.WriteLine("Guest: blah blah blah blah!!");
            }
            public void Dance()
            {
                Console.WriteLine("Oh GOD, we have have to go through this!!");
            }
            public void Dinner()
            {
                Console.WriteLine("We insist everyone , please enjoy dinner...!!");
            }
            public void GoodBye()
            {
                Console.WriteLine("Bye bye.. please ghar jao...!!");
            }
            public void EndEvent()
            {
                Console.WriteLine("Pack UP...!!");
            }
        }
    }
}
