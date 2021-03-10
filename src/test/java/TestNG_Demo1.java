import org.testng.annotations.*;
//import sun.jvm.hotspot.utilities.AssertionFailure;
import static org.testng.AssertJUnit.assertEquals;

public class TestNG_Demo1 {
    @Test
    public void test1(){
        System.out.println("test");
        assertEquals(2+2, 4);
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("----------beforeClass");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("-----------afterClass");
    }

    @BeforeMethod
    public void  before(){
        System.out.println("=========beforeMethod");
    }

    @AfterMethod
    public void  after(){
        System.out.println("===========afterMethod");

    }

    @Test(groups = {"高"})
    public void testCase1(){
        System.out.println("test case 1");

    }

    @Test(groups = {"低"})
    public void testCase2(){
        System.out.println("test case 2");
    }

//    @Test
//    @Parameters({"add1", "add2", "result"})
//    public void testTest3(int add1, int add2, int result){
////        System.out.println((Object)add1 instanceof Integer);
////        int a = Integer.parseInt("666");
////        System.out.println(add1);
//        assertEquals(add1+add2, result);
//        System.out.println("断言 成功");
//    }


    // 定义对象数组
    @DataProvider(name="addd")
    public Object[][] Users(){
        return new Object[][] {
                {3,2,5},
                {2,2,4},
                {3,3,6}
        };
    }
    @Test(dataProvider = "addd")
    public void testAdd2(int addd1, int addd2, int results){
        assertEquals(addd1+addd2, results);
    }


}







