package structural.facade;

class MyGUI {

    private GUIContent guiContent;
    private GUIMenu guiMenu;
    private GUITitleBar guiTitleBar;

    MyGUI() {
        guiContent = new GUIContent();
        guiMenu = new GUIMenu();
        guiTitleBar = new GUITitleBar();
    }

    void drawGUI() {
        guiContent.showButtons();
        guiContent.showTextFields();
        guiContent.showDefaultValues();
        guiMenu.drawMenuButtons();
        guiTitleBar.showTitleBar("Title caption");
    }
}