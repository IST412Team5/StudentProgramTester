package studentprogramtester.controler;

	public class ConfigurationItems
	{

		private String _configurationFileName;

		public String getconfigurationFileName()
		{
			return _configurationFileName;
		}
		public String gettestDataPath()
		{
			return _testDataPath;
		}

		private String _testDataPath;
		public String getargsFileName()
		{
			return _argsFileName;
		}
		public String gettestInputFileName()
		{
			return _testInputFileName;
		}
		public String getinputFileStub()
		{
			return _inputFileStub;
		}
		public String getinputFileName()
		{
			return _inputFileName;
		}
		public String getcompilePath()
		{
			return _compilePath;
		}



		private String _argsFileName;
		private String _testInputFileName;
		private String _inputFileStub;
		private String _inputFileName;
		private String _compilePath;



		public ConfigurationItems(String cfn, String tdp, String afn, String tif, String ifs, String ifn, String cp)
		{
			this._testDataPath = tdp;
			this._testInputFileName = tif;
			this._configurationFileName = cfn;
			this._argsFileName = afn;
			this._inputFileStub = ifs;
			this._inputFileName = ifn;
			this._compilePath = cp;
		}




	}
