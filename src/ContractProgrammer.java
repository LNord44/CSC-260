
public class ContractProgrammer extends Programmer{
    public ContractProgrammer(String name, String ssn) {
        super(name, ssn);
        setJobDescription("Contract Programmer");
        setBaseSalary(70000);
    }
    public double getSalary(){
        double baseSalary = getBaseSalary();
        return baseSalary;
    }
}
