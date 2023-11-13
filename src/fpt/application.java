package fpt;

import fpt.utils.UserSession;
import fpt.views.ViewMain;

public class application {

    public static void main(String[] args) {
        UserSession.getInstance().setUsername("username");
        UserSession.getInstance().setName("name");
        UserSession.getInstance().setId(1);

        ViewMain viewMain = new ViewMain();
        viewMain.setVisible(true);
    }

}
