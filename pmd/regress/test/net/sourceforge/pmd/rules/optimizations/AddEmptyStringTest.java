
 package test.net.sourceforge.pmd.rules.optimizations;
 
 import net.sourceforge.pmd.Rule;

import org.junit.Before;
import org.junit.Test;

import test.net.sourceforge.pmd.testframework.SimpleAggregatorTst;
 
 public class AddEmptyStringTest extends SimpleAggregatorTst {
 
     private Rule rule;

     @Before
     public void setUp() {
         rule = findRule("optimizations", "AddEmptyString");
     }
 
     @Test
     public void testAll() {
         runTests(rule);
     }

     public static junit.framework.Test suite() {
         return new junit.framework.JUnit4TestAdapter(AddEmptyStringTest.class);
     }
 }
