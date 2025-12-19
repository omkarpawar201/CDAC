namespace Day_4_EventAndDelegate
{
    // Delegate declaration: defines a method signature that takes an int parameter and returns void
    public delegate void EventDelegate(int mrk);

    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your marks : ");
            int mrk = Convert.ToInt32(Console.ReadLine());

            // Create an instance of Student class
            Student student = new Student();

            #region Normal method
            // Direct method calls without using events/delegates
            //if (mrk > 15) student.pass(mrk);
            //else student.fail(mrk); 
            #endregion

            // Subscribe event handlers (methods) to events using delegate
            // MultiCast Delegate
            student.StudentPass += new EventDelegate(student.pass);
            student.StudentFail += new EventDelegate(student.fail);

            // Assign marks to student (sets private field via property)
            student.marks = mrk;

            // Trigger event based on marks
            student.triggerEvent(student.marks);
        }

        // Student class demonstrating events and delegates
        public class Student
        {
            // Declare events using custom delegate type
            public event EventDelegate StudentPass;
            public event EventDelegate StudentFail;

            // Private field to store marks
            private int _marks;

            // Property to encapsulate marks field
            public int marks
            {
                get { return _marks; }
                set
                {
                    _marks = value; // Assign value to private field
                }
            }

            // Method to trigger appropriate event based on marks
            public void triggerEvent(int marks)
            {
                // Safe invocation using null-conditional operator (?.Invoke) is recommended
                if (_marks > 15)
                    StudentPass(_marks);              // Invoke StudentPass event
                else
                    StudentFail.Invoke(_marks);       // Invoke StudentFail event
            }

            // Event handler method for pass case
            public void pass(int marks)
            {
                Console.WriteLine($"You have passed with {marks} marks");
            }

            // Event handler method for fail case
            public void fail(int marks)
            {
                Console.WriteLine($"You have failed with {marks} marks");
            }
        }
    }
}
