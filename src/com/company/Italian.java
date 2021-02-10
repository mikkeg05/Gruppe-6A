package com.company;

import com.company.Dialog;

public class Italian implements Dialog {

    private String s = "Italian";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "premere q per uscire ";
    }

    @Override
    public String selectedLanguage() {
        return "la lingua selezionata è ";
    }
}
