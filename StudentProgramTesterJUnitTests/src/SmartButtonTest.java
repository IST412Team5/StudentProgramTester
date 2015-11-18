import org.junit.*;
import static org.junit.Assert.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mtb137
 */
public class SmartButtonTest 
{
  @BeforeClass
  public static void setupTests()
  {
    System.out.println("Starting Tests for Smart Button");
  }
  @Test
  public void TestConstructor()
  {
      // arrange
      studentprogramtester.controler.SmartButton SB = new studentprogramtester.controler.SmartButton();
      //act
      SB.setId(5);
      int iResult = SB.getId();
      //assert
      System.out.println("Test1: Test setting the ID should be 5 = " + iResult);
      assertEquals(5,iResult);
  }
  
  
}
