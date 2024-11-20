package JAVA_CLG_PROG.ownJava.Swing_AWT;

import java.awt.*;

public class ReferenceVariableAWT {
    Frame f;

    ReferenceVariableAWT(String S) {
        Frame f = new Frame(S);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new JAVA_CLG_PROG.ownJava.Swing_AWT.FisrstWindowFrameUsingAWT("FF");
        new JAVA_CLG_PROG.ownJava.Swing_AWT.FisrstWindowFrameUsingAWT("sF");
    }
}
