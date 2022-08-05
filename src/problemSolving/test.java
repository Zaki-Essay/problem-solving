package problemSolving;


class test
{


    public static void main(String[] args){
        String s = "AO|";
        String a = "\\|";
        String[] list = s.split(a);

        System.out.println(list.length);

        for (String s1 : list) {
            System.out.println(s1);
        }
    }
}