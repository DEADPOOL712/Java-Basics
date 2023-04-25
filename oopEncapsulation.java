// encapsulation is hiding data from user 
// we access data use using setter and getter to change the data 
// declare variable private 
// here the we can say Employe class is encapsulated
class Employe {
    private int empId;
    private String name;

    // to modifiy empId
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int id) {
        this.empId = id;
    }
}

public class oopEncapsulation {

    public static void main(String args[]) {
        Employe e1 = new Employe();
        e1.setEmpId(1302);
        e1.getEmpId();
        System.out.println(e1.getEmpId());
    }

}
