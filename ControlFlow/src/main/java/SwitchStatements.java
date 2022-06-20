public class SwitchStatements {

    public void gradeCalculator(int grade){

        switch (grade/10){

            case 10:
                System.out.println(" A++");
                break;

            case 9:
                System.out.println(" A");
                break;

            case 8:
                System.out.println(" B" );

            case 7:
                System.out.println(" C ");

            case 6:
                System.out.println(" D ");

            default:
                System.out.println(" This grade is not quite right! ");
        }






    }




}
