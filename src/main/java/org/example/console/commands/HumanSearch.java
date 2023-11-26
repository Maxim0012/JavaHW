package org.example.console.commands;


import org.example.console.Console;

public class HumanSearch extends Command {
    public HumanSearch(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Поиск человека по имени. ";
    }

    @Override
    public void execute() {
        getConsole().humanSearch();
    }
}