package com.marekczelij;

public class MyLinkedList implements NodeList{

    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if ( this.root==null){
            this.root=item;
            return true;
        }

        ListItem currentCheckedItem = this.root;
        while (currentCheckedItem!=null){
            int comparasion = currentCheckedItem.compareTo(item);
            if (comparasion<0){
                // new item is greater, move forward if possible
                if(currentCheckedItem.next()!=null){
                    currentCheckedItem=currentCheckedItem.next();
                }
                else {
                    //there is no next, si insert at the end of list
                    currentCheckedItem.setNext(item).setPrevious(currentCheckedItem);
                    //item.setPrevious(currentCheckedItem);
                    return true;
                }
            } else if(comparasion>0) {
                // newItem is less, insert before
                if (currentCheckedItem.previous() != null) {
                    currentCheckedItem.previous().setNext(item).setPrevious(currentCheckedItem.previous());
                    //item.setPrevious(currentCheckedItem.previous());
                    //currentCheckedItem.setPrevious(item);
                    item.setNext(currentCheckedItem).setPrevious(item);
                } else {
                    // the node with a previous is the root
                    item.setNext(this.root).setPrevious(item);
                    //this.root.setPrevious(item);
                    this.root = item;
                }
                return true;
            }else{
                //equal
                System.out.println(item.getValue() + " is already present in the list");
                return false;
            }
        }
        return false;


    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item!=null){
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while(this.root!=null){
            int comparision = currentItem.compareTo(item);
            if(comparision==0){
                if(currentItem==this.root){
                    this.root = currentItem.next();
                } else{
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next()!=null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            }else if(comparision<0){
                currentItem=currentItem.next();
            } else { // item is not in the list
                return false;
            }
        }
        //we reached end of the list nothing finded
        return false;
    }

    @Override
    public void traverse(ListItem root) {
//it's ok
        if(root==null){
            System.out.println("List is empty");
        } else {
            while (root != null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }
//it's ok too but can crash :D
//        if(root!=null){
//            System.out.println(root.getValue());
//            traverse(root.next());
//        }
    }


}
