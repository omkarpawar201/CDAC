// Namespace to logically group related classes
namespace Day_3
{
    // Internal Program class (accessible only within this assembly)
    internal class Program
    {
        #region Main method
        // Entry point of the program
        static void Main(string[] args)
        {
            // Create an instance of ReportFactory
            ReportFacotry reportFacotry = new ReportFacotry();

            // Infinite loop to repeatedly ask user for input until they choose to exit
            while (true)
            {
                Console.WriteLine("Enter your choice 1. PDF 2. DOCX 3. PNG: ");
                int choice = Convert.ToInt32(Console.ReadLine());

                // Get the appropriate Report object based on user choice
                Report report = reportFacotry.getObject(choice);

                // Call generateReport() which executes the template steps
                report.generateReport();

                // Ask user if they want to continue
                Console.WriteLine("Do you want to continue y/n");
                string ch = Console.ReadLine();

                // Exit loop if user enters 'n'
                if (ch == "n")
                {
                    break;
                }
            }
        }
        #endregion

        // Factory class responsible for creating Report objects
        public class ReportFacotry
        {
            Report report;

            // Returns a Report object based on user choice
            public Report getObject(int choice)
            {
                switch (choice)
                {
                    case 1:
                        report = new PDF();   // Create PDF report
                        break;
                    case 2:
                        report = new DOCX();  // Create DOCX report
                        break;
                    case 3:
                        report = new PNG();   // Create PNG report
                        break;
                    default:
                        report = null;        // Invalid choice
                        break;
                }
                return report;
            }
        }

        // Abstract base class defining the template for reports
        public abstract class Report
        {
            // Abstract methods to be implemented by derived classes
            protected abstract void parse();
            protected abstract void save();
            protected abstract void validate();

            // Template method: defines the sequence of steps to generate a report
            public void generateReport()
            {
                parse();
                validate();
                save();
                Console.WriteLine("Done...");
            }
        }

        // Abstract class extending Report with an additional step (Edit)
        public abstract class SpecialReport : Report
        {
            protected abstract void Edit();

            // Hides base generateReport() with a new version that includes Edit step
            public new void generateReport()
            {
                parse();
                Edit();
                validate();
                save();
                Console.WriteLine("Done...");
            }
        }

        // Concrete class implementing Report for PDF
        public class PDF : Report
        {
            protected override void parse()
            {
                Console.WriteLine("PDF Parse done");
            }
            protected override void validate()
            {
                Console.WriteLine("PDF validation done");
            }
            protected override void save()
            {
                Console.WriteLine("PDF save done");
            }
        }

        // Concrete class implementing Report for DOCX
        public class DOCX : Report
        {
            protected override void parse()
            {
                Console.WriteLine("DOCX Parse done");
            }
            protected override void validate()
            {
                Console.WriteLine("DOCX validation done");
            }
            protected override void save()
            {
                Console.WriteLine("DOCX save done");
            }
        }

        // Concrete class implementing SpecialReport for PNG
        public class PNG : SpecialReport
        {
            protected override void parse()
            {
                Console.WriteLine("PNG Parse done");
            }
            protected override void Edit()
            {
                Console.WriteLine("PNG Edit done");
            }
            protected override void validate()
            {
                Console.WriteLine("PNG validation done");
            }
            protected override void save()
            {
                Console.WriteLine("PNG save done");
            }
        }
    }
}
