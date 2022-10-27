import java.util.ArrayList;

public class Demo_ArrayList {


    public static void main(String[] args) {

        String[] arr = {"06","Ammy","Metel"};

        ArrayList<String[]> cars = new ArrayList<String[]>();
        cars.add(new String[] {"01","Marie","Fowler"});
        cars.add(new String[] {"02","Rebecca","Cox"});
        cars.add(new String[] {"03","Opal","Robinson"});
        cars.add(new String[] {"04","Melony","Swafford"});
        cars.add(new String[] {"05","Audrie","Lamontagne"});
        cars.add(new String[] {"06","AA","BB"});

        // 05 Mena Lamontagne
        // cars.get(4)[1] = "Mena";
        // Level 1 Access ArrayList position 4 [0-4]
        // Level 2 Access Array position 1 [0-3]


        cars.get(4)[1] = "Mena"; // Get ArrayList and Set Array
        cars.set(5,arr);


        	/*
        	System.out.println(cars.get(0)[0]);
        	System.out.println(cars.get(0)[1]);
        	System.out.println(cars.get(0)[2]);
        	System.out.println("=============================");
        	*/

        for(int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i)[0] + " ");
            System.out.print(cars.get(i)[1] + " ");
            System.out.print(cars.get(i)[2] + " ");
            System.out.print("\n");
            //System.out.println(Arrays.toString(cars.get(i)));
        }


    }

}
