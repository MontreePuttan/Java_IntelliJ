public class DemoArray {

    public static void demo1(){
        int[] scores = new int[6]; // 0-4
        scores[0] = 10;
        scores[1] = 10;
        scores[2] = 10;
        scores[3] = 10;
        scores[4] = 10;
        scores[5] = 10;
        int sum2 = 0;
        for (int i = 0; i < scores.length; i++) {
            sum2 = sum2 + scores[i];
        }
        System.out.println(sum2);
    }

    public static void demo2(){
        int[] scores = {10,10,10,10,10,10};
        int sum2 = 0;
        for (int score : scores) {
            sum2 = sum2 + score;
        }
        System.out.println(sum2);

    }


    public static void main(String[] args) {
        demo2();
    }

}
