public class TotalSundays {


    public static void main(String[] args) {
        String []days = {"mon", "tue", "wen" , "thu" , "fri" , "sat" , "sun"};
        String day= "thu" ;
        int num = 20;
        int j = 6;
        int res = 0;
        for (int i = 0; i < num; i++) {
        j++;
        if(j == days.length){
            j = 0;

        }
        if(days[j] == day){
            res++;
        }
    }
        System.out.println(res);
    }

}
