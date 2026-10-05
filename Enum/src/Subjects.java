enum Sub {
    MATH("001"),
    ENGLISH("002"),
    PHYSICS("003"),
    CHEMISTRY("004");
    // Varibale Declare
    private final String subCode;

    //Constructor
    Sub(String subCode) {
        this.subCode = subCode;
    }

    public String getSubCode() {
        return subCode;
    }
}
class Subjects {
    Sub s = Sub.MATH;
    public static void main(String[] args) {
        Subjects subjects = new Subjects();
        System.out.println(subjects.s.getSubCode());
    }
}




