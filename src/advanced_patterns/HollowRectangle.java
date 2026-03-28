package advanced_patterns;

public class HollowRectangle {
    public static void Hollow_rectangle(int totRow, int totCOl){
        //Outer loop
        for(int i=1;i<=totRow; i++){
            //inner loop
            for(int j=1; j<=totCOl;j++){
                //Boundary condition
                if(i==1||i==totRow||j==1||j==totCOl){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
               
            } System.out.println();
        }
    }

    public static void main(String[] args) {
        Hollow_rectangle(4,5);
    }
}
