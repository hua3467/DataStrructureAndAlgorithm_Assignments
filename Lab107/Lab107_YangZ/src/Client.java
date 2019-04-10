/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zhenhuayang
 */
public class Client {
    public static void main(String[] args) {
        LinkedBinaryTree<String> myTree = new LinkedBinaryTree<>();
        myTree.addRoot("+");
        myTree.addLeft(myTree.left(myTree.root()), "/");
        myTree.addRight(myTree.right(myTree.root()), "*");
    }
 
}
