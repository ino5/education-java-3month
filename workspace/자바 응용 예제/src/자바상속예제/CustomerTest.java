package �ڹٻ�ӿ���;

import �ݾ׿��޸��ֱ�.Utils;

public class CustomerTest {
	//[�߰�]
	public static String price_value;
	
	
	public static void main(String[] args) {
		// ���� ������ ��
//		VIPCustomer vipCustomer = new VIPCustomer(1, "jack", 1100);
//		System.out.println("���� �ݾ�: " + Utils.toNumberFormat(vipCustomer.calcPrice(1000000)));
//		System.out.println(vipCustomer.showCustomerInfo());
		
		Customer customerPark = new Customer(10010, "����ȣ");
		customerPark.bonusPoint = 10;
		System.out.println(customerPark.showCustomerInfo());
		
		int pricePark = customerPark.calcPrice(200000);
		//[�߰�]
		price_value = Utils.toNumberFormat(pricePark);
		System.out.println("��ǰ ���� �ݾ�: " + price_value + "��");
		System.out.println();
		
		VIPCustomer customerSon = new VIPCustomer(10020, "������", 1234);
		customerSon.bonusPoint = 200;
		System.out.println(customerSon.showCustomerInfo());
		
		int priceSon = customerSon.calcPrice(500000);
		price_value = Utils.toNumberFormat(priceSon);
		System.out.println("��ǰ ������ ���� ���� �ݾ�: " + price_value + "��");
		System.out.println();
		
		int agentID = customerSon.getAgentID();
		System.out.println("VIP �� ��� ���� ���̵�: " + agentID);
		System.out.println();
		
		GoldCustomer customerLee = new GoldCustomer(10050, "�̵���");
		customerLee.bonusPoint = 50;
		System.out.println(customerLee.showCustomerInfo());

		int priceLee = customerSon.calcPrice(300000);
		price_value = Utils.toNumberFormat(priceLee);
		System.out.println("��ǰ ������ ���� ���� �ݾ�: " + price_value + "��");		
	}

}
