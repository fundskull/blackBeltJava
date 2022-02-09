package game;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Petr", 12);
        Team<Schoolar> schoolarTeam = new Team<>("Schoolars");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        Student student1 = new Student("Kolya", 17);
        Student student2 = new Student("Stas", 18);
        Team<Student> studentTeam = new Team<>("Students");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Employee employee1 = new Employee("Nikita", 25);
        Employee employee2 = new Employee("Egor", 24);
        Team<Employee> employeeTeam = new Team<>("Employeers");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        schoolarTeam.playWithAnotherTeam(schoolarTeam);
        employeeTeam.playWithAnotherTeam(employeeTeam);
        studentTeam.playWithAnotherTeam(studentTeam);
    }
}