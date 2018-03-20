public class Student {

    private  String name, sex , system;
            private float english, chinese, math;

    public Student(String name1,String sex1 ,String system1,float english1,float chinese1,float math1){
        name=name1;
        sex=sex1;
        system=system1;
        english=english1;
        chinese=chinese1;
        math=math1;
    }
    public String getName(){return name;}
    public String getSex(){return sex;}
    public String getSystem(){return system;}
    public float getEnglish(){return english;}
    public float getChinese(){return chinese;}
    public float getMath(){return math;}
    public void showAll(){
        System.out.println("---------------我是分隔線--------------");
        System.out.println("name:"+this.getName());
        System.out.println("sex:"+this.getSex());
        System.out.println("system:"+this.getSystem());
        System.out.println("english:"+this.getEnglish());
        System.out.println("chinese:"+this.getChinese());
        System.out.println("math:"+this.getMath());
        System.out.println("---------------我是分隔線--------------");
    }
}