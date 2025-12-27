namespace Day_7_BVSLib
{
	[AttributeUsage(AttributeTargets.Class)]
    public class BVS : Attribute
    {
		private string _cName;
		private string _founder;

		public string founder
		{
			get { return _founder; }
			set { _founder = value; }
		}

		public string cName
		{
			get { return _cName; }
			set { _cName = value; }
		}

	}
}
