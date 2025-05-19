import java.util.*;
import java.io.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> HMs=new HashMap<>();
        HashMap<Character,Integer> HMt=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(!HMs.containsKey(s.charAt(i)))
            HMs.put(s.charAt(i),i);

            if(!HMt.containsKey(t.charAt(i)))
            HMt.put(t.charAt(i),i);

            if(!HMs.get(s.charAt(i)).equals(HMt.get(t.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}