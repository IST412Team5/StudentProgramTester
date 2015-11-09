import org.junit.*;
import static org.junit.Assert.*;
  
public class ConfigurationItemsTest
{
  // configure stuff here for later
  static studentprogramtester.controler.ConfigurationItems Target;
  static studentprogramtester.controler.ConfigurationItems CI;
  @BeforeClass
  public static void setupTests()
  {
    System.out.println("Starting Tests");
	System.out.println("creating Object");
	//Target = new studentprogramtester.controler.ConfigurationItems(); // create the target object to be tested
        studentprogramtester.controler.DataObject DO = new studentprogramtester.controler.DataObject();
        CI = DO.getCI();
  }
  
  @Before
  public void setupTest()
  {
	  // this is run before each test  
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
	  this.setupTest();
	  // Act
	  
	  System.out.println("Check if not null");
	  assertNotNull("Our Object is null!",CI);
	  System.out.println("It's good\n");
	  System.out.println("Checking Object Type for " + CI.getClass().getName().toString());
	  assertTrue(CI.getClass().getName().toString().equals("studentprogramtester.controler.ConfigurationItems"));
	  System.out.println("It is the right type\n");
  }
  @Test
  public void checkConfigItems()
  {
	  System.out.println("Checking the value of the configation item");
	  assertEquals("Checking the number","args.txt",CI.getargsFileName());
	  System.out.println("Number was correct");
	  
  }
  
  
} 
 