public class Main {

    public static void main(String[] args) {

        IfElse ifelse = new IfElse();


        String newString = "This is Hello World";
        System.out.println(ifelse.checkStringLength("Isaiah"));
        System.out.println(ifelse.PrintTStringsOnly(newString));

        /*
                                    ForLoops
         */
        //notice we did not have to make an instance of our Forloops class
        //in order to invoke these methods - this is because they are static


        ForLoops.printAssociatesNames(new String[]{"Jo Jo", "Cj", "DeAnn", "David", "Shane"});

        //the other way is to declare the array first
        //assign it to a variable
        //and use the variable in the method param
        String[] associates = {" Shaquanna", " Mark", " Tyler", " Eric", " Janga", " Li"};
        System.out.println(ForLoops.printTotalAssociatesNamesCount(associates));

        /*
                            While Loops
         */

        WhileLoops.printFirst3Indexes(associates);

        /*
                                Do-While Loop
         */
        DoWhile doWhile = new DoWhile();
        doWhile.printValueIfTrue();

        /*
                            Switch Statements
         */
        SwitchStatements switchStatements = new SwitchStatements();
        switchStatements.gradeCalculator(65);
    }
}
