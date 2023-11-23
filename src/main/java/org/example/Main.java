package org.example;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FamilyTree<Human> familyTree = new FamilyTree<>();

        // добавляем немного данных
        familyTree.addFamilyTree(new Human("Алекс", "муж", 27));
        familyTree.addFamilyTree(new Human("Владимир Владимирович Путин", "муж", 70));
        familyTree.getByName("алекс");

        // MVP
        View view = new Console();
        FileHandler serialize = new FileHandler();
        HumanComporatorByAge sortAge =  new HumanComporatorByAge();
        new Presenter(view, familyTree, serialize, sortAge);
        view.start();

    }
}