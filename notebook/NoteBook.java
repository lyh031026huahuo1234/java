//package notebook;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class NoteBook{
    private ArrayList<String> notes = new ArrayList<String>();
    

    public void add(String s){
        notes.add(s);
    }

    public void add(String s,int loc){
        notes.add(loc,s);
    }
    
    public int getSize(){
        return notes.size();
    }

    public String getNote(int index){
        return notes.get(index);
    }

    public void removeNote(int index){
        notes.remove(index);
    }

    public String[] list(){
        String[] a = new String[notes.size()];
        // for(int i=0; i<notes.size(); i++){
        //     a[i] = notes.get(i);
        // }
        notes.toArray(a);
        return a;
    }


    public static void main(String[] args){
        NoteBook nb = new NoteBook();
        nb.add("first");
        nb.add("second");
        nb.add("third",1);
        nb.removeNote(1);
        String[] a = nb.list();
        for( String s : a){
            System.out.println(s);
        }
        
        System.out.println("---------------");
        HashSet<String> set = new HashSet<String>();
        set.add("first");
        set.add("second");
        set.add("first");
        System.out.println(set);
    }
    
}
