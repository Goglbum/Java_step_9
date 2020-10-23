package ru.netologi.domain;

public class GroupMenu {
    private int id;
    private ModuleMenu moduleMenu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ModuleMenu getModuleMenu() {
        return moduleMenu;
    }

    public void setModuleMenu(ModuleMenu moduleMenu) {
        this.moduleMenu = moduleMenu;
    }
}
