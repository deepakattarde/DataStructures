package com.dsa.datastruct;

public class BuildLinkedList {

	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		
		linkedList.printLinkedList(linkedList.getHeadNode());
		
		linkedList.addToTheStart(3);
		linkedList.addToTheStart(5);
		linkedList.addToTheStart(1);
		linkedList.addToTheStart(7);
		
		linkedList.addToTheEnd(2);
		linkedList.addToTheEnd(6);
		
		linkedList.printLinkedList(linkedList.getHeadNode());
		linkedList.addInBetween(9, 3);
		System.out.println();
		linkedList.printLinkedList(linkedList.getHeadNode());
		System.out.println();
		linkedList.addInBetween(8, 4);
		linkedList.addInBetween(15, 15);
		linkedList.printLinkedList(linkedList.getHeadNode());
		System.out.println("Deleting...");
		linkedList.delete(3);
		linkedList.printLinkedList(linkedList.getHeadNode());
		System.out.println();
	}

}
