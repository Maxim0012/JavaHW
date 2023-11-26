package org.example;
import org.example.console.Console;
import org.example.console.View;
import org.example.model.FamilyTree;
import org.example.model.FileHandler;
import org.example.model.Human;
import org.example.model.comporator.HumanComporatorByAge;
import org.example.presenter.Presenter;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FamilyTree<Human> familyTree = new FamilyTree<>();

        // добавляем немного данных
        familyTree.addFamilyTree(new Human("Владимир", "муж", 27));
        familyTree.addFamilyTree(new Human("Виталя", "муж", 33));
        familyTree.getByName("владимир");

        // MVP
        View view = new Console();
        FileHandler serialize = new FileHandler();
        HumanComporatorByAge sortAge =  new HumanComporatorByAge();
        new Presenter(view, familyTree, serialize, sortAge);
        view.start();

    }
}