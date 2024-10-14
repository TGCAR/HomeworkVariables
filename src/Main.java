public class Main {
    public static void main(String[] args) {
        var dog = 0.8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var fighter1 = 78.2;
        var fighter2 = 82.7;
        var TotalMassFighters =  fighter1 + fighter2;
        System.out.println(TotalMassFighters);
        var fighterMassDifference = fighter1 - fighter2;
        System.out.println(fighterMassDifference);
        var restMassesFighter = fighter2 % fighter1;
        System.out.println(restMassesFighter);

        var totalNumberHours = 640;
        var employeeWorks = 8;
        var numberEmployees = totalNumberHours / employeeWorks;
        System.out.println("Всего работников в компании - " + numberEmployees + " человек");
        var addedWorkes = 94 + numberEmployees;
        var totalNumberHours2 = 8 * addedWorkes;
        System.out.println("Если в компании работает " + addedWorkes + " человека, то всего " + totalNumberHours2 + " часа работы может быть поделено между сотрудниками" );


    }
}