package com.marekczelij;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public interface MousePressListener extends MouseListener {

    @Override
    default void mousePressed(MouseEvent e){}

//    @Override
//    default void mouseClicked(MouseEvent e){}

    @Override
    default void mouseReleased(MouseEvent e){}

    @Override
    default void mouseEntered(MouseEvent e){}

    @Override
    default void mouseExited(MouseEvent e){}
}
