import java.lang.*;
class TrieNode{
    TrieNode[] children=new TrieNode[26];
    int c;
    TrieNode(){
        Arrays.fill(children,null);
        c=0;
    }
}
class Trie{
    TrieNode root;
    Trie(){
        root=new TrieNode();
    }
    public void insert(String str){
        TrieNode node=root;
        for(char ch:str.toCharArray()){
            if(node.children[ch-'a']==null){
                node.children[ch-'a']=new TrieNode();
            }
            node=node.children[ch-'a'];
node.c++;
        }
         
    }
    public String search(String s,int n){
        TrieNode node=root;
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(node.children[ch-'a'].c!=n)
            {
                return sb.toString();
            }
            node=node.children[ch-'a'];
            sb.append(ch);
        }
        return sb.toString();
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
       Trie trie=new Trie();
       for(String s:strs){
        trie.insert(s);
       }
       String res=trie.search(strs[0],strs.length);
       return res;
    }
}