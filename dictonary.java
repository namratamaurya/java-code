package main.java;

public class dictonary {
    public static void main(String[] args) {
        String keys[] = {"estate","estimate","est","namrata","vishal","natasha","vikram","naveen","aditya","aarav"};

        root = new TrieNode();

        for (int i = 0; i < keys.length ; i++) {
            insert(keys[i]);
        }

        if(search("est") == true) {
            System.out.println("present");
        }
        else {
            System.out.println("absent");
        }



    }



    static final int ALPHABET_SIZE = 26;
    static class TrieNode{
        TrieNode [] children = new TrieNode[ALPHABET_SIZE];
        boolean isEndOfWord;

        TrieNode(){
            isEndOfWord=false;
            for(int i=0;i<ALPHABET_SIZE;i++){
                children[i]=null;
            }
        }
    };

    static TrieNode root;

    static void insert (String key){
        int level;
        int length=key.length();
        int index;

        TrieNode node = root;

        for(level = 0; level<length;level++){
            index = key.charAt(level)-'a';
            if(node.children[index]==null){
                node.children[index]= new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }


    static boolean search(String key)
    {
        int level;
        int length = key.length();
        int index;
        TrieNode node = root;

        for (level = 0; level < length; level++)
        {
            index = key.charAt(level) - 'a';

            if (node.children[index] == null)
                return false;

            node = node.children[index];
        }

        return (node.isEndOfWord);
    }

}

