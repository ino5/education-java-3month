package �ڹٻ�ӿ���;	


import java.util.*;

/**
 * Customer�� �θ� Ŭ����(����, ����) => '�Ϲ�����' Ŭ���� ����
 */
public class Customer {
	// ��� ���� ���� => �ڽ�(����, ����) Ŭ�������� �������� ����� �Ӽ�
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusRatio;	
	
    
    //[�߰�] ���ʽ� ����Ʈ�� õ �������� �޸� �ֱ� ���� ����
    String bonusPoint_value;
    
    // ����Ʈ ������
    public Customer() {}
    
    // ������
    public Customer(int customerID, String customerName) {
    	this.customerID = customerID;
    	this.customerName = customerName;
    	this.customerGrade = "GENERAL";
    	this.bonusRatio = 0.01;
    }

    
    // ��ǰ ���� �ݾ� ����ϴ� �޼ҵ� ����
    public int calcPrice(int price) {
    	bonusPoint += (price * bonusRatio); // ���ʽ� ����Ʈ ���
        return price;
    }

    // �� ���� ��� �޼ҵ� ����
    // ���� ������ ��
//    public String showCustomerInfo() {
//    	String Info = "";
//    	Info += "customerID: " + customerID;
//    	Info += ", customerName: " + customerName;
//    	Info += ", customerGrade: " + customerGrade;
//    	Info += ", bonusPoint: " + Utils.toNumberFormat(bonusPoint);
//        return Info;
//    }
    public String showCustomerInfo() {
    	bonusPoint_value = Utils.toNumberFormat(bonusPoint);
    	return customerName + " ���� ����� " + customerGrade + " �̸�, ���� ���ʽ� ����Ʈ�� " + bonusPoint_value + "�Դϴ�.";
    }
    
    // getter, setter �޼ҵ�
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

}