package com.mobile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {
    private String title;
    private List<Menu> fields = new ArrayList<Menu>();
    private boolean first = false;

    public Menu(String title, Menu... fields) {
        this.title = title;
        this.fields = new ArrayList<Menu>(Arrays.asList(fields));
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

    @Override
    public String toString() {
        final StringBuilder menuDescription = new StringBuilder();
        menuDescription.append("-------------------\n");
        menuDescription.append(this.title + "\n");
        menuDescription.append("-------------------\n");

        if (!isFirst())
            menuDescription.append("0. Назад\n");
        else
            menuDescription.append("0. Выход\n");

        int i = 1;
        for(Menu menu : fields){
            menuDescription.append(i++ + ". " + menu.getTitle() + "\n");
        }

        if (fields.size() != 0)
            menuDescription.append("-------------------\n");

        return menuDescription.toString();
    }
}
