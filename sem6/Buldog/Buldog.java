package sem6.Buldog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Buldog {
    public String name;
     public int age;

     public String passport;
     public String getPassport(){
         return passport;
     }
//     public ArrayList<String> exhibition = new ArrayList<>();
    public HashMap<String, String> exhibition = new HashMap<>();
     public HashMap<String, String> getExhibition(){
         return exhibition;
     }
     public void setExhibition(String exhibition, String role){
         this.exhibition.put(exhibition, role);
     }
//     public String roleExhibition;
//     public String getRoleExhibition(){
//         return roleExhibition;
//     }
//     public void setRoleExhibition(String roleExhibition){
//         this.roleExhibition = roleExhibition;
//     }
     public ArrayList<String> award = new ArrayList<>();
     public ArrayList<String> getAward(){
         return award;
     }
     public void setAward(String award){
         this.award.add(award);
     }
     public void setPassport(String passport){
         this.passport = passport;
     }

    public buldog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void walking(){
        System.out.println(name + " гуляет");
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void eating(){
        System.out.println(name + "кушает");
    }
    public void sleeping(){
        System.out.println(name + "спит");
    }
}