import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String Sid;
    private String name;
    //创建一个connection里面存放课程的名字
//    public List<Integer> listS=new ArrayList<Integer>();
    public Map<String,Integer> SC = new HashMap<String, Integer>();

    public Student(String sid, String name, Map<String, Integer> SC) {
        Sid = sid;
        this.name = name;
        this.SC = SC;
    }

    //    public Map<String,String> sc= new HashMap<String, String>();


    public Student() {
    }

    public String getSid() {
        return Sid;
    }

    public void setSid(String sid) {
        Sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Sid='" + Sid + '\'' +
                ", name='" + name + '\'' +
                ", SC=" + SC +
                '}';
    }
}
