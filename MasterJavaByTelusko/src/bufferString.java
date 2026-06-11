public class bufferString {
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("Pranshu");
        sb.append(" Sharma");
        sb.deleteCharAt(3);
        sb.insert(2, "iy");
        sb.insert(5,"n");
        System.out.println(sb);
    }
}
