package Week1.Day7.Advanced;

//Create a HashMap of student → list of subjects (use List<String> as value).
public class Subjects {
    private String name;
    private String[] classes;

    //Constructor
    public Subjects(String name, String[] classes) {
        setName(name);
        setClasses(classes);
    }

    //getter
    public String getName() {return name;}
    public String[] getClasses() {return classes;}

    //setter
    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            this.name = "UNKNOWN_STUDENT";
        } else {
            this.name = name;
        }
    }

    public void setClasses(String[] classes) {
        if(classes.length == 0){
            this.classes = new String[] {"NO_CLASSES"};
        } else {
            this.classes = classes;
        }
    }
}
