import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner src =new Scanner(System.in);
        Student [] studs =new Student[5];
        for (int i=0;i<5;i++){
            System.out.println("輸入姓名、性別、系別、英文、國文、數學");
            studs[i]=new Student(src.next(),src.next(),src.next(),src.nextFloat(),src.nextFloat(),src.nextFloat());
        }
        System.out.println("請問需要幫忙些甚麼嗎?");
        boolean x=true;
        while (x){
            System.out.println("按1選擇同學查詢"+"\n"+"按2選擇查詢所有同學資料"+"\n"+"按3查詢某科目平均"+"\n"+"按4查詢某位同學的總分與平均"+"\n"+"按5結束");
            int y=src.nextInt();
            if (y==1){
                System.out.println("請輸入第幾位同學");
                int z=src.nextInt();
                if (z==1){ System.out.println("英文:"+studs[0].getEnglish()+"\n"+"國文:"+studs[0].getChinese()+"\n"+"數學:"+studs[0].getMath());}
                if (z==2){System.out.println("英文:"+studs[1].getEnglish()+"\n"+"國文:"+studs[1].getChinese()+"\n"+"數學:"+studs[1].getMath());}
                if (z==3){System.out.println("英文:"+studs[2].getEnglish()+"\n"+"國文:"+studs[2].getChinese()+"\n"+"數學:"+studs[2].getMath());}
                if (z==4){System.out.println("英文:"+studs[3].getEnglish()+"\n"+"國文:"+studs[3].getChinese()+"\n"+"數學:"+studs[3].getMath());}
                if (z==5){System.out.println("英文:"+studs[4].getEnglish()+"\n"+"國文:"+studs[4].getChinese()+"\n"+"數學:"+studs[4].getMath());}
                }
            if (y==2){
                for (int i=0;i<5;i++){
                studs[i].showAll();}
            }
            if (y==3){
                System.out.println("請輸入1.英文 2.國文 3.數學");
                int z=src.nextInt();
                if (z==1){ System.out.println((studs[0].getEnglish()+studs[1].getEnglish()+studs[2].getEnglish()+studs[3].getEnglish()+studs[4].getEnglish())/5);}
                if (z==2){System.out.println((studs[0].getChinese()+studs[1].getChinese()+studs[2].getChinese()+studs[3].getChinese()+studs[4].getChinese())/5);}
                if (z==3){System.out.println((studs[0].getMath()+studs[1].getMath()+studs[2].getMath()+studs[3].getMath()+studs[4].getMath())/5);}
            }
            if (y==4){System.out.println("請輸入第幾位同學");
                int z=src.nextInt();
                if (z==1){ System.out.println(("平均:"+(studs[0].getEnglish()+studs[0].getChinese()+studs[0].getMath())/3)+"\n"+"總分:"+(studs[0].getEnglish()+studs[0].getChinese()+studs[0].getMath()));}
                if (z==2){ System.out.println(("平均:"+(studs[1].getEnglish()+studs[1].getChinese()+studs[1].getMath())/3)+"\n"+"總分:"+(studs[1].getEnglish()+studs[1].getChinese()+studs[1].getMath()));}
                if (z==3){ System.out.println(("平均:"+(studs[2].getEnglish()+studs[2].getChinese()+studs[2].getMath())/3)+"\n"+"總分:"+(studs[2].getEnglish()+studs[2].getChinese()+studs[2].getMath()));}
                if (z==4){ System.out.println(("平均:"+(studs[3].getEnglish()+studs[3].getChinese()+studs[3].getMath())/3)+"\n"+"總分:"+(studs[3].getEnglish()+studs[3].getChinese()+studs[3].getMath()));}
                if (z==5){ System.out.println(("平均:"+(studs[4].getEnglish()+studs[4].getChinese()+studs[4].getMath())/3)+"\n"+"總分:"+(studs[4].getEnglish()+studs[4].getChinese()+studs[4].getMath()));}
            }
            if (y==5){
                x=false;
            }
        }
    }
}
