package BinaryTrees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class gfgPostInTree {

public static void main(String[] args) {
		
		int []post={8, 4, 5, 2, 6, 7, 3, 1};
		int in[]={4, 8, 2, 5, 1, 6, 3, 7};
		BinaryTreeNode<Integer> root=getTreeFromPostorderAndInorder(post, in);

		print(root);
		// TODO Auto-generated method stub

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


	public static HashMap<Integer,Integer> map=new HashMap<>();

    public static BinaryTreeNode<Integer> getTreeFromPostorderAndInorder(int[] post,
                                                                         int[] in){

        map=new HashMap<>();
        int index=0;	
        for(int i : in ){
            map.put(i,index);
            index++;
        }

        // Write your code here
        return  getTree(post,in,0,in.length-1,post.length-1);
    }

       public static BinaryTreeNode<Integer> getTree(int[] post,int[] in, int inS, int inE, int posE){



        //if(pSi>pre.length || pSi > pEi || iSi > iEi || iSi > in.length || pEi > pre.length || iEi > in.length)
        // return null;

        if(inS > inE )
            return null;

        BinaryTreeNode<Integer> root=new BinaryTreeNode(post[posE]);
       
        
        
        

        if(inS == inE)
        return root;

        int inRootIndex=map.get(root.data);

        int leftInS=inS;
        int leftInE=inRootIndex-1;
        //int leftPosS= posS ;  
        //int leftPosE= leftInE-leftInS+leftPosS;
        //int leftPosE=;


        int rightInS=inRootIndex+1;
        int rightInE=inE;
        //int rightPosS= leftPosE+1;
        //int rightPosE=posE-1;



        

        root.left= getTree(post,in,leftInS,leftInE,posE-1);
        root.right= getTree(post,in,rightInS,rightInE,posE-1);
       

        return root;


    }

}
