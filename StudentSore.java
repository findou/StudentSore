import java.util.*;

public class StudentSore {
/*    要求：
设计集合结构将以上信息存储到集合中，并打印集合元素信息。
打印要求：将同一个学生的学科和成绩汇总打印(冒号分隔，含多个学科和分数逗号分割)
20190001  孙悟空  数据结构:80,高数:85,java:100
20190002  猪八戒   高数:60
统计该班每个学科的平均分。
 学号   姓名   课程    成绩  */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("录入学生信息：");
        //创建一个hashset存储每个学生对象的信息
        Set<Student> s= new HashSet<Student>();
        //创建一个hashset存储录入的课程名；
        Set<String> cnames= new HashSet<String>();
        boolean jxl=true;//判断是否录入下一个学生的学生信息
        do {
            Student student=new Student();
            System.out.println("请输入学生学号：");
            String sid=scanner.nextLine();
            student.setSid(sid);
            System.out.println("请输入学生姓名：");
            String sname=scanner.nextLine();
            student.setName(sname);
            //输入学生课程名与分数
            boolean xzp=true;//判断当前学习的课程及成绩信息是否录入完毕
            do{
                System.out.println("请输入学生选择的课程名：");
                String coursename = scanner.nextLine();
                cnames.add(coursename);//将用户输入的课程名存入set中，set中不允许重复
                System.out.println("请输入学生选择课程的分数：");
                int score=scanner.nextInt();
                student.SC.put(coursename,score);//将学生分数及课程名存入学生对象中
                System.out.println("继续录入该学生的课程及分数吗？1：继续 2：完成录入该学生信息！！");
                int xz=scanner.nextInt();
                if(xz==2){
                    xzp=false;
                }
                scanner.nextLine();
            }while (xzp);
            s.add(student);
            System.out.println("录入该学生信息成功");
            System.out.println("继续录入下一个学生信息吗？ 1：录入下一个学生信息  2：退出录入展示结果  ");
            int jx=scanner.nextInt();
            if(jx==2){
                jxl=false;
            }
            scanner.nextLine();
        } while (jxl);

        /*Map<String,Integer> sc1=new HashMap<String, Integer>();
        sc1.put("高数",85);
        sc1.put("java",100);
        sc1.put("数据结构",80);
        Map<String,Integer> sc2=new HashMap<String, Integer>();
        sc2.put("高数",60);
        Map<String,Integer> sc3=new HashMap<String, Integer>();
        sc3.put("高数",90);
        sc3.put("java",94);
        sc1.put("数据结构",80);
        Map<String,Integer> sc4=new HashMap<String, Integer>();
        sc4.put("高数",78);
        sc4.put("java",70);


        //创建一个学生类对象
        Student s1 = new Student("20190001","孙悟空",sc1);
        Student s2 = new Student("20190002","猪八戒",sc2);
        Student s3 = new Student("20190003","唐僧",sc3);
        Student s4 = new Student("20190004","沙和尚",sc4);
*/
/*//创建一个hashset存储每个学生对象的信息
        Set<Student> s= new HashSet<Student>();
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);*/
        //输出学生信息
        for(Student ss:s){//ss代表s set中的一个学生对象
//            System.out.println(s);
            Map<String, Integer> sc = ss.SC;//这个map里面存放的是s这个学生对象对应的课程名，及对应的分数，sc是一个map集合
            String st="";
            Set<Map.Entry<String, Integer>> entries = sc.entrySet();
            for(Map.Entry<String, Integer> sck:entries){
                st=st+sck.getKey()+":"+sck.getValue()+",";//取出课程名，及对应的分数
            }
            System.out.println(ss.getSid()+" "+ss.getName()+" "+st);
        }
       /* //输出各科平均分
        int math=0,mp=0;
        int java=0,jp=0;
        int sjjg=0,sp=0;
        for(Student ss:s){
            Map<String, Integer> sc = ss.SC;
            Set<String> kstrings = sc.keySet();
            for(String key:kstrings){
                *//*if("高数".equals(key)){
                    math=math+sc.get(key);
                    mp=mp+1;
                }else if("java".equals(key)){
                    java=java+sc.get(key);
                    jp=jp+1;
                }else if ("数据结构".equals(key)){
                    sjjg=sjjg+sc.get(key);
                    sp=sp+1;
                }*//*
                //遍历课程名集合，找到课程名

            }
        }
        System.out.println("各科平均分：");
        System.out.println("数学平均分："+math/mp+" java平均分："+java/jp+" 数据结构平均分："+sjjg/sp);*/


        for(String cn:cnames) {
            float scn = 0, cnc = 0;//sumcn,cncount
            for (Student ss : s) {//循环遍历每个学生对象找到对应的课程名cn
                Map<String, Integer> sc = ss.SC;//sc 是map集合，课程名及课程分数
                Set<String> kstrings = sc.keySet();//map里所有的key集合
                for (String key : kstrings) {//遍历学生对象所有的的课程名
                    //小组项目经理每天的作业   不需要发文件，只需要统计作业的完成情况
                    if (cn.equals(key)) {
                        scn = scn + sc.get(key);//如果这个学生对象的课程名与课程集合中的课程名相同就 把这个课程的分数相加
                        cnc = cnc + 1;
                    }
                }
            }
            System.out.println(cn + "课程平均分是：" + scn / cnc);
        }




        //创建一个hashmap 存储学生对应的的课程名
//        HashMap<String, Student> sc = new HashMap<String, Student>();
        //创建一个connection里面存放课程的名字


    }
}
