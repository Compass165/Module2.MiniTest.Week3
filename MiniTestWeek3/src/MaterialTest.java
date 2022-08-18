
import material.CrispyFlour;
import material.Material;
import material.Meat;
import java.time.LocalDate;
import java.util.Scanner;

public class MaterialTest {

    public static void main(String[] args) {

        Material botmi = (Material) new CrispyFlour("001", "Bot Mi", LocalDate.of(2022, 4, 30), 15000, 5);
        Material botgao = new CrispyFlour("002", "Bot Gao", LocalDate.of(2022, 4, 30), 18000, 7);
        Material botngo = new CrispyFlour("003", "Bot Ngo", LocalDate.of(2022, 4, 30), 20000, 10);
        Material botda = new CrispyFlour("004", "Bot Da", LocalDate.of(2022, 5, 1), 1000000, 1);
        Material ke = new CrispyFlour("005", "Ke", LocalDate.of(2022, 5, 1), 20000, 1);

        Material thitchonha = new Meat("006", "Thit Cho Nha", LocalDate.of(2022, 8, 17), 350000, 59);
        Material thitbecde = new Meat("007", "Thit Bec-de", LocalDate.of(2022, 8, 17), 400000, 62);
        Material thitchode = new Meat("008", "Thit Cho De", LocalDate.of(2022, 8, 17), 200000, 55);
        Material thitlon = new Meat("009", "Thit Lon", LocalDate.of(2022, 8, 17), 150000, 72);
        Material thitgachay = new Meat("010", "Thit Ga Chay", LocalDate.of(2022, 8, 17), 100000, 63);

        Material[] materials = {botmi, botgao, botngo, botda, ke, thitchonha, thitbecde, thitchode, thitlon, thitgachay};
//        Hien thi danh sach cac san pham
        for (int i = 0; i < materials.length; i++) {
            System.out.println(materials[i] + " ");
        }
        Material flour6 = new CrispyFlour("04", "Bột chiên xù", LocalDate.of(2020, 10, 22), 31000, 19);
        showList(addList(materials, 5, flour6));
        showList(removeList(materials, 5));

    }
    private static Material[] removeList(Material[] arrayBefore, int index) {
        Material[] arrayAfter = new Material[arrayBefore.length - 1];
        for (int i = 0; i < arrayBefore.length-1; i++) {
            if (i < index) {
                arrayAfter[i] = arrayBefore[i];
            } else {
                arrayAfter[i] = arrayBefore[i+1];
            }
        }
        return arrayAfter;
    }

    private static void showList(Material[] listMaterial) {
        for (int i = 0; i < listMaterial.length; i++) {
            System.out.println(listMaterial[i]);
        }
    }

    public static Material[] addList(Material[] arrayBefore, int index, Material value) {
        Material[] arrayAfter = new Material[arrayBefore.length + 1];
        for (int i = 0; i <= arrayBefore.length; i++) {
            if (i < index) {
                arrayAfter[i] = arrayBefore[i];
            } else if (i == index) {
                arrayAfter[i] = value;
            } else {
                arrayAfter[i] = arrayBefore[i-1];
            }
        }
        return arrayAfter;
    }

}
