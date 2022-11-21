public class Employee {

    String name;
    int salary ;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours ,int hireYear){

        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    void  tax(){
        if (this.salary > 1000){
            double v = this.salary * 0.03;
            System.out.println("Vergi : "+v);
            this.salary-=v;


        }
        else System.out.println(this.salary);
    }

    void bonus(){
        int b = 0;
        if (this.workHours > 40){
             b = this.workHours - 40;
             b*=30;
            System.out.println("Bonus : "+b);
            this.salary +=b;

        }

    }
    void raiseSalary(){
        int year = 2021;
        double z = 0;
        if (year -this.hireYear < 10){
             z = this.salary * 0.05;
            System.out.println("Maas Artisi : "+z);
             this.salary+=z;

        }
        else if(year-this.hireYear >=9 && year-this.hireYear <=20){
           z= this.salary *0.10;
            System.out.println("Maas Artisi : "+z);
           this.salary +=z;

        }
        else {
            z =this.salary*0.15;
            System.out.println("Maas Artisi : "+z);
            this.salary +=salary;

        }

    }


}
