package com.cg.lb6.ui;
import java.util.HashMap;
import java.util.Set;
public class GetStudents
{
       public HashMap<String,String> getStudent(HashMap<String,Integer> stu)
       {
              HashMap<String,String> medal = new HashMap<>();
              Set<String> set = stu.keySet();
              for(String s:set)
              {
                     Integer marks = stu.get(s);
                     if(marks>=90)
                     {
                           medal.put(s,"Gold");
                     }
                     else if(marks >=80)
                     {
                           medal.put(s,"Silver");
                     }
                     else if(marks>=70)
                     {
                           medal.put(s,"Bronze");
                     }
              }
              return medal;
       }
       public static void main(String[] ar)
       {
              HashMap<String,Integer> stu = new HashMap<>();
              GetStudents p = new GetStudents();
              stu.put("meghana",65);
              stu.put("chandana",76);
              stu.put("vaishu",89);
              stu.put("chan",90);
              stu.put("sonu",93);
              System.out.println(p.getStudent(stu));
       }
}

