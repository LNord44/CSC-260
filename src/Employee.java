public class Employee {

    /////////////////////// data fields ///////////////////////
    private String jobDescription = "Employee";
    private String name;
    private String ssn;
    private double baseSalary;

    /////////////////////// constructors ///////////////////////
    public Employee(String name, String ssn){
        this(name, ssn, 35000);
    }
    public Employee(String name, String ssn, double baseSalary){
        this.setName(name);
        this.setSsn(ssn);
        this.setBaseSalary(baseSalary);
    }

    /////////////////////// methods ///////////////////////
    /*getter and setter for jobDescription*/
    public String getJobDescription(){
        return jobDescription;
    }
    public void setJobDescription(String jobDescription){
        this.jobDescription = jobDescription;
    }
    /*getter and setter for name*/
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    /*getter and setter for ssn*/
    public String getSsn(){
        return ssn;
    }
    public void setSsn(String ssn){
        this.ssn = ssn;
    }
    /*getter and setter for baseSalary*/
    protected double getBaseSalary(){
        return baseSalary;
    }
    protected void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    public double getSalary(){
        return baseSalary;
    }

    /*Overridden toString method from the Object Class*/
    @Override
    public String toString(){
        return getJobDescription()+" "+getName()+" with SSN " + getSsn() + " has Salary $"+ (getSalary()*100/100);
    }
    @Override
    public boolean equals(Object obj){
        return (obj instanceof Employee) && (this.getSsn().equals(((Employee)obj).getSsn()));
    }
}
