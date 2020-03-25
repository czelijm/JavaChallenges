package com.marekczelij;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //MyLinkedList list = new MyLinkedList(null);
        SearchTree list = new SearchTree(null);
        list.traverse(list.getRoot());

        //String stringData = "Marek Darek Jarek Koszarek Pieczarek Darek";
        String stringData = "6 9 1 5 2 0 2 3 8 7 4";


        String[] spiltStringData = stringData.split(" ");

        for (String s:spiltStringData
             ) {
            list.addItem(new MyNode(s));
        }
        list.traverse(list.getRoot());

        list.removeItem(new MyNode("3"));
         list.traverse(list.getRoot());
    }
}
