package �ڹٻ�ӿ���;

import �ݾ׿��޸��ֱ�.Utils;

public class CustomerTest {

	public static void main(String[] args) {
		VIPCustomer vipCustomer = new VIPCustomer(1, "jack", 1100);
		System.out.println("���� �ݾ�: " + Utils.toNumberFormat(vipCustomer.calcPrice(1000000)));
		System.out.println(vipCustomer.showCustomerInfo());
	}

}
