import org.junit.Test;

public class JunitTest {

	SomeServiceImpl service = new SomeServiceImpl();
	
	@Test
	public void xxx() {
		System.out.println(service.getMessage());
	}
}
