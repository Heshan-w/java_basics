public class logicalOperators {
    public static void main(String[] args) {
        // the AND operator in java is " && "
        // the OR operator in java is " || "
        // the NOT operator in java is " ! "

        // below exaples are these operators being used with boolean expressions

        // AND operator returns true if both conditions are true
        boolean attendedMathLectures = true;
        boolean passedExam = true;
        boolean passesModule = attendedMathLectures && passedExam;
        // when we print "passesModule" we will get true or false depending on the
        // states of the conditions used in the comparison
        // this example will return true as both conditions are true. else false
        System.out.println("Module passed : " + passesModule);

        // OR operator returns true if one of the two conditions are true
        boolean clubMember = false;
        boolean guestOfMember = false;
        boolean allowAccess = clubMember || guestOfMember;
        // this example will return false as both conditions are false. if atleast one
        // was true it would return true
        System.out.println("Admit into club : " + allowAccess);

        // NOT operator reverses the boolean state of a condition
        boolean currentStudent = true;
        boolean firstYearStudent = true;
        boolean eligible = currentStudent && !firstYearStudent;
        // this example will return false as only current students who are not in the
        // first year are accepted
        System.out.println("admit into lecture : " + eligible);
    }
}
