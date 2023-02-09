public class ClericalWorker extends Employee{
    public ClericalWorker(String name, String ssn){
        super(name, ssn, 45000.00);
        setJobDescription("Clerical worker");
    }
}