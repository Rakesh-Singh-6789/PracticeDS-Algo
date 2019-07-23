package BinaryTrees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class preInTree {

	public static HashMap<Integer,Integer> map=new HashMap<>();
	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre,int[] in){
		map=new HashMap<>();
		int index=0;	
		for(int i : in ){
			map.put(i,index);
			index++;
		}

		// Write your code here
		return  getTree(pre,in,0,pre.length-1,0,in.length-1);
	}

	public static BinaryTreeNode<Integer> getTree(int[] pre,int[] in,int pSi,int pEi, int iSi, int iEi){



		//if(pSi>pre.length || pSi > pEi || iSi > iEi || iSi > in.length || pEi > pre.length || iEi > in.length)
		// return null;

		if(iSi > iEi )
			return null;

		BinaryTreeNode<Integer> root=new BinaryTreeNode(pre[pSi]);

		int inRootIndex=map.get(root.data);

		//if(pSi==pEi || iSi == iEi)
		//return root;

		int leftPreS= pSi +1;        
		int leftInS=iSi;
		int leftInE=inRootIndex-1;
		int leftPreE= leftInE-leftInS+leftPreS;

		int rightPreS= leftPreE+1;
		int rightPreE=pEi;
		int rightInS=inRootIndex+1;
		int rightInE=iEi;





		root.left= getTree(pre,in,leftPreS,leftPreE,leftInS,leftInE);

		root.right= getTree(pre,in,rightPreS,rightPreE,rightInS,rightInE);

		return root;


	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []pre={1, 2, 3, 4, 15, 5, 6, 7, 8, 10, 9 ,12};
		int in[]={4, 15, 3, 2, 5, 1, 6, 10, 8, 7, 9, 12};
		BinaryTreeNode<Integer> root=getTreeFromPreorderAndInorder(pre, in);

		print(root);


	}

	private static void print(BinaryTreeNode<Integer> root) {


		Queue<BinaryTreeNode<Integer>> pq=new LinkedList<>();
		pq.add(root);

		while(true){

			int nodeCount=pq.size();
			if(nodeCount==0)break;
               
			
			
			while(nodeCount-->0){
				BinaryTreeNode<Integer> frontNode=pq.poll();
				System.out.print(frontNode.data+" ");
				if(frontNode.left!=null)
				pq.add(frontNode.left);
				
				if(frontNode.right!=null)
				pq.add(frontNode.right);
			}
			System.out.println();

			/*if(frontNode.left!=null){
				System.out.print(frontNode.left.data+" ");
				pq.add(frontNode.left);
			}  

			if(frontNode.right!=null){
				System.out.print(" "+frontNode.right.data);
				pq.add(frontNode.right);
			}*/

			System.out.println();
		}

	}
}