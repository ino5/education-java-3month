package �ڹٻ�ӿ���;

import java.util.*;

/**
 * 
 */
public class GoldCustomer extends Customer {
	// ��� ����
	private double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		this.customerGrade = "GOLD";
		this.bonusRatio = 0.02;
		this.saleRatio = 0.1;
	}
	
	//���� ������ ��
//	public int calcPrice(int price) {
//		price *= 1 - saleRatio;
//		bonusPoint += (price * bonusRatio);
//		return price;
//	}
	
    // �������� �����Ͻ� ��
    @Override
    public int calcPrice(int price) {
    	bonusPoint += price * bonusRatio;
    	return price - (int)(price * saleRatio);
    }
}