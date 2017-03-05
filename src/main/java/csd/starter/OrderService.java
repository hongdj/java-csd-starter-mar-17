package csd.starter;

import java.util.Date;

/**
 * Created by wangsu on 2017/3/5.
 */
public class OrderService {
	/**
	 * Ԥ��
	 * @param userName
	 * @param startTime
	 * @param order
	 * @return
	 */
	public static boolean order(String userName, Date startTime, Integer order) {
		if (null == userName || "".equals(userName)) {
			throw new RuntimeException("�û�����Ϊ��");
		}
		if (null == startTime) {
			throw new RuntimeException("Ԥ����ʼʱ�䲻��Ϊ��");
		}

		if (null == order || order <= 0) {
			throw new RuntimeException("Ԥ��ʱ������Ϊ�ջ���С��0");
		}
		if (startTime.getTime() - System.currentTimeMillis() < 0) {
			return false;
		}
		return true;
	}
}
