import org.junit.*;
import static org.junit.Assert.*;
  
public class DataObjectJUnitTest
{
  // configure stuff here for later
  static studentprogramtester.controler.DataObject Target;

  @BeforeClass
  public static void setupTests()
  {
  }
  
  @Before
  public void setupTest()
  {
        System.out.println("Starting Tests");
	System.out.println("creating Object");
	 // create the target object to be tested
        Target = new studentprogramtester.controler.DataObject();
	System.out.println("Test Starting");
  }
  
  @After 
  public void tearDownTest()
  {
	// this runs after each test
	  System.out.println("Test Complete\n\n\n\n\n");
  }
  
  // Individual tests follow
  @Test
  public void createObjTest()
  {
	  // Arrange
	  //this.setupTest();
	  // Act
	  
	  System.out.println("Check if not null");
	  assertNotNull("Our Object is null!",Target);
	  System.out.println("It's good\n");
	  System.out.println("Checking Object Type for " + Target.getClass().getName().toString());
	  assertTrue(Target.getClass().getName().toString().equals("studentprogramtester.controler.DataObject"));
	  System.out.println("It is the right type\n");
  }
  @Test
  public void checkNUmberValue()
  {
	  System.out.println("Checking the value of the student number");
	  assertEquals("Checking the number",0,Target.getNumbr());
	  System.out.println("Number was correct");
  }
  @Test
  public void checkConfigItems()
  {
	  System.out.println("Checking the value of the configation item");
	  
	  //studentprogramtester.controler.ConfigurationItems CI = Target.getCI();
	  //ConfigurationItems CI = new ConfigurationItems();
          studentprogramtester.controler.DataObject DO = new studentprogramtester.controler.DataObject();
          studentprogramtester.controler.ConfigurationItems CI = DO.getCI();
	  assertEquals("Checking the arg file name ","args.txt",CI.getargsFileName());
	  System.out.println("Number was correct");
	  
  }
  
  
} 
 