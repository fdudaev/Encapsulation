public class Main {
    public static void main(String[] args) {


        Printer printer = new Printer(50, false);

        System.out.println("Initial page count is = " + printer.getPagesPrinted());
        int pagesPrinter = printer.printPages(5);
        System.out.println("Pages printed was = " + pagesPrinter + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinter = printer.printPages(3);
        System.out.println("Pages printed was = " + pagesPrinter + " new total print count for printer = " + printer.getPagesPrinted());

/*
        EnhancedPlayer player1 = new EnhancedPlayer("Farrukh", 100, "ragatka");

        int damage = 40;
        player1.loseHealth(damage);
        System.out.println(player1.getHealth() +"\n"+ player1.getName() +"\n"+ player1.getWeapon());

*/



/*        Player player = new Player();

        player.name="Tim";
        player.health = 20;
        player.weapon = "Ragantka";
        int damage = 30;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println(player.name + "\n" + player.health + "\n" + player.weapon + "\n" + player.healthRemaining());*/

    }
}