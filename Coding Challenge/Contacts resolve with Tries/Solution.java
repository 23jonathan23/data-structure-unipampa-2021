import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder builder = new StringBuilder();
        
        int qtdCommands = scanner.nextInt();
        
        Trie trie = new Trie();
        
        for (int i = 0; i < qtdCommands; i++) {
            String operation = scanner.next();
            String contactName   = scanner.next();
            
            if (operation.equals("add"))
                trie.add(contactName);
            else if (operation.equals("find"))
                builder.append(trie.findByPrefix(contactName)+"\n");
        }

        System.out.print(builder.toString());
        
        scanner.close();
    }
}

class Node {
    private Map<Character, Node> child = new HashMap<>();
    public int lenght = 0;

    public void putChildIfAbsent(char ch) {
        child.putIfAbsent(ch, new Node());
    }

    public Node getChildByIdentifier(char ch) {
        return child.get(ch);
    }
}

class Trie {
    Node root = new Node();
    
    public void add(String str) {
        Node curr = root;
        
        for (char ch : str.toCharArray()) {
            curr.putChildIfAbsent(ch);
            curr = curr.getChildByIdentifier(ch);
            curr.lenght++;
        }
    }
    
    public int findByPrefix(String prefix) {
        Node curr = root;
        
        for (char ch : prefix.toCharArray()) {
            curr = curr.getChildByIdentifier(ch);
            
            if (curr == null)
                return 0;
        }
        
        return curr.lenght;
    }
}