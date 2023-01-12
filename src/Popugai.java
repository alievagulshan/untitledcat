public class Popugai {
    public String name;
    public  int age;
    public int weight;
    public Popugai( String name,int age, int weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    public Popugai(){

    }
    public  void sayKuku(){
        System.out.println("ку- ку");
    }
    public String getName(){
        return name;

    }
    public  void setName( String name){
        this.name=name;

    }
    public int getAge(){
        return age;

    }
    public  void setAge(int age){
        this.age=age;

    }
    public int setWeight(int weight) {
        this.weight = weight;
        return weight;
    }
}
