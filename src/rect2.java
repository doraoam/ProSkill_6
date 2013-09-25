import java.util.Scanner;

/*
TASK: rect2
LANG: JAVA
*/
public class rect2 {

    int n;
    int[] input;
    int[] x1,x2,y1,y2;

    int xMin,xMax,yMin,yMax;

    int area;

    rect2(){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        input = new int[n*4];
        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextInt();
        }

        x1 = new int[n];
        x2 = new int[n];
        y1 = new int[n];
        y2 = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                if(j==0){
                    int temp = 0;
                    for (int k = 0; k < n; k++) {
                        x1[k] = input[temp];
                        temp+=4;
                    }
                }
                if(j==1){
                    int temp = 1;
                    for (int k = 0; k < n; k++) {
                        x2[k] = input[temp];
                        temp+=4;
                    }
                }
                if(j==2){
                    int temp = 2;
                    for (int k = 0; k < n; k++) {
                        y1[k] = input[temp];
                        temp+=4;
                    }
                }
                if(j==3){
                    int temp = 3;
                    for (int k = 0; k < n; k++) {
                        y2[k] = input[temp];
                        temp+=4;
                    }
                }
            }
        }

        xMin = -1000000;
        xMax = 1000000;
        yMin = -1000000;
        yMax = 1000000;

        for (int i = 0; i < n; i++) {
            if(x1[i] > xMin)
                xMin = x1[i];
            if(x2[i] < xMax)
                xMax = x2[i];
            if(y1[i] > yMin)
                yMin = y1[i];
            if(y2[i] < yMax)
                yMax = y2[i];
            //System.out.println(xMin + " " + xMax + " " + yMin + " " + yMax);
        }

        area = (xMax-xMin)*(yMax-yMin);
        System.out.println(area);
    }

    public static void main(String[] args) {
        new rect2();
    }
}
