package LV01;

public class FoodFight {
    public static void main(String[] args) {
        int[] food = {1,3,4,6};

        solution(food);
    }

    public static String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < food.length; i++) {
            if(food[i] / 2 == 0) continue;
            int temp = food[i] / 2;
            for(int j = 0; j < temp; j++) {
                sb.append(i);
            }
        }

        sb.append(0);

        StringBuffer sf = new StringBuffer(sb);

        String rString = String.valueOf(sf.reverse().delete(0,1));

        sb.append(rString);

        return sb.toString();
    }
}
