using System;
using System.IO;  // Required for FileStream, StreamReader, StreamWriter

namespace Day6_Demo_FileIO
{
    internal class Program
    {
        static void Main(string[] args)
        {

            // FILE PATH CONFIGURATION
            // @"" = verbatim string (ignores escape characters like \)
            string filePath = @"D:\IET_Dec_25_Batch\CSharpDemos\26Demo_FileIO\Files\demo1.txt";

            Console.WriteLine($"Target file: {filePath}\n");

            // EMPLOYEE OBJECT CREATION (for serialization demo)
            Emp emp = new Emp();
            emp.Id = 101;
            emp.Name = "Tony Stark";
            emp.Address = "Shivaji Nagar";

            Console.WriteLine($"Employee: ID={emp.Id}, Name={emp.Name}, Address={emp.Address}\n");

            // REGION 1: STREAMWRITER - WRITE TO FILE (COMMENTED)
            #region StreamWriter - Append/Write Operations

            /*
            // STEP 1: Create FileStream with conditional FileMode
            FileStream fs = null;

            if (File.Exists(filePath))
            {
                // File exists → APPEND mode (adds to end, doesn't overwrite)
                fs = new FileStream(filePath, FileMode.Append, FileAccess.Write);
                Console.WriteLine("File exists → Using APPEND mode");
            }
            else
            {
                // File doesn't exist → CREATE mode (creates new file)
                fs = new FileStream(filePath, FileMode.OpenOrCreate, FileAccess.Write);
                Console.WriteLine("File doesn't exist → Creating new file");
            }

            // STEP 2: Wrap FileStream with StreamWriter (text encoding)
            StreamWriter writer = new StreamWriter(fs);
            
            // STEP 3: Write data
            writer.WriteLine(" Hugh Jackman");  // Note: WriteLine adds newline
            
            // STEP 4: FLUSH ensures data is written to disk immediately
            writer.Flush();
            
            // STEP 5: Clean disposal (older manual approach)
            writer.Close();  // Closes StreamWriter
            fs.Close();      // Closes underlying FileStream
            Console.WriteLine("Write operation completed.");
            */

            #endregion

            // REGION 2: STREAMREADER - READ FROM FILE (COMMENTED)
            #region StreamReader - Read Operations

            /*
            // STEP 1: FileStream for reading (file must exist)
            FileStream fs = null;

            if (File.Exists(filePath))
            {
                // Open existing file in READ-ONLY mode
                fs = new FileStream(filePath, FileMode.Open, FileAccess.Read);
                Console.WriteLine("File opened for reading");
            }
            else
            {
                Console.WriteLine("File does not exist!!");
                return;  // Exit early if no file
            }

            // STEP 2: Wrap FileStream with StreamReader
            StreamReader reader = new StreamReader(fs);
            
            // STEP 3: Read entire file content
            string content = reader.ReadToEnd();  // Reads from current position to EOF
            
            // STEP 4: Clean disposal
            reader.Close();
            fs.Close();
            
            // STEP 5: Display content
            Console.WriteLine("File content:");
            Console.WriteLine(content);
            */

            #endregion

            // REGION 3: OBJECT SERIALIZATION ATTEMPT (COMMENTED/BROKEN)
            #region StreamWriter - Object Writing (WON'T WORK)

            /*
            // PROBLEM: This will FAIL at runtime!
            // StreamWriter.Write() expects string, not Emp object
            
            FileStream fs = null;

            if (FileExists(filePath))
            {
                fs = new FileStream(filePath, FileMode.Append, FileAccess.Write);
            }
            else
            {
                fs = new FileStream(filePath, FileMode.OpenOrCreate, FileAccess.Write);
            }

            StreamWriter writer = new StreamWriter(fs);
            
            // ❌ ERROR: Cannot write Emp object directly!
            // Need ToString() override or JSON/XML serialization
            writer.Write(emp);  // Runtime exception here!
            
            writer.Flush();
            writer.Close();
            fs.Close();
            Console.WriteLine("Employee written to file.");
            */

            #endregion
        }
    }

    // EMPLOYEE CLASS - Simple POCO with backing fields
    public class Emp
    {
        // Private backing fields (underscore prefix convention)
        private int _Id;
        private string _Name;
        private string _Address;

        // AUTO-PROPERTIES WITH CUSTOM GET/SET (verbose style)
        // Modern C# prefers: public int Id { get; set; }

        public string Address
        {
            // Getter returns backing field
            get { return _Address; }
            // Setter assigns to backing field
            set { _Address = value; }
        }

        public string Name
        {
            get { return _Name; }
            set { _Name = value; }
        }

        public int Id
        {
            get { return _Id; }
            set { _Id = value; }
        }

        // MISSING: ToString() override for proper object serialization!
        // Add this for the Emp writing demo to work:
/*
public override string ToString()
{
    return $"ID={Id}, Name={Name}, Address={Address}";*/
}
}

