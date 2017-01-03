import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * Junit测试
 * 	@Test:用这个注解表示的该方法为测试的方法
 * 	@Before:这是测试一个方法之前调用的方法【每测试一个方法都会调用该方法】
 * 	@After:表示的为该方法是测试一个方法之后应该调用的【每测试一个方法都会调用该方法】
 * 	@BeforeClass:标识的方法必须是一个static修饰的方法，且该方法一定是在类加载之后首先调用的方法
 *  @AfterClass:标识的方法必须是一个static修饰的方法，且该方法一定是在测试完该类的所有方法之后调用的
 *  
 * @author Administrator
 *
 */
public class MTestJunit {

	public MTestJunit() {
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public static void sBefore()
	{
		System.out.println("本类类加载了....");
	}
	@AfterClass
	public static void sAfter()
	{
		System.out.println("本类的所有方法已经测试完");
	}
	
	@Before
	public void before()
	{
		System.out.println("开始方法的测试啦。。。。。before");
	}
	
	@After
	public void after()
	{
		System.out.println("结束本方法的测试。。。。。After");
	}
	
	@Test
	public void testEat()
	{
		People people = new People();
		people.eat();
	}

	@Test
	public void testSleep()
	{
		People people = new People();
		people.sleep();
	}

}
