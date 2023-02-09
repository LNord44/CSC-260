import java.util.ArrayList;

public class Programmer extends Employee{
    // data field
    private ArrayList<String> technologies;

    // constructor
    public Programmer(String name, String ssn){
        super(name, ssn, 65000.00);
        setJobDescription("Programmer");
        technologies = new ArrayList<String>(0);
    }

    // methods
    public void addTechnology(String tech){
        if (technologies.contains(tech)) {
            return;
        }
        technologies.add(tech);
    }


    @Override
    public double getSalary(){
        if (technologies.contains("Java")){
            return super.getSalary() + (technologies.size() - 1)  * 5000.00 + 3000.00;
        }
        else {
            return super.getSalary() + technologies.size() * 5000.00;
        }
    }

    public boolean knowsTechnology() {
        if (technologies.contains("Java")) {
            return true;
        }
        return false;
    }

    public int knowsJava() {
        int count = 0;
        for (int i = 0; i < technologies.size(); i++) {
            if (technologies.contains("Java")) {
                count++;
            }
        }
        return count;
    }

    public int knowsOcaml() {
        int count = 0;
        for (int i = 0; i < technologies.size(); i++) {
            if (technologies.contains("Ocaml")) {
                count++;
            }
        }
        return count;
    }


    // An efficient implementation of the toString method (it also includes commas where appropriate).
    public String toString(){
        StringBuilder returnVal = new StringBuilder(super.toString());
        if(technologies.size() > 0){
            returnVal.append(" and knows ");
            if (technologies.size()==1){
                returnVal.append(technologies.get(0));
            }
            else if (technologies.size()==2){
                returnVal.append(technologies.get(0));
                returnVal.append(" and ");
                returnVal.append(technologies.get(1));
            }
            else {
                for(int i=0; i < technologies.size()-1; i++)
                    returnVal.append(technologies.get(i)+", ");
                returnVal.append("and ");
                returnVal.append(technologies.get(technologies.size()-1));
            }
        }
        return returnVal.toString();
    }
}
