package com.mobile;

import java.util.*;


public class Menu {
    private String title;
    private List<Menu> fields = new ArrayList<Menu>();
    private boolean first = false;

    public Menu(String title) {
        this.title = title;
        this.fields = new ArrayList<Menu>();
    }

    public boolean isFirst(){
        return this.first;
    }

    public void setFirst(boolean b){
        this.first = b;
    }

    public String getTitle() {
        return title;
    }

    public Menu getField(int i) {
        return fields.get(i - 1);
    }

    public void addField(Menu menu){
        fields.add(menu);
    }

    public String toString() {
        String menuDescription = "";
        menuDescription += "-------------------\n";
        menuDescription += this.title + "\n";
        menuDescription += "-------------------\n";

        if (!isFirst())
            menuDescription += "0. Назад\n";
        else
            menuDescription += "0. Выход\n";

        for(int i = 0; i < fields.size(); i++){
            menuDescription += (i+1) + ". " + fields.get(i).getTitle() + "\n";
        }

        if (fields.size() != 0)
            menuDescription += "-------------------\n";

        return menuDescription;
    }
}
