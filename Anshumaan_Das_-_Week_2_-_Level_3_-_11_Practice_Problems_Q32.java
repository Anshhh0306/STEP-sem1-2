import java.util.Scanner;

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord;
}

class Trie {
    TrieNode root = new TrieNode();

    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) return false;
            node = node.children[index];
        }
        return node.isEndOfWord;
    }
}

public class W2L3Q32 {
    public static void main(String[] args) {
        Trie trie = new Trie();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Trie: insert <word>, search <word>, exit");
        while (true) {
            String command = scanner.next();
            if ("exit".equals(command)) break;
            String word = scanner.next();
            switch (command) {
                case "insert":
                    trie.insert(word);
                    System.out.println("Inserted: " + word);
                    break;
                case "search":
                    System.out.println("Found: " + trie.search(word));
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        }
    }
}