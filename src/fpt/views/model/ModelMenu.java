package fpt.views.model;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ModelMenu {
    private String icon;
    private String name;
    private MenuType menuType;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getMenuType() {
        return menuType;
    }

    public void setMenuType(MenuType menuType) {
        this.menuType = menuType;
    }

    public ModelMenu(String icon, String name, MenuType menuType) {
        this.icon = icon;
        this.name = name;
        this.menuType = menuType;
    }

    public ModelMenu() {
    }
    
    public Icon toIcon() {
        return new ImageIcon(getClass().getResource("/fpt/icon/" + icon + ".png"));
    }
    
    public static enum MenuType {
        TITLE, MENU, EMTY
    }
}
