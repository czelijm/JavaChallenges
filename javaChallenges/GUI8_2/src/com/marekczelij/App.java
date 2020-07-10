package com.marekczelij;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.geom.Rectangle2D;
import java.util.List;

public class App {
    private JPanel panelMain;
    private JButton button1;
    private JTextField textField1;
    private JFrame frame;
    private boolean appIsRunning=true;

    private int x = 0;
    private int y = 0;
    private int width = 0;
    private int height = 0;


    public App(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    //    public App() {
//        panelMain.setPreferredSize(new Dimension(840,680));
//        button1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                start();
//            }
//        });
//    }
    public void updateCoordinatesBy(double by) {
        this.x += by;
        this.y += by;
    }

    public Screen giveRect() {
        return new Screen(x, y, width, height);
    }

//    public void drawRectangle(JPanel frame){
//        frame.add(new Screen());
//    }

//    public void drawRectangle(){
//        drawRectangle(panelMain);
//    }

    public static void main(String[] args) {
        App app = new App(10, 10, 30, 30);

        app.frame = new JFrame("App");
//        frame.setContentPane(app.panelMain);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        app.frame.pack();
        app.frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(WindowEvent winEvt) {
                app.appIsRunning=false;
                System.exit(0);
            }
        });




        app.start();
        app.start();
        app.start();
        app.start();
        app.start();
        app.start();
        app.frame.setSize(840, 680);
//        app.button1=new JButton();
//        app.button1.setSize(40,40);
//        app.button1.setVisible(true);
//        app.button1.setText("HelloWorld");
//        frame.add(app.button1);
        app.frame.setLocationRelativeTo(null);
        app.frame.setVisible(true);
        Screen s = new Screen(100, 100, 200, 50);
//        frame.add(s);
//        app.frame.add(app.giveRect());


    }

    private void start() {
//        Task0 task0 = new Task0();
//        JFrame f = this.frame;
        SwingWorker<Void, Void> task = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                
                    while(appIsRunning){
                        frame.add(giveRect());
                        Thread.sleep(100);
                        updateCoordinatesBy(1);
//                    frame.invalidate();
                        frame.validate();
                        System.out.println("Drawn"+x+" "+y+appIsRunning);

                    }
                return null;
            }

            @Override
            protected void done() {
               appIsRunning=false;
            }

            @Override
            protected void process(List<Void> chunks) {
//                super.process(chunks);
                for (int i = 0; i < 30; i++) {
//                    frame.repaint();
//                    frame.add(giveRect());
//                    frame.repaint();
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    updateCoordinatesBy(100);
//                    frame.invalidate();
//                    frame.validate();
////                    frame.repaint();
//                    frame.repaint();
////                    frame.pack();
//                    System.out.println("Drawn"+x+" "+y);
                }
            }



        };
        task.execute();
//        task.cancel();
//        this.frame.add()

    }

    private class Task0 extends SwingWorker<Void,Void>{

        @Override
        protected Void doInBackground() throws Exception {
            return null;
        }

        @Override
        protected void process(List<Void> chunks) {
            super.process(chunks);
        }

        @Override
        protected void done() {
            super.done();
        }
    }

}





