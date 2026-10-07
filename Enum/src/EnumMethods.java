enum SubMarks {
    PHYSICS("40"),
    CHEMISTRY("50"),
    MATH("60"),
    ENGLISH("75");
    private final String marks;
    SubMarks(String marks){
        this.marks= marks;
    }
    public String getMarks(){
        return marks;
    }
}
class EnumMethods{
    public static void main(String[] args){
        //Saare Constant ka Array
        //0 se start hota hai, declaration order ke hisaab se.
        for(SubMarks s : SubMarks.values()){
            System.out.println(s + " | ordinal="+s.ordinal()+ " | code="+s.getMarks());
        }
        //valueOf("physics") (lowercase) pe IllegalArgumentException aayega, kyunki name case-sensitive hai.
        Sub s1 = Sub.valueOf("PHYSICS");
        System.out.println(s1.name());
        System.out.println(Sub.ENGLISH.compareTo(Sub.CHEMISTRY));
        System.out.println(s1==Sub.PHYSICS);
    }
}


