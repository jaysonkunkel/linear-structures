package cs207.linear;

import java.util.Comparator;

public class StringPriorityQueue{
  

  public static void main(String args[]) throws Exception{

    Comparator<String> myComparator = new Comparator<String>(){
      public int compare(String s1, String s2){
        if(s1.length() == s2.length()){
          return s1.compareTo(s2);
        }
        else if (s1.length() < s2.length()){
          return -1;
        }
        else{
          return 1;
        }
      }
    };
    PriorityQueue<String> strings = new BuiltinPriorityQueue<String>(20, myComparator);  
    
    strings.put("ZZZZ");
    strings.put("BBBBB");
    strings.put("Aardvark with an extra a");
    strings.put("hi");
    System.out.println(strings.get());
    System.out.println(strings.get());
    System.out.println(strings.get());
    System.out.println(strings.get());
  }


}