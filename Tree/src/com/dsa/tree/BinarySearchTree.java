package com.dsa.tree;

public class BinarySearchTree {

	private Node root;

	public Node getRoot() {
		return root;
	}

	private Node getNewNode(int data) {
		Node node = new Node();
		node.setData(data);
		return node;
	}
	
	public Node insert(Node node, int data) {
		System.out.println("Starting insert");
		if(node == null) {
			System.out.println("Node is null");
			node = getNewNode(data);
			if(root == null) {
				root = node;
				System.out.println("root assigned: "+root.getData());
			}
			System.out.println("Node created: "+node.getData());
		}else if (data <= node.getData()) {
			System.out.println("Inserting in left");
			node.setLeft(insert(node.getLeft(), data));
			System.out.println("Left insertion Done: "+node.getLeft().getData());
		}else {
			System.out.println("Inserting in right");
			node.setRight(insert(node.getRight(), data));
			System.out.println("Right insertion done: "+node.getRight().getData());
		}
		System.out.println("------------------------");
		return node;
	}
	
	public void print(Node node, String str) {
//		Node temp = node;
//		System.out.println("Printing tree: ");
		if(node == null) {
			return;
		}
		if(node == root)
			System.out.println("\tRoot:"+node.getData());
		System.out.println("Node: "+node.getData()+": "+((node.getLeft() != null) ? "L:"+node.getLeft().getData() : "") + " "+str
				+ ((node.getRight() != null) ? "R:"+node.getRight().getData() : ""));
		print(node.getLeft(), " ");
		print(node.getRight(),"\t\t");

	}
	
	public boolean search(Node node, int data) {
		if(node == null) {
			return false;
		}
		if(node.getData() == data) {
			return true;
		}else if (data < node.getData()) {
			return search(node.getLeft(), data);
		}else {
			return search(node.getRight(), data);
		}
	}
	
	public int findMax(Node node) {
		if(node.getRight() == null) {
			return node.getData();
		}
		return findMax(node.getRight());
	}
	
	public int findMin(Node node) {
		if(node.getLeft() == null) {
			return node.getData();
		}
		return findMin(node.getLeft());
	}
	
	public int findHeight(Node node) {
		if(node == null) {
			return -1;
		}
		int leftHeight = findHeight(node.getLeft());
		int rightHeight = findHeight(node.getRight());
		System.out.println("Node: "+node.getData()+", (max("+leftHeight+", "+rightHeight+") + 1)");
		return (Math.max(leftHeight, rightHeight)) + 1;
	}
}
