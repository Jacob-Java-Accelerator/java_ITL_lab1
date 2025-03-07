package org.example.avl;

public class AVLTree {

    private class AVLNode {
        private int value;
        private int height;
        private AVLNode leftChild;
        private AVLNode rightChild;

        public AVLNode(int value) {
            this.value = value;
        }

        @Override
        public String toString(){
            return "value="+ this.value;
        }
    }


    private AVLNode root;

    public void insert(int value){

       root= insert(root,value);
    }

    private AVLNode insert(AVLNode root, int value){
        if(root==null){
            return new AVLNode(value);
        }
        if(value< root.value){
           root.leftChild= insert(root.leftChild,value);
        }
        else {
            root.rightChild=insert(root.rightChild,value);
        }

        root.height=Math.max(height(root.leftChild),height(root.rightChild))+1;


       return balanced(root);




    }


    private AVLNode balanced(AVLNode root){

        if(isLeftHeavy(root)){
            if(balancedFactor(root.leftChild)<0){
             root.leftChild= rotateLeft(root.leftChild);
            }
           return rotateRight(root);

        }
        else if(isLRightHeavy(root)){
            if(balancedFactor(root.rightChild)>0){
               root.rightChild= rotateRight(root.rightChild);
            }
            return rotateLeft(root);

        }
        return root;
    }

    private boolean isLeftHeavy(AVLNode node){
        return balancedFactor(node)>1;
    }

    private boolean isLRightHeavy(AVLNode node){
        return balancedFactor(node)<-1;
    }
    private int balancedFactor(AVLNode node){
        return (node==null)?0: height(node.leftChild)-height(node.rightChild);
    }
    private int height(AVLNode node){
        return (node==null)?-1:node.height;
    }

    private AVLNode rotateLeft(AVLNode root){

        var newRoot=root.rightChild;
        root.rightChild=newRoot.leftChild;
        newRoot.leftChild=root;
        setHeight(root);
        setHeight(newRoot);
        return newRoot;
    }

    private AVLNode rotateRight(AVLNode root){
         var newRoot=root.leftChild;
         root.leftChild=newRoot.rightChild;
         newRoot.rightChild=root;

         setHeight(root);
         setHeight(newRoot);

         return newRoot;
    }

    private void setHeight(AVLNode node){
        node.height=Math.max(height(root.leftChild),height(root.rightChild)+1);
    }

}
