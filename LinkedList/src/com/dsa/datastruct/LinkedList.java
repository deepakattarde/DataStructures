package com.dsa.datastruct;

public class LinkedList {

	private Node headNode;

	public Node getHeadNode() {
		return headNode;
	}

	public void setHeadNode(Node headNode) {
		this.headNode = headNode;
	}
	
	public void addToTheStart(int data) {
		Node node = new Node();
		node.setData(data);
		
		if(headNode == null) {
			this.headNode = node;
			System.out.println("Adding first node");
		}else {
			node.setNext(this.headNode);
			this.headNode = node;
			System.out.println("Updating head node");
		}
	}
	
	public void printLinkedList(Node node) {
		if(headNode == null) {
			System.out.println("Linked list is Empty");
			return;
		}
		if(node != null) {
			System.out.print(node.getData() + "\t");
			printLinkedList(node.getNext());
		}
	}
	
	public boolean isEmpty() {
		return (headNode == null);
	}
	
	public void addToTheEnd(int data) {
		if(headNode == null) {
			addToTheStart(data);
			return;
		}
		Node currentNode = headNode;
		while(currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		}
		Node lastNode = new Node();
		lastNode.setData(data);
		currentNode.setNext(lastNode);
	}
	
	public void addInBetween(int data, int index) {
		if(headNode == null) {
			addToTheStart(data);
			return;
		}
		Node currentNode = headNode;
		Node inBetweenNode = new Node();
		inBetweenNode.setData(data);
		int i = 0;
		while(i!=(index-1)) {
			if(currentNode == null) {
				System.out.println("**Insert failed. Index is bigger than linked list , size: "+i+", index:"+index);
				return;
			}
			currentNode = currentNode.getNext();
			i++;
		}
		Node nextNode = currentNode.getNext();
		currentNode.setNext(inBetweenNode);
		inBetweenNode.setNext(nextNode);
	}
	
	public void delete(int index) {
		if(headNode == null) {
			System.out.println("Nothing to delete. List is empty.");
			return;
		}
		Node currentNode = headNode;
		Node previousNode = headNode;
		int i = 1;
		while(i!=(index)) {
			if(currentNode == null) {
				System.out.println("**Delete failed. Index is bigger than linked list , size: "+i+", index:"+index);
				return;
			}
			previousNode = currentNode;
			currentNode = currentNode.getNext();
			i++;
			System.out.println("prev: "+previousNode.getData()+", curr: "+currentNode.getData());
		}
		previousNode.setNext(currentNode.getNext());
	}
}
