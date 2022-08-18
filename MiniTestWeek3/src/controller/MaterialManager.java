package controller;
import material.Idiscount;
import material.Material;

import java.util.ArrayList;
import java.util.List;


public class MaterialManager implements Idiscount {
    @Override
    public double getRealMoney() {
        return 0;
    }
    public static List<Material> materialList = new ArrayList<>();

    public void addNewMaterial(Material material) {
        materialList.add(material);
    }
//   tinh tien sau giam gia
//    public double getRealMoney () {
//        double total = 0;
//        for (int i = 0; i < materialList.size(); i++) {
//            if (materialList.get(i) instanceof Idiscount)
//            {
//                Idiscount idiscount = (Idiscount) materialList.get(i);
//                total += Idiscount.getRealMoney();
//            }
//        }
//        return total;
//    }
    public double getTotalMoney() {
        double total = 0;
        for (int i = 0; i < materialList.size(); i++) {
            total += materialList.get(i).getAmount();
        }
        return total;
    }

//    Tinh chenh lech
    public double getDifference() {
        double difference = getTotalMoney() - getRealMoney();
        return difference;
    }


}
