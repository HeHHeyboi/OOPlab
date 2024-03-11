public class Employee implements Comparable<Employee>{
    int id;
    String name;
    public Employee(int id,String name){
        this.name = name;
        this.id = id;
    }
    @Override
    public int compareTo(Employee o) {
        if(this.name.compareTo(o.name)!= 0){
            return this.name.compareTo(o.name);
        }
        else{
            if(this.id<o.id){
                return -1;
            }
            else if(this.id>o.id){
                return 1;
            }
            else {
                return 0;
            }
        }
    }

}
