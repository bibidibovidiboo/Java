package com.sist.ann;
public class MovieModel {
	@RequestMapping("list") // �ε���
	public void list() {
		System.out.println("��� ���!!");
	}
	@RequestMapping("insert") 
	public void insert() {
		System.out.println("������ �߰�!!");
	}
	@RequestMapping("update")
	public void update() {
		System.out.println("������ ����!!");
	}
	@RequestMapping("delete")
	public void delete() {
		System.out.println("������ ����!!");
	}
	@RequestMapping("println")
	public void find() {
		System.out.println("������ ã��!!");
	}
}
