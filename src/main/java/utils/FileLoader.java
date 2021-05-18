package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class FileLoader {
    private final String templateKey="template";
    private static FileLoader instance = new FileLoader();
    private FileLoader(){}
    private final String SavingPath="/Users/macbook/Desktop/database";
    public static FileLoader getInstance(){
        return instance;
    }
    private  String finalPath;
    private  FileWriter writer;
    private  FileReader fileReader;
    /**上传文件默认为一个硬盘固定文件D：Requirement文件夹
     * */
    public boolean UpdateFile(String Sourcepath,String GUID)
    {
        if(!IsFileExisted(Sourcepath))
        {
            System.out.println("path is wrong");
            return false;
        }
        String name=GUID+" "+"Requirement.txt";
        File file=new File(SavingPath);
        if(!file.exists())
        {
            file.mkdir();
        }
        try{
            fileReader=new FileReader(Sourcepath);
            char[] content=new char[1024];
            int len=0;
            writer=new FileWriter(SavingPath+"//"+name);
            String contents;
            while((len=fileReader.read(content))!=-1)
            {
                contents=new String(content,0,len);
                if(!StoreFile(contents))
                {
                    return false;
                }
            }
            writer.close();
            fileReader.close();

        }catch (Exception e)
        {
            System.out.println("path is wrong");
            return false;
        }
        return true;

    }
    public  boolean DownloadTemplate(String targetPath)
    {
        finalPath=ParpareStore(targetPath);

        try
        {
            writer=new FileWriter(finalPath);
            Properties proTool=new Properties();
            proTool.load(new FileInputStream("src//main//Resources//path.properties"));
            String path=proTool.getProperty(templateKey);
            FileReader fw=new FileReader(path);
            char[] content=new char[1024];
            String contents;
            int len=0;
            while((len=fw.read(content))!=-1)
            {
                contents=new String(content,0,len);
                if(!StoreFile(contents))
                {
                    return false;
                }
            }
            writer.close();
            fw.close();
        }
        catch (Exception e)
        {
            System.out.println("Sorry,System wrong ,please contact us");
            return false;
        }
        return true;
    }
    /**检测文件重复
     * */
    private boolean IsFileExisted(String path)
    {
        File file=new File(path);
        if(file.exists()){return  true;}
        else{return false;}
    }
    private  String ParpareStore(String path)
    {
        String name="RequirementTemplate.txt";
        int filenumber=0;
        File file=new File(path);
        if(file.exists())
        {
            if(file.isDirectory())
            {
                String temp=path+"//"+name;
                file=new File(temp);
                while(IsFileExisted(temp))
                {
                    filenumber++;
                    temp=path+"//RequirementTemplate("+filenumber+")"+".txt";
                }
                return temp;
            }else
            {
                return path+"is a wrong path";
            }
        }
        else
            {
                file.mkdir();
                return path+"//"+name;
            }
    }
    /**存储文件，
     * path 存储文件路径
     * */
    private  boolean StoreFile(String content)
    {
       try
       {
           writer.write(content);
       }catch(Exception e)
       {
        e.printStackTrace();
        return false;
       }
       return true;
    }
    public  String ReadFile(String path)
    {
        String content="";
        try
        {
            fileReader = new FileReader(path);
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = fileReader.read()) != -1)
            {
                sb.append((char) ch);
            }
            content= sb.toString();
            fileReader.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return content;

    }
    public boolean WirteFile(String path,String content)
    {
        try
        {
            writer=new FileWriter(path);
            writer.write(content);
            writer.close();
        }catch(Exception e)
        {
            return false;
        }
       return true;
    }

}
