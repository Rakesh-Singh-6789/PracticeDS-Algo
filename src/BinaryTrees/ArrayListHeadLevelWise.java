package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import BinaryTrees.ArrayListHeadLevelWise.Node;

public class ArrayListHeadLevelWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/*	Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	 */

	/* class Node<T> {
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
		}
	}
*/
	
	class Node<T> {
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
		}
	}
	public static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root) {
		
		// Write your code here
        Queue<BinaryTreeNode<Integer>> pq=new LinkedList<>();
        ArrayList<Node<BinaryTreeNode<Integer>>> list = null;
        pq.add(root);
        
        while(true){
            
            int nodeCount=pq.size();
            if(nodeCount==0)
                break;
            
            Node<BinaryTreeNode<Integer>> headNode=null;
            Node<BinaryTreeNode<Integer>> tail=null;
            while(nodeCount-->0){
                BinaryTreeNode<Integer> frontNode=pq.poll();
                
                if(headNode==null){
                	
                	//BinaryTreeNode<Integer> inNode=new BinaryTreeNode<Integer>(frontNode.data);
                	Node<BinaryTreeNode<Integer>> newTemp=new Node(frontNode);
                	headNode=newTemp;
                	tail=newTemp;
                	}else{
                		Node<BinaryTreeNode<Integer>> newTemp=new Node(frontNode);
                		tail.next=newTemp;
                		tail=newTemp;
                	}
                
                if(frontNode.left!=null)
                pq.add(frontNode.left);
                
                if(frontNode.right!=null)
                	pq.add(frontNode.right);
            }
            list.add(headNode);   
            
            
            
        }
        

        
        return list;       

	}


}
