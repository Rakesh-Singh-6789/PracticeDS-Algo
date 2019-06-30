package assignment5_classes_and_objects;

class StudentUse{
    String name;
    int rollNo;
    StudentUse(int num){
    rollNo = num;
    }   
    public StudentUse() {
		// TODO Auto-generated constructor stub
	}
	public void print(){
    System.out.print(name +" " + rollNo+" ");
    }
}

public class Student{
    public static void main(String[] args) {
        StudentUse s = new StudentUse();
        s.rollNo = 15;
        s.print();
    }
}