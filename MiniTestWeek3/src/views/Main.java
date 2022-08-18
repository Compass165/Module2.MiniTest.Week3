package views;

import controller.MaterialManager;
import material.Material;

import java.util.List;

public class Main {
    public static List<Material> materialList = MaterialManager.materialList;


    public static void main(String[] args) {
        MaterialManager p = new MaterialManager();
        System.out.println("Moi ban nhapp vat lieu");
    }
}
