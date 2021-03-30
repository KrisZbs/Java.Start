public class employees {
    String name;
    int age;
    String position;
    String email;
    String phone;
    int salary;

    public employees(String name, int age, String position, String email, String phone, int salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
    }

    public void printInfo(){
        System.out.println("Имя: " + name +  "\nВозраст: "+  age  + "\nДолжность: " + position +" " + "\nПочта: " + email+ "\nТелефон: " + phone+ "\nОклад " + salary);
    }

    }



