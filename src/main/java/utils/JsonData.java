package utils;

import net.sf.json.JSONArray;

import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;


public class JsonData {
    private static List<entity.User> UserAccount=new LinkedList<entity.User>();
    private static List<entity.RecruitmentList>ClassDirector=new LinkedList<entity.RecruitmentList>();
    private static List<entity.TrainingList>CandidateTeacher=new LinkedList<entity.TrainingList>();
    public static<T> List<T> PutJsonInMemory(String name,Class T)
    {
        List<T> tempList;
        try{
            Properties proTool=new Properties();
            proTool.load(new FileInputStream("src//main//Resources//path.properties"));
            String path=proTool.getProperty(name);
            String jsonStr="";
            jsonStr=FileLoader.getInstance().ReadFile(path);
            tempList=JSONArray.toList(JSONArray.fromObject(jsonStr), T);
        }catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
        return tempList;
    }
    public static List<entity.User> GetUserAccount()
    {
        if(UserAccount.isEmpty())
        {
            UserAccount=PutJsonInMemory("Account", entity.User.class);
        }
        return UserAccount;
    }
    public static List<entity.RecruitmentList> GetClassDirector()
    {
        if(ClassDirector.isEmpty())
        {
            ClassDirector=PutJsonInMemory("Requirement", entity.RecruitmentList.class);
        }
        return ClassDirector;
    }
    public static List<entity.TrainingList>GetCandidateTeacher()
    {
        if(CandidateTeacher.isEmpty())
        {
            CandidateTeacher=PutJsonInMemory("Training", entity.TrainingList.class);
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
