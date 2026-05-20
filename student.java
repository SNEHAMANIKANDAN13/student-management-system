import java.util.*;
class Student{
    int id;
    String name;
    int mark;
    
    Student(int id,String name,int mark){
        this.id=id;
        this.name=name;
        this.mark=mark;
    }
    void display(){
       System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Mark : " + mark);
        System.out.println("----------------");
    }     
}
public class Main{

	public static void main(String[] args) {
	ArrayList<Student>students=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
    while(true){
        System.out.println("\n======Student Management System======");
        System.out.println("1.Add Student");
        System.out.println("2.view Student");
        System.out.println("3.Search Student");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");
        System.out.println("6. Exit");
        System.out.print("Enter choice: ");
        int choice=sc.nextInt();
        
    //...................ADD STUDENT..................//    
    if(choice==1){
        System.out.println("enter Id: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("enter name: ");
        String name=sc.nextLine();
        System.out.println("enter mark: ");
        int mark=sc.nextInt();
        students.add(new Student(id,name,mark));
        System.out.println("Student added successfully!");
    }
    //..................VIEW STUDENT...................//
    else if(choice==2){
        if(students.isEmpty()){
            System.out.println("student not found!");
        }
        else{
            for(Student s:students){
                s.display();
            }
        }
    }
    //.....................SEARCH....................//
    else if(choice==3){
        System.out.println("enter search id");
        int searchid=sc.nextInt();
        boolean found=false;
        for(Student s:students){
            if(s.id==searchid){
                s.display();
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("student not found");
        }
        
    }
    //.......................UPDATE....................//
    else if(choice==4){
        System.out.println("enter updateid: ");
        int updateid=sc.nextInt();
        boolean found = false;
        sc.nextLine();
        for(Student s:students){
        if(s.id==updateid){
            System.out.println("enter new name ");
            String newname=sc.nextLine();
            s.name=newname;
            System.out.println("Enter new mark for update:");
            int newmark=sc.nextInt();
            s.mark=newmark;
            System.out.println("student updated successfully!");
            found=true;
            break;
        }   
        }
        if(!found){
            System.out.println("id not found!");
        }
    }
    
            // ---------------- DELETE ----------------//
            else if (choice == 5) {

                System.out.print("Enter ID to delete: ");
                int deleteId = sc.nextInt();

                boolean removed = false;

                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).id == deleteId) {
                        students.remove(i);
                        System.out.println("✔ Student Deleted!");
                        removed = true;
                        break;
                    }
                }

                if (!removed) {
                    System.out.println("Student not found!");
                }
            }
// ---------------- EXIT ----------------//
            else if (choice == 6) {
                System.out.println("Exiting System... Bye 👋");
                break;
            }

            // ---------------- INVALID ----------------//
            else {
                System.out.println("Invalid choice! Try again.");
            }
        }

        sc.close();
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
