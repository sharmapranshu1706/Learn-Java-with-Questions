class Purchase{
    public String letPlayMusic(){
        return "Music is Playing";
    }public String GetaPen(int cost){
        if(cost>=10){
            System.out.println("You can get a pen");
        }else {
            System.out.println("You cannot get a pen");
        }
        return "Cost is: " + cost;
    }
}
class Check{
    public String show(String hello){
        return hello;
    }
    public char by(char bye){
        return bye;
    }
}
class object {
    public static void main(String[] args) {
        String hello = "Greet Happens";
        int cost = 9;
        char bye='b';
        Purchase pr = new Purchase();
        String music = pr.letPlayMusic();
        String pen = pr.GetaPen(cost);
        Check ch = new Check();
        String result = ch.show(hello);
        char p = ch.by(bye);
        System.out.println(pen);
        System.out.println(music);
        System.out.println(result + " " + p);

    }
}
