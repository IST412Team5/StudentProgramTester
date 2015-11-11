import org.junit.*;
import static org.junit.Assert.*;

public class UtilityJUnitTest
{
  String [] strings = new String [4];
  
  @BeforeClass
  public static void setupTests()
  {
    System.out.println("Starting Tests");
  }
  
  @Before
    public void setupTest()
  {
	this.strings[0] = "abc";
	this.strings[1] = " ";
	this.strings[2] = "1" + "2" + "3";
	this.strings[3] = null;
  }
  
  
  @Test
  public void isNullorWhitespaceFalse()
  {
	this.setupTest();
	Boolean  result = studentprogramtester.Utility.isNullOrWhiteSpace(strings[0]);
	System.out.println("Test1: is the string null or whitespace -- should be false result = " + result);
	assertFalse(result);
  }
  @Test
  public void isNullOrWhiteSpaceTrue()
  {
	this.setupTest();
	Boolean  result = studentprogramtester.Utility.isNullOrWhiteSpace(strings[1]);
	System.out.println("Test2: is the string null or white space -- should be true result = " + result);
	assertTrue(result);
  }
  @Test
  public void isNullOrWhiteSpaceFalseConcat()
  {
	this.setupTest();
	Boolean  result = studentprogramtester.Utility.isNullOrWhiteSpace(strings[2]);
	System.out.println("Test3: concatenated string is null or white space should be false result = " + result);
	assertFalse(result);
  }
  @Test
  public void isNullOrWhiteSpaceTrueNull()
  {
	this.setupTest();
	Boolean  result = studentprogramtester.Utility.isNullOrWhiteSpace(strings[3]);
	System.out.println("Test4: checking a null string, should be true: result = " + result);
	assertTrue(result);
  } 
	@Test
	public void reverseStringTest1()
	{
		String expectedResult = "cba";
		this.setupTest();
		String result = studentprogramtester.Utility.reverseString(strings[0]);
		System.out.println("Test5: Reversing String cba should be abc result = " + result);
		assertTrue(result.equals(expectedResult));
	}
	@Test
	public void reverseStringTestFalse()
	{
		String expectedResult = "nottherightthing";
		this.setupTest();
		String result = studentprogramtester.Utility.reverseString(strings[0]);
		System.out.println("Test6: checking a string tht will not be the correct result  = " + result);
		assertFalse(result.equals(expectedResult));
	}	
        
        // test that a non-user does not authenticate
        @Test
        public void AuthenticateUserTest()
        {
            // Arrange
            String strUser = "NotAUser";
            String strPassword = "BadPassword";
            // act
            System.out.println("Testing if a non - user is authenticated");
            Boolean bAuthenticated = studentprogramtester.Utility.AuthenticateUser(strUser, strPassword);
            System.out.println("Result: " + bAuthenticated.toString());
            
            //assert
           assertFalse(bAuthenticated);
        }
        
        @Test
        public void AuthenticateUserTestTrue()
        {
            // Arrange
            String strUser = "bob";
            String strPassword = "abc";
            // act
            System.out.println("Testing if a user is authenticated");
            Boolean bAuthenticated = studentprogramtester.Utility.AuthenticateUser(strUser, strPassword);
            System.out.println("Result: " + bAuthenticated.toString());
            
            //assert
           assertTrue(bAuthenticated);
        }        
}