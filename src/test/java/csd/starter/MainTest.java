package csd.starter;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

public class MainTest {

	@Test
	public void orderTest() throws Exception {
		String userName = "jack";
		Integer order = 30;
		//�����߼� �ȵ�ǰʱ���1000
		Date startTime = new Date((new Date()).getTime() + 1000);
		assertEquals(true, OrderService.order(userName, startTime, order));
		//����Ԥ��֮ǰ��ʱ�� 
		startTime = new Date((new Date()).getTime() - 1000);
		assertEquals(false, OrderService.order(userName, startTime, order));
	}

	//	@Test
	//	public void lambda() {
	//		//        Function<Integer, Integer> inc = (i) -> i + 1;
	//		//        assertEquals(Integer.valueOf(2), inc.apply(2));
	//	}
	//
	//	@Test
	//	public void uat() {
	//		//        Scanner scanner = new Scanner("fake input");
	//		//        Scanner scanner1 = new Scanner(System.in);
	//		//
	//		//        System.setIn();
	//		//        System.setOut();
	//		//
	//		//        Main.main();
	//
	//	}

}
