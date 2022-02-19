class EncapsulationDemo{
    private int Q_code;
    private String empName;
    private int empAge;

    public int getEmpQ_code(){
        return Q_code;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpQ_code(int newValue){
       Q_code = newValue;
    }
}
public class Question_2{
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setEmpName("Shraddha");
         obj.setEmpAge(21);
         obj.setEmpQ_code(22587);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee Q code: " + obj.getEmpQ_code());
         System.out.println("Employee Age: " + obj.getEmpAge());
    } 
}

/*****************output*************************

Employee Name: Shraddha
Employee Q code: 22587
Employee Age: 21

*************************************************/