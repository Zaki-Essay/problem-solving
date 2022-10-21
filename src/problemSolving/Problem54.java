package problemSolving;



class veuc{


     public void m(){
         System.out.println("A");
     }

}

class car extends veuc{

    public void m(){
        System.out.println("B");
    }

    public void m1(){
        System.out.println("C");
    }

}
public class Problem54 {

    public static void main(String[] args) {
        String s = "Dfsfio oofind ono-info !";
        if (s==null || s.length()==0){
            return;
        }
        int re = 0;
        boolean flag = false;

        for (int i = s.length()-1; i >=0; i--) {
            char c = s.charAt(i);

            if ((c>='a' && c<='z') || (c>='A' && c<='B')){
                flag = true;
                re++;
            }else if(flag){
                break;
            }
        }
        System.out.println(re);


    }
}