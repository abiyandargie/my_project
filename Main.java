public class Main {
    public static void main(String[] args) {
        int num1 = 8;
        double num2 = 2;
        char num = '+';
        switch (num) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println(num1 / num2);
                }
                break;
            default:
                System.out.println("something eror");
        }
        String[] stud_list = {"ABEBE", "AYELE", "ALMAZ", "SELOMON", "ylkal", "challa", "zebiba"};
        int[] stud_age = {22, 34, 19, 18, 24, 23, 28};
        System.out.println("list of students and their corresponding age!! ");
        for (int i = 0; i < 7; i++) {
            System.out.println(stud_list[i]);
            System.out.print(" age :- ");
            System.out.println(stud_age[i]);
        }
    }
    }
 class student {
    int id;
    String name;
    char sex;
    double weight;
void register(int i,String n,char m,double z){
        id=i;
        name=n;
        sex=m;
        weight=z;
}
void display(){
    System.out.println(id+ " " +name+ " " +sex+ " " +weight);
}

    public static void main(String[] args) {
        student s1=new student();//creating an object
        student s2=new student();
        student s3=new student();
        student s4=new student();
        s1.register(001,"nardos",'m',56.6);
        s2.register(002,"elsabet",'f',67.9);
        s3.register(003,"alemayehu",'m',70);
        s4.register(004,"selamawit",'f',54);
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}

