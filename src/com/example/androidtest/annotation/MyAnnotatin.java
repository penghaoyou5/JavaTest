package com.example.androidtest.annotation;

/**
 * @author Administrator
 * �Զ���ע��
 */
public  @interface MyAnnotatin{

	//����ע�������
	int age();
	//����ע���Ĭ��ֵ
	String value() default "��";
	//ע�������޶� �������� ��class���͡�String���͡�ע������;   �ܶ���֮����ע������ʣ�µľ���Android��ܱ������е� WHY;
	Class clazz() default Object.class;
	
	//���ɶ���ע������
	int[] ints();
}
