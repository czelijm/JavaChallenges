package com.marekczelij;

public class SearchTree implements NodeList{
    private ListItem root = null;

    public SearchTree(ListItem root) {
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
                    currentCheckedItem.setNext(item);
                    //item.setPrevious(currentCheckedItem);
                    return true;
                }
            } else if(comparasion>0) {
                // newItem is less, insert before
                if (currentCheckedItem.previous() != null) {
                    currentCheckedItem=currentCheckedItem.previous();

                } else {
                    // the node with a previous is the root
                    //item.setNext(this.root).setPrevious(item);
                    currentCheckedItem.setPrevious(item);
                    //this.root.setPrevious(item);
                    //this.root = item;
                    return true;
                }
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
        if (item != null){
            System.out.println("Deleting item "+item.getValue());
        }
        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while(currentItem!=null){
            int comparison = currentItem.compareTo(item);
            if (comparison<0){
                parentItem=currentItem;
                currentItem=currentItem.next();
            } else if(comparison>0){
                parentItem = currentItem;
                currentItem=currentItem.previous();
            }else {
                performRemoval(currentItem, parentItem);
                return true;
            }
        }

        return false;
    }

    private void performRemoval(ListItem item, ListItem parent){
        if (item.next()==null){
            if(parent.next()==item){
                parent.setNext(item.previous());
            }else if(parent.previous()==item){
                parent.setPrevious(item.previous());
            } else {
                this.root = item.previous();
            }
        } else if(item.previous()==null){
            if(parent.next()==item){
                parent.setNext(item.next());
            }else if(parent.previous()==item){
                parent.setPrevious(item.next());
            } else {
                this.root = item.next();
            }
        } else {

            ListItem currentItem = item.next();
            ListItem leftMostParent = item;
            while(currentItem.previous()!=null){
                leftMostParent=currentItem;
                currentItem=currentItem.previous();
            }
            item.setValue(currentItem.getValue());
            if(leftMostParent==item){
                item.setNext(currentItem.next());
            } else{
                leftMostParent.setPrevious(currentItem.next());
            }

        }
    }


    @Override
    public void traverse(ListItem root) {
        //recursive method
        if(root!=null){
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
