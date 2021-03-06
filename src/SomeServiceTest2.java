
import junit.framework.TestCase;

/**
 * JUnit은 자바 단위테스트 수행을 위한 범용 단위 테스트 프레임워크이다
 * Eric Gamma와 Kent Beck이 1997년에 제작
 * junit.org에서 다운로드 받을 수 있으며, Eclipse에 기본 포함되어 있다.(JUnit 3/4)
 * JUnit 3에서 제공하는 TestCase 클래스를 상속받아 Test 클래스를 정의하는 방법
 */
public class SomeServiceTest2 extends TestCase {
	
	SomeServiceImpl service;
	
	public SomeServiceTest2() {
		service = new SomeServiceImpl();
	}
	
	@Override
	protected void setUp() throws Exception {
		// 선행 작업(자원할당 등)
	}
	
	@Override
	protected void tearDown() throws Exception {
		// 후행 작업(자원해제 등)
	}
	
	// 테스트를 수행할 메소드 1개 이상 정의 가능(반드시 test로 시작)
	// JUnit에 의해 자동 실행
	public void testCalculator() {
		// TestCase가 제공하는 확언(단언) 메소드들 호출로 테스트(검증)
		assertEquals(30, service.sum(10, 20)); //assertEquals(expected, actual);
		assertNotNull(service.getMessage());
		
		//assertEquals
		//assertNull
		//assertNotNull
		//assertSame
		//assertNotSame
		//assertTrue
		//assertFalse
	}

}
