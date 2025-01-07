package HeadFirstJava.ch1;

public class BottleSong {

    public static void main(String[] args) {
        int bottleNum =10;
        String word = "bottles";

        while(bottleNum>0){
            if(bottleNum==1){
                word ="bottle";
            }
            System.out.println(bottleNum+" green "+word+",hanging on the wall");
            System.out.println(bottleNum+" green "+word+",hanging on the wall");
            System.out.println("and if one bottle should accidently fall,");
            bottleNum = bottleNum-1;

            if(bottleNum>0){
                System.out.println("there'll be "+bottleNum+" green "+word+", hanging on the wall");
            }else{
                System.out.println("there'll be no green bottles,hanging on the wall");
            }
        }

    }
}
