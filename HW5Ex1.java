public class HW5Ex1 {
    public static void main(String[] args) {
        employees employee1 = new employees("Max", 25, "devops", "maxdev@yandex.ru", "89255621234", 95000);
        employee1.printInfo();
        employees[] empArray = new employees[5];
        empArray[0] = new employees("Ivan", 42, "software developer", "Ivan@12.com", "841258796", 305000);
        empArray[1] = new employees("Igor", 54, "sisadmin", "Igor@12.com", "84586547896", 125000);
        empArray[2] = new employees("Alexey", 41, "sisadmin", "Alexey@12.com", "84586545496", 140000);
        empArray[3] = new employees("Michail", 38, "CEO", "Michail@12.com", "84586547896", 950000);
        empArray[4] = new employees("Lada", 38, "tester", "Lada@12.com", "84586556896", 95000);



        for (int i=0; i < empArray.length; i++)
            if (empArray[i].age > 40) empArray[i].printInfo();

        }




    }




