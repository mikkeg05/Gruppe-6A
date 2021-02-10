package com.company;

public class Russkiy implements Dialog{

    private String s = "Russkiy";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "nazhmite q, chtoby ostanovit'";
    }

    @Override
    public String selectedLanguage() {
        return "vybrannyy yazyk ";
    }
}
