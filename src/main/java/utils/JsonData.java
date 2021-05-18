package utils;

import net.sf.json.JSONArray;

import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;


public class JsonData {
    private static List<entity.User> UserAccount=new LinkedList<entity.User>();
    private static List<entity.userimpl.ClassDirector>ClassDirector=new LinkedList<entity.userimpl.ClassDirector>();
    private static List<entity.userimpl.CandidateTeacher>CandidateTeacher=new LinkedList<entity.userimpl.CandidateTeacher>();
    public static void PutJsonInMemory(String name,Class clazz)
    {
        try{
            Properties proTool=new Properties();
            proTool.load(new FileInputStream("src//main//Resources//path.properties"));
            String path=proTool.getProperty(name);
            String jsonStr="";
            jsonStr=FileLoader.getInstance().ReadFile(path);
            System.out.println(jsonStr);
            UserAccount= JSONArray.toList(JSONArray.fromObject(jsonStr), clazz);
            for(entity.User user:UserAccount)
            {
                System.out.println(user.getGUID());
            }

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static List<entity.User> GetUserAccount()
    {
        if(UserAccount.isEmpty())
        {
            PutJsonInMemory("Account", entity.User.class);
        }
        return UserAccount;
    }
    public static List<entity.userimpl.ClassDirector> GetClassDirector()
    {
        if(ClassDirector.isEmpty())
        {
            PutJsonInMemory("Requirement", entity.userimpl.ClassDirector.class);
        }
        return ClassDirector;
    }
    public static List<entity.userimpl.CandidateTeacher>GetCandidateTeacher()
    {
        if(CandidateTeacher.isEmpty())
        {
            PutJsonInMemory("Training", entity.userimpl.CandidateTeacher.class);
        }
        return CandidateTeacher;
    }
    /**Commit all stuff*/
    public static boolean commit()
    {
      if(JsonData.toJSON(JsonData.GetUserAccount(),"Account"))
        {
            System.out.println("update Account information successfully");
        }
      else
          {
              System.out.println("some thing wrong with Account Information");
              return false;
          }
        if(JsonData.toJSON(JsonData.GetClassDirector(),"Requirement"))
        {
            System.out.println("update ClassDirector information successfully");
        }
        else
        {
            System.out.println("some thing wrong with ClassDirector Information");
            return false;
        }
        if(JsonData.toJSON(JsonData.GetCandidateTeacher(),"Training"))
        {
            System.out.println("update CandidateTeacher information successfully");
        }
        else
        {
            System.out.println("some thing wrong with CandidateTeacher Information");
            return false;
        }
        return true;
    }
    /**List to Json
     * */
    private static<T> boolean toJSON(List<T> objlist,String name)
    {
        try {
            JSONArray json=JSONArray.fromObject(objlist);
            FileLoader.getInstance().WirteFile(GetCommitPath(name),json.toString());
        }catch(Exception e)
        {
            return false;
        }
        return true;
    }
    /**Get Path to save
     * */
    private static String GetCommitPath(String name)
    {
        String path="";
        try{
            Properties proTool=new Properties();
            proTool.load(new FileInputStream("src//main//Resources//path.properties"));
            path=proTool.getProperty(name);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return path;
    }

}
