/*	 < �������̵�  >
 * 	1. �ݵ�� ��Ӱ���
 * 	2. �޼ҵ���� ����
 * 	3. �ް������� ���� (����,��������)
 * 	4. �������� ���� 
 *  5. ����������� Ȯ�� , ����� �� ����	
 *	   =========
 *	    public > protected > default > private
 *	    ===========================================
 *				   ���� Ŭ����   ���� ��Ű��  �ٸ���Ű��  ���Ŭ����
 *		===========================================
 *		private		 O		O		O		O
 *		===========================================
 *		default		 O		O		O		X		
 *		===========================================
 *		protected	 O		O		X		X		
 *		===========================================
 *		public		 O		X		X		X
 *		===========================================
 *
 *	   => class A 
 *		{
 *			private void display(){}
 *		}
 *		class B extends A {
 *			1. private void display(){}
 *			2. void display(){}
 *			3. protected void display(){}
 *			4. public void display(){}
 *		}
 *
 *		class A
 *		{
 *			private int a;
 *			// setter // getter
 *		}
 *		class B {
 *		}
 *
 */
package com.sist.oop;
public class �������̵�_������ {
	
	private void pub() {
		// TODO Auto-generated method stub

	}

}
