public class MySchedule {
  public static void main( String[] args) {
    String[] classes = { "English III", "Precalculus", "Music Theory", "Biotechnology", "Principles of Technology I", "Latin II", "AP US History", "Business Computer Information Systems" };
    String[] instructors = { "Ms. Lapan", "Mrs. Gideon", "Mr. Davis", "Ms. Palmer",  "Ms. Garcia", "Ms. Barnett", "Ms. Johannessen", "Mr. James" };
    String border;

    border = "+---------------------------------------------------------------+";

    System.out.println( border );

    for ( int i=0; i < classes.length; i++) {
      String workingClass = classes[i];
      do {
        workingClass = " " + workingClass;
      } while (workingClass.length() < 38);

      String thisProfTho = instructors[i];
      do {
        thisProfTho = " " + thisProfTho;
      } while (thisProfTho.length() < 16);

      System.out.println( "| " + i + " | " + workingClass + " | " + thisProfTho + " |");
    }

    System.out.println( border );
  }
}
