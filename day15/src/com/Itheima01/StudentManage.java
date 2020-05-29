package com.Itheima01;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentManage {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (; ;) {
            System.out.println("欢迎来到学生管理系统 ===========");
            System.out.println("-------------------------------------------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有的学生");
            System.out.println("5 退出");
            System.out.println("-------------------------");
            int num = sc.nextInt();
            if(num==1){
                studentAdd(list);
            } else if(num ==2){
                studentRemove(list);
            }else if(num ==3){
                studentSet(list);
            }else if(num ==4){
                studentLook(list);
            }else if(num ==5){
                System.out.println("感谢使用，欢迎下次光临");
                break;
            }else{
                System.out.println("输出数字有误");
            }
        }
    }
    public static void studentAdd(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        int id;
        while (true) {
            System.out.println("请输入你要添加的ID");
            id = sc.nextInt();
            boolean bu = addBug(list, id);
            if(bu==false){
                break;
            }
        }
        System.out.println("请输入学生的姓名");
        String name = sc.next();
        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        System.out.println("请输入学生的住址");
        String diZhi = sc.next();
        boolean bu = list.add(new Student(id,name,age,diZhi));
        if (bu==true) {
            System.out.println("添加学生成功");
        }else{
            System.out.println("添加学生失败");
        }
    }
    public static void studentRemove(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除学生的需学号");
        int id1 = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            int id = list.get(i).getId();
            if(id==id1){
                list.remove(i);
                System.out.println("删除成功");
            }
        }
    }
    public static void studentSet(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要修改的学生的学号");
        int updateid = sc.nextInt();
        boolean bu = setBug(list, updateid);
        if(bu==true) {
            for (int i = 0; i < list.size(); i++) {
                int id = list.get(i).getId();
                String name1 = list.get(i).getName();
                if (id == updateid) {
                    System.out.println("请输入您要修改的学生的姓名");
                    String name = sc.next();
                    list.get(i).setName(name);
                    System.out.println("请输入您要修改的学生的年龄");
                    int age = sc.nextInt();
                    list.get(i).setAge(age);
                    System.out.println("请输入您要修改的学生的地址");
                    String diZhi = sc.next();
                    list.get(i).setDiZhi(diZhi);
                    System.out.println("修改成功");
                    break;
                }
            }
        }else{
            System.out.println("你输入的修改学生ID不存在");
        }
    }
    public static void studentLook(ArrayList<Student> list){
        if(list.size()==0){
            System.out.println("先添加后查看");
            return;
        }
        System.out.println("学号\t\t姓名\t\t年龄\t\t地址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            int id = stu.getId();
            String name = stu.getName();
            int age = stu.getAge();
            String diZhi = stu.getDiZhi();
            System.out.println(id+"\t\t"+name+"\t\t"+age+"\t\t"+diZhi);
        }
    }
    public static boolean addBug(ArrayList<Student> list ,int id){
        for (int i = 0; i < list.size(); i++) {
            int oldId = list.get(i).getId();
            if(id==oldId){
                System.out.println("你输入的ID以被占用，请重新输入");
                return true;
            }
        }
        return false;
    }
    public static boolean setBug(ArrayList<Student> list ,int id){
        for (int i = 0; i < list.size(); i++) {
            int oldId = list.get(i).getId();
            if(id==oldId){
                return true;
            }
        }
        return false;
    }
}
