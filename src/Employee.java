public class Employee {
    String name;
    double salary;
    int workhours;
    int hireyear;
    double tax;
    double prim;
    double raise;
    double result;

    Employee(String name, int salary, int workhours, int hireyear) {
        this.name = name;
        this.salary = salary;
        this.workhours = workhours;
        this.hireyear = hireyear;

    }

    void tax() {
        if (salary < 1000) {
            tax = 0;
        } else {
            tax = (salary * 3) / 100;
        }
        System.out.println("Vergi :"+tax);
    }

    void bonus() {
        if (workhours > 40) {
            prim = (workhours - 40) * 30;
        } else {
            prim = 0;
        }
        System.out.println("Bonus: "+prim);
    }

    void raiseSalary() {
        if (hireyear > 2015) {
            raise = (salary * 5) / 100;
        } else if (hireyear < 2002) {
            raise = (salary * 15) / 100;
        } else if (2012 > hireyear && hireyear > 2001) {
            raise = (salary * 10) / 100;
        }
        System.out.println("Maaş Artışı :"+raise);
    }
    void lastsalary(){
        result=(this.salary+this.prim+this.raise)-this.tax;
        System.out.println("Yeni Maaş: "+result);
    }

    public void run() {
        System.out.println("İsim :"+name);
        System.out.println("Çalışma Saati :"+workhours);
        System.out.println("Başlangıç Yılı :"+hireyear);
        raiseSalary();
        tax();
        bonus();
        lastsalary();
    }
}


