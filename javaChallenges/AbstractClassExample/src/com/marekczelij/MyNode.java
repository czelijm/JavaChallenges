package com.marekczelij;

public class MyNode extends ListItem{

    public MyNode(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.nextItem;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.nextItem = item;
        return this.nextItem;
    }

    @Override
    ListItem previous() {
        return this.previousItem;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.previousItem=item;
        return this.previousItem;
    }

    @Override
    int compareTo(ListItem item) {
        if(item !=null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }else {
            return -1;
        }
    }
}
