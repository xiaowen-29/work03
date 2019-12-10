package Demo01;

public class Demo {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.setId(101);
        stu1.setName("小黑");
        stu1.setAge("10岁");
        stu1.setSex('男');
        stu1.setPosition("学生");
        stu1.setDepartment("学习部");

        Student chairman =new Student();
        chairman.setId(201);
        chairman.setName("无限");
        chairman.setAge("18岁");
        chairman.setSex('男');
        chairman.setPosition("主席");
        stu1.setDepartment("学习部");

        Write writeReport = new Write();
        writeReport.setId(1);
        writeReport.setWriteManId(101);
        writeReport.setReadManId(201);
        writeReport.setContent("本周的工作汇报");
        writeReport.setFilePath("E://"+".txt");


    }


}
