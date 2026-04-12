// Input="aaassdddfwerrr"
// Output="a3s2d3fwer3"

package String;

public class stringCompression {
    public static String compress(String str){
        String newstr="";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while (i<str.length()-1 && str.charAt(i)== str.charAt(i+1)) {
                count++;
                i++;
                
            }

            newstr+=str.charAt(i);
            if(count>1){
                newstr+=count;
            }
        }
        return newstr;
    }


    public static void main(String[] args) {
        String str="aaassdddfwerrr";
        System.out.println(compress(str));
    }
}
