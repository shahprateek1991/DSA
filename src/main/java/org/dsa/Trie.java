package org.dsa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trie {

    final private TrieNode root = new TrieNode();

    public Trie(List<String> words) {
        for (String str : words) {
            insertNode(str);
        }
    }

    private void insertNode(String str) {
        TrieNode currentNode = root;
        for (int i = 0; i < str.length(); i++) {
            if (currentNode.children.get(str.charAt(i)) == null){
                TrieNode newNode = new TrieNode();
                currentNode.children.put(str.charAt(i), newNode);
                currentNode = newNode;
            } else {
                currentNode = currentNode.children.get(str.charAt(i));
            }
        }
        currentNode.isEnd = true;
    }

    public boolean search(String str) {
        TrieNode node = root;
        for (int i =0; i<str.length(); i++) {
            Character c = str.charAt(i);
            if (node.children.get(c) != null) {
                node = node.children.get(c);
            } else {
                return false;
            }
        }

        return node.isEnd;
    }

    public void insert(String str) {
        insertNode(str);
    }

    public void delete(String str) {
        delete(root, str, 0);
    }

    private TrieNode delete(TrieNode node, String str, int i) {
        if (node == null) return null;
        if (i == str.length()) {
            node.isEnd = false;
            if (node.children.isEmpty()) return null;
            else return node;
        }
        if (node.isEnd && node.children.isEmpty()) {
            node.isEnd = false;
            return null;
        }
        else {
            node.children.put(str.charAt(i), delete(node.children.get(str.charAt(i)), str, i+1));
            return node;
        }
    }

    public static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isEnd;
    }
}
