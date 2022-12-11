import java.util.LinkedList;
public class Main {    
    public static void main(String[] args) {
        LinkedList<String> iscof = new LinkedList<String>();
        iscof.add(0, "O");
        iscof.add(1, "F");
        iscof.add(2, "I");
        iscof.add(3, "S");
        iscof.add(4, "C");
        System.out.print(iscof.get(2) + iscof.get(3) + iscof.get(4) + iscof.get(0) + iscof.get(1));
    }
    
}
