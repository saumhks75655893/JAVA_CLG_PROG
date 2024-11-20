package JAVA_CLG_PROG.ownJava.Swing_AWT;

import java.awt.*;

public class FisrstWindowFrameUsingAWT extends Frame {
    FisrstWindowFrameUsingAWT(String S) {
        super(S);
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FisrstWindowFrameUsingAWT("FF");
        new FisrstWindowFrameUsingAWT("sF");
    }
}
