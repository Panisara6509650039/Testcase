package panisara_6509650039;

import org.junit.Test;

import junit.framework.TestCase;

import static org.junit.Assert.*;

import org.junit.Test;

public class Stacktestcase extends TestCase {

	//TC1
		public void testCreateNewEmptyStack() {
			Stack a1 = new Stack(10);
			assertEquals(true,a1.isEmpty());
			
			assertEquals(0,a1.getSize());
		}

		//TC2
		public void testPushElmToTop() {
			Stack a2 = new Stack(10);
			assertEquals(false, a2.isFull());
			Object elm = "Test";
			try {
				a2.push(elm);
				assertEquals(false, a2.isEmpty());
				assertEquals(elm, a2.top());
			} catch (Exception e) {
				fail("Unexpected exception: " + e.getMessage());
			}
		}
		
		//TC3
		public void testPushDifferentElmTypeToStack(){
			Stack a3 = new Stack(10);
			
			try {
				a3.push(5);
				a3.push(6);
				a3.push(7);
				assertEquals(false, a3.isEmpty());
				assertEquals(7, a3.top());
				
				a3.push("String");
				fail("Expected exception not thrown");
			} catch (Exception e) {
				assertEquals("All elements in the stack must be of the same type.", e.getMessage());
			}
		}
		
		//TC4
		public void testLastinFirstOut() {
			Stack a4 = new Stack(10);
					
			try {
				a4.push(1);
				a4.push(2);
				a4.push(3);
				assertEquals(3, a4.pop());
				assertEquals(2, a4.pop());
				assertEquals(1, a4.pop());
						
			} catch (Exception e) {
				e.getMessage();
				}
			}
		
		public void testPushToFullStack(){
			Stack a5 = new Stack(3);
			
			try {
				a5.push(1);
				a5.push(2);
				a5.push(3);
				a5.push(4);
				fail();
				assertEquals(true, a5.isFull());
					
			} catch (Exception e) {
				assertEquals("Stack is full.",e.getMessage());
			}
		}
		
		//TC5
				public void testLimits()
				{
					Stack a = new Stack(2);
					try
					{
						a.push(1);
						a.push(2);
						a.push(3);
						fail("Expected an exception , but none was thrown.");
						assertEquals(true, a.isFull());
					}
					catch (Exception e)
					{
						e.getMessage();
					}
				}

}
