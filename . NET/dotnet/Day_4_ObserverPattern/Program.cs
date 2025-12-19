// Namespace to logically group related classes
namespace Day_5_ObserverPattern
{
    // Delegate declaration: defines a method signature that takes a string message and returns void
    public delegate void Handler(String msg);

    internal class Program
    {
        static void Main(string[] args)
        {
            // Create subscriber and publisher objects
            Subscriber subscriber = new Subscriber();
            Publisher publisher = new Publisher();

            // Subscribe subscriber methods (observers) to publisher event (subject)
            publisher.Notify += subscriber.SMS;
            publisher.Notify += subscriber.Email;

            // Publisher triggers event -> both SMS and Email methods are called
            publisher.trigger("The Grand Sale is UP! Upto 70% off on selected products!");

            // Unsubscribe Email method from event
            publisher.Notify -= subscriber.Email;

            Console.WriteLine("Email event removed");

            // Publisher triggers event again -> only SMS method is called
            publisher.trigger("Flash Sale! Extra 10% off on Electronics!");
        }

        // Subscriber class: defines methods that react to notifications
        public class Subscriber
        {
            // Method to handle SMS notification
            public void SMS(String msg) { Console.WriteLine($"{msg} via SMS"); }

            // Method to handle Email notification
            public void Email(String msg) { Console.WriteLine($"{msg} via Email"); }
        }

        // Publisher class: raises events to notify subscribers
        public class Publisher
        {
            // Event declaration using custom delegate
            public event Handler Notify;

            // Method to trigger event (notify all subscribers)
            public void trigger(string msg)
            {
                // Safe invocation using null-conditional operator
                Notify?.Invoke(msg);
            }
        }
    }
}
