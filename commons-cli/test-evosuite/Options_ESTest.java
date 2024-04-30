/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 23 13:05:47 GMT 2024
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.List;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class Options_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasShortOption("-lT1Vp[hRc%G");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasOption("-vfk^'ij^xqQBH");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasLongOption("-g=42");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = options0.getOption("--");
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, " ", true, (String) null);
      Options options1 = options0.addOption(option0);
      List<String> list0 = options1.getMatchingOptions("--");
      assertTrue(list0.contains(" "));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, "", false, (String) null);
      options0.addOption(option0);
      List<String> list0 = options0.getMatchingOptions("--");
      assertTrue(list0.contains(""));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Options options0 = new Options();
      List<String> list0 = options0.getMatchingOptions("--");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Options options0 = new Options();
      List<Option> list0 = options0.helpOptions();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Options options0 = new Options();
      Collection<OptionGroup> collection0 = options0.getOptionGroups();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption((String) null, (String) null, false, "ny[vfvq#-9Vr$KNXV.");
      Option option0 = options0.getOption((String) null);
      options1.getOptionGroup(option0);
      assertTrue(option0.isRequired());
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      optionGroup0.setRequired(true);
      Option option0 = new Option((String) null, (String) null, false, "NO_ARGS_ALLOWED");
      optionGroup0.addOption(option0);
      Options options1 = options0.addOptionGroup(optionGroup0);
      OptionGroup optionGroup1 = options1.getOptionGroup(option0);
      assertNotNull(optionGroup1);
      assertFalse(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED");
      OptionGroup optionGroup0 = new OptionGroup();
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      Options options1 = options0.addOptionGroup(optionGroup1);
      OptionGroup optionGroup2 = options1.getOptionGroup(option0);
      assertNotNull(optionGroup2);
      assertFalse(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, false, "[ Options: [ short ");
      options0.addOption(option0);
      option0.setValueSeparator('S');
      Option option1 = options0.getOption((String) null);
      assertNull(option1.getKey());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, (String) null, true, "t7D9@`z2y~FFU+");
      Options options1 = options0.addOption(option0);
      option0.setOptionalArg(true);
      Option option1 = options1.getOption((String) null);
      assertFalse(option1.isDeprecated());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, (String) null, true, "t7D9@`z2y~FFU+");
      Options options1 = options0.addOption(option0);
      option0.setArgs(743);
      Option option1 = options1.getOption((String) null);
      assertEquals(743, option1.getArgs());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, (String) null, true, "t7D9@`z2y~FFU+");
      Options options1 = options0.addOption(option0);
      option0.setArgName("t7D9@`z2y~FFU+");
      Option option1 = options1.getOption((String) null);
      assertEquals(1, option1.getArgs());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption((String) null, (String) null);
      List<Option> list0 = options1.helpOptions();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addRequiredOption("X`fFsDyp;=2F>N", "1AAwS-\"3R", false, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'X`fFsDyp;=2F>N' contains an illegal character : '`'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addRequiredOption("", "", true, "");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOptions((Options) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOptionGroup((OptionGroup) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption((Option) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("org.apache.commons.cli.TypeHandler", false, "org.apache.commons.cli.TypeHandler");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'org.apache.commons.cli.TypeHandler' contains an illegal character : '.'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("", true, "WgK0UlX}8)|=w[YjZyviVVNVff5Y(Y7&BTL");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption(" ] [ long ", " ] [ long ", false, " ] [ long ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name ' '
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("", "X.i-j'/gP/", true, "L-s} @y3j;k");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("", "[]");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("1G", "org.apache.commons.cli.TypeHandler", true, "1G");
      boolean boolean0 = options1.hasOption("1G");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, " ", true, "NW,dgY)");
      option0.setRequired(true);
      Options options1 = options0.addOption(option0);
      assertSame(options0, options1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Options options0 = new Options();
      Collection<Option> collection0 = options0.getOptions();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, "", true, (String) null);
      options0.addOption(option0);
      boolean boolean0 = options0.hasShortOption("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("A", "DOrX=FGE[gPc7C", true, "A");
      boolean boolean0 = options1.hasOption("DOrX=FGE[gPc7C");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, " ", true, "NW,dgY)");
      Options options1 = options0.addOption(option0);
      boolean boolean0 = options1.hasLongOption(" ");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, " ", true, "NW,dgY)");
      options0.addOption(option0);
      List<String> list0 = options0.getMatchingOptions("]");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = new Options();
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED");
      options1.addOption(option0);
      Options options2 = options0.addOptions(options1);
      assertNotSame(options1, options2);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, " ", true, "NW,dgY)");
      options0.addOption(option0);
      // Undeclared exception!
      try { 
        options0.addOptions(options0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Duplicate key:  
         //
         verifyException("org.apache.commons.cli.Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("A", "DOrX=FGE[gPc7C", true, "A");
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = options1.getOption("A");
      optionGroup0.addOption(option0);
      Options options2 = options1.addOptionGroup(optionGroup0);
      assertSame(options1, options2);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption((String) null, (String) null, false, "ny[vfvq#-9Vr$KNXV.");
      Option option0 = options0.getOption((String) null);
      assertNotNull(option0);
      
      options0.addOption(option0);
      assertTrue(option0.isRequired());
      assertFalse(option0.hasArg());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = options0.getOption((String) null);
      // Undeclared exception!
      try { 
        options0.getOptionGroup(option0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Options options0 = new Options();
      String string0 = options0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Options options0 = new Options();
      List<?> list0 = options0.getRequiredOptions();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("[ Options: [ short java.util.LinkedHashMap@0000000003 ] [ long {N1G=[ Option null N1G :: null :: class java.lang.String ]} ]", "M");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '['
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption((String) null, "Sd.ig*P", false, "org.apache.commons.cli.OptionGroup");
      // Undeclared exception!
      try { 
        options0.getMatchingOptions((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption((String) null, true, " :: ");
      assertSame(options1, options0);
  }
}
