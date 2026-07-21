class Software {
    String softwareName;
    String softwareVersion;
    protected int softwareId;
    Software(String softwareName, String softwareVersion,int softwareId){
        this.softwareName=softwareName;
        this.softwareVersion=softwareVersion;
        this.softwareId=softwareId;
    }
    void softwareInfo(){
        String s1 ="Java";
        String s2 =s1 + "Python";
        System.out.println(s1.equals(s2));
        System.out.println("Software Name: "+softwareName);
        System.out.println("Software Version: "+softwareVersion);
        System.out.println("Software Id: "+softwareId);
    }
}
class Production extends Software{
    Production(String softwareName, String softwareVersion,int softwareId){
        super(softwareName, softwareVersion, softwareId);
    }
    @Override
    void softwareInfo() {
        super.softwareInfo();
    }
    public static void main(String[] args){
        Software s = new Production("Java", "1.8", 1234);
        s.softwareInfo();
    }
}