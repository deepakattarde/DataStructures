package com.dsa.tree;

public class BuildTree {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(bst.getRoot(), 25);
		bst.insert(bst.getRoot(), 3);
		bst.insert(bst.getRoot(), 15);
		bst.insert(bst.getRoot(), 30);
		bst.insert(bst.getRoot(), 38);
		bst.insert(bst.getRoot(), 2);
		bst.insert(bst.getRoot(), 9);

//		System.out.println("is 0 present: "+bst.search(bst.getRoot(), 0));
//		System.out.println("is 9 present: "+bst.search(bst.getRoot(), 9));
//		System.out.println("Max: "+bst.findMax(bst.getRoot()));
//		System.out.println("Min: "+bst.findMin(bst.getRoot()));
		System.out.println("Height: "+bst.findHeight(bst.getRoot()));
		
//		bst.print(bst.getRoot(), "\t\t");
	}

}
