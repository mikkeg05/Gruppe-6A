package com.company;

public class Swedish implements Dialog {

    private String s =  "Svenska";


    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "Tryck på q för att stoppa";
    }

    @Override
    public String selectedLanguage() {
        return "Det valda språket är";
    }
}
