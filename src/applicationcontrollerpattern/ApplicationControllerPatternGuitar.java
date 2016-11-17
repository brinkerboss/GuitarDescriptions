package applicationcontrollerpattern;

import java.util.HashMap;


public class ApplicationControllerPatternGuitar {

    public static HashMap<String,GuitarHandler> hashMapGuitarInfo = new HashMap<String, GuitarHandler>(); 
    public static String desc;
    public static CompanyDescription companyDesc = new CompanyDescription();

    public static void handleCommand(String name) {
      
        hashMapGuitarInfo.put("fender", new Fender());
        hashMapGuitarInfo.put("gibson", new Gibson());
        hashMapGuitarInfo.put("prs", new PRS());
        hashMapGuitarInfo.put("rickenbacker", new Rickenbacker());
        
        desc = companyDesc.map.get(name);
        GuitarHandler handler = hashMapGuitarInfo.get(name);
        
        
        handler.execute(desc);
        
    }
    
}
