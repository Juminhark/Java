package programers.ch02.stack.case01;

import java.util.Arrays;

public class solution {
    public static void main(String[] args){

        int[] methone = new int[9];
        int s = 1;
        for(int j = 0; j < 9; j++){
            methone[j] = s;
            s++;
            if(s == 6){
                s = 1;
            }
        }
        System.out.println(Arrays.toString(methone));
        }
    }

