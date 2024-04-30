/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 23 13:01:31 GMT 2024
 */

package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import java.util.HashMap;
import java.util.List;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class CSVRecord_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[4];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "A header name is missing in ", 0L, 0L);
      boolean boolean0 = cSVRecord0.isSet(4);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[8];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "", 1107L, 0L);
      boolean boolean0 = cSVRecord0.isSet(0);
      assertEquals(0L, cSVRecord0.getCharacterPosition());
      assertTrue(boolean0);
      assertEquals(1107L, cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "", 0L, 0L);
      String[] stringArray1 = cSVRecord0.values();
      assertSame(stringArray0, stringArray1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, (String[]) null, (String) null, 402L, 0L);
      cSVRecord0.toList();
      assertEquals(0L, cSVRecord0.getCharacterPosition());
      assertEquals(402L, cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, (String[]) null, (String) null, 402L, 0L);
      cSVRecord0.size();
      assertEquals(402L, cSVRecord0.getRecordNumber());
      assertEquals(0L, cSVRecord0.getCharacterPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[2];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "lC!0a`$nA+", 0L, 0L);
      HashMap<String, String> hashMap0 = cSVRecord0.putIn((HashMap<String, String>) null);
      assertNull(hashMap0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[1];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "", (-1760L), 2222L);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("", "");
      cSVRecord0.putIn(hashMap0);
      assertEquals(2222L, cSVRecord0.getCharacterPosition());
      assertEquals((-1760L), cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, (String[]) null, (String) null, 402L, 0L);
      cSVRecord0.iterator();
      assertEquals(0L, cSVRecord0.getCharacterPosition());
      assertEquals(402L, cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[5];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "?n ", 0L, 0L);
      long long0 = cSVRecord0.getRecordNumber();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[7];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "%t[>0D\"M2wcz]2&:bC", (-3134L), (-1526L));
      long long0 = cSVRecord0.getRecordNumber();
      assertEquals((-1526L), cSVRecord0.getCharacterPosition());
      assertEquals((-3134L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, (String[]) null, (String) null, 402L, 0L);
      cSVRecord0.getComment();
      assertEquals(0L, cSVRecord0.getCharacterPosition());
      assertEquals(402L, cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[9];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "", (-1592L), (-1592L));
      cSVRecord0.getComment();
      assertEquals((-1592L), cSVRecord0.getCharacterPosition());
      assertEquals((-1592L), cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[1];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "", (-1760L), 2222L);
      long long0 = cSVRecord0.getCharacterPosition();
      assertEquals(2222L, long0);
      assertEquals((-1760L), cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[8];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "]l;l9", 866L, (-708L));
      long long0 = cSVRecord0.getCharacterPosition();
      assertEquals((-708L), long0);
      assertEquals(866L, cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[6];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, stringArray0[1], 773L, 773L);
      cSVRecord0.get(3);
      assertEquals(773L, cSVRecord0.getCharacterPosition());
      assertEquals(773L, cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[2] = "|umqg@/x4`:]q";
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "]l;l9", 866L, (-708L));
      String string0 = cSVRecord0.get(2);
      assertNotNull(string0);
      assertEquals((-708L), cSVRecord0.getCharacterPosition());
      assertEquals(866L, cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[2] = "";
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "", 866L, (-708L));
      String string0 = cSVRecord0.get(2);
      assertEquals((-708L), cSVRecord0.getCharacterPosition());
      assertEquals(866L, cSVRecord0.getRecordNumber());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, (String[]) null, (String) null, 402L, 0L);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      cSVRecord0.putIn(hashMap0);
      assertEquals(402L, cSVRecord0.getRecordNumber());
      assertEquals(0L, cSVRecord0.getCharacterPosition());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[1];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "/3\"~/pGSj!E", 1L, 1L);
      cSVRecord0.isMapped("(D`hih]rS*+5-cl");
      assertEquals(1L, cSVRecord0.getCharacterPosition());
      assertEquals(1L, cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, (String[]) null, (String) null, 402L, 0L);
      cSVRecord0.stream();
      assertEquals(402L, cSVRecord0.getRecordNumber());
      assertEquals(0L, cSVRecord0.getCharacterPosition());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[3];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "", (-883L), (-883L));
      List<String> list0 = cSVRecord0.toList();
      assertEquals((-883L), cSVRecord0.getRecordNumber());
      assertEquals((-883L), cSVRecord0.getCharacterPosition());
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[2];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "lC!0a`$nA+", 0L, 0L);
      boolean boolean0 = cSVRecord0.isSet(98);
      assertFalse(boolean0);
      assertEquals(2, cSVRecord0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[3];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "", (-883L), (-883L));
      boolean boolean0 = cSVRecord0.isSet((-1808));
      assertEquals(3, cSVRecord0.size());
      assertEquals((-883L), cSVRecord0.getCharacterPosition());
      assertEquals((-883L), cSVRecord0.getRecordNumber());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[9];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "00M)<XVW", (-4009L), (-4009L));
      boolean boolean0 = cSVRecord0.isSet(stringArray0[4]);
      assertEquals((-4009L), cSVRecord0.getRecordNumber());
      assertEquals(9, cSVRecord0.size());
      assertFalse(boolean0);
      assertEquals((-4009L), cSVRecord0.getCharacterPosition());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "\u2029", (-1L), 0L);
      boolean boolean0 = cSVRecord0.isConsistent();
      assertEquals((-1L), cSVRecord0.getRecordNumber());
      assertTrue(boolean0);
      assertEquals(0L, cSVRecord0.getCharacterPosition());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[3];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "", 3247L, 3247L);
      boolean boolean0 = cSVRecord0.hasComment();
      assertEquals(3247L, cSVRecord0.getCharacterPosition());
      assertTrue(boolean0);
      assertEquals(3, cSVRecord0.size());
      assertEquals(3247L, cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[16];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, stringArray0[1], (-849L), (-849L));
      boolean boolean0 = cSVRecord0.hasComment();
      assertEquals((-849L), cSVRecord0.getRecordNumber());
      assertFalse(boolean0);
      assertEquals(16, cSVRecord0.size());
      assertEquals((-849L), cSVRecord0.getCharacterPosition());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[16];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, stringArray0[1], (-849L), (-849L));
      // Undeclared exception!
      try { 
        cSVRecord0.get("x)");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No header mapping was specified, the record values can't be accessed by name
         //
         verifyException("org.apache.commons.csv.CSVRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[16];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, stringArray0[1], (-849L), (-849L));
      int int0 = cSVRecord0.size();
      assertEquals((-849L), cSVRecord0.getRecordNumber());
      assertEquals((-849L), cSVRecord0.getCharacterPosition());
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[1];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "/3\"~/pGSj!E", 1L, 1L);
      long long0 = cSVRecord0.getRecordNumber();
      assertEquals(1L, long0);
      assertEquals(1, cSVRecord0.size());
      assertEquals(1L, cSVRecord0.getCharacterPosition());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[1];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "/3\"~/pGSj!E", 1L, 1L);
      cSVRecord0.getParser();
      assertEquals(1, cSVRecord0.size());
      assertEquals(1L, cSVRecord0.getRecordNumber());
      assertEquals(1L, cSVRecord0.getCharacterPosition());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[1];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "/3\"~/pGSj!E", 1L, 1L);
      // Undeclared exception!
      try { 
        cSVRecord0.get((-1109));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1109
         //
         verifyException("org.apache.commons.csv.CSVRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String[] stringArray0 = new String[9];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "00M)<XVW", (-4009L), (-4009L));
      String[] stringArray1 = cSVRecord0.values();
      assertEquals((-4009L), cSVRecord0.getRecordNumber());
      assertEquals(9, stringArray1.length);
      assertEquals((-4009L), cSVRecord0.getCharacterPosition());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String[] stringArray0 = new String[2];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "lC!0a`$nA+", 0L, 0L);
      String string0 = cSVRecord0.toString();
      assertEquals("CSVRecord [comment='lC!0a`$nA+', recordNumber=0, values=[null, null]]", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String[] stringArray0 = new String[1];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "/3\"~/pGSj!E", 1L, 1L);
      cSVRecord0.toMap();
      assertEquals(1, cSVRecord0.size());
      assertEquals(1L, cSVRecord0.getCharacterPosition());
      assertEquals(1L, cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String[] stringArray0 = new String[2];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "lC!0a`$nA+", 0L, 0L);
      cSVRecord0.getCharacterPosition();
      assertEquals(2, cSVRecord0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String[] stringArray0 = new String[1];
      CSVRecord cSVRecord0 = new CSVRecord((CSVParser) null, stringArray0, "/3\"~/pGSj!E", 1L, 1L);
      cSVRecord0.getComment();
      assertEquals(1L, cSVRecord0.getRecordNumber());
      assertEquals(1L, cSVRecord0.getCharacterPosition());
      assertEquals(1, cSVRecord0.size());
  }
}
