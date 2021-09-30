package �ڹٻ�ӿ���;

import java.util.*;

/**
 * 
 */
public class VIPCustomer extends Customer {

	// ��� ����
    private double saleRatio;
    private int agentID;
    
    // ������
    public VIPCustomer(int customerID, String customerName, int agentID) {
    	super(customerID, customerName);	// �θ� Ŭ���� ������ ȣ��. super()�� �ݵ�� ù ���ο� ȣ��
    	this.customerGrade = "VIP";
    	this.bonusRatio = 0.05;
    	this.saleRatio = 0.1;
    	this.agentID = agentID;
    }

    // ���� ������ ��
    // �������̵�: c ���� ��Ʈ��+�����̽� ������ ���� ����
//    @Override // ������ => ������ ���� => �޼ҵ� �������̵��� ���� �������� ������ �� �ִ�.
//    public int calcPrice(int price) {
//    	price *= 1 - saleRatio;
//    	bonusPoint += (price * bonusRatio);
//        return price;
//    }
    
    // �������� �����Ͻ� ��
    @Override
    public int calcPrice(int price) {
    	bonusPoint += price * bonusRatio;
    	return price - (int)(price * saleRatio);
    }
    
    
    // VIP �����Ը� �ʿ��� �޼ҵ� ����
    public int getAgentID() {
        return agentID;
    }

}