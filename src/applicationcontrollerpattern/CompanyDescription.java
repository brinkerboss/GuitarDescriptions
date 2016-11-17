package applicationcontrollerpattern;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.ParseException;


public class CompanyDescription {
    
    String fenderDescription;
    String gibsonDescription;
    String rickDescription;
    String prsDescription;
    private HashMap<String, Object> data;
    HashMap<String, String> map = new HashMap<String,String>();
    
    public void getDescription() throws IOException, JSONException, ParseException {
        try {
            URL url = new URL("http://jordanbrinkerhoff.net/guitar_desc.php");
            
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            
             JSONInputStream input = new JSONInputStream(connection.getInputStream());
            
              setData((HashMap<String, Object>) input.readObject());
             
              
	    for (String key : this.data.keySet()) {
		
		
		map = (HashMap<String, String>) this.data.get(key);
		this.setFenderDescription(map.get("fender"));
                this.setGibsonDescription(map.get("gibson"));
                this.setPrsDescription(map.get("prs"));
                this.setRickDescription(map.get("rickenbacker"));
		
		
            }
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(CompanyDescription.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}

    public String getFenderDescription() {
        return fenderDescription;
    }

    public void setFenderDescription(String fenderDescription) {
        this.fenderDescription = fenderDescription;
    }

    public String getGibsonDescription() {
        return gibsonDescription;
    }

    public void setGibsonDescription(String gibsonDescription) {
        this.gibsonDescription = gibsonDescription;
    }

    public String getRickDescription() {
        return rickDescription;
    }

    public void setRickDescription(String rickDescription) {
        this.rickDescription = rickDescription;
    }

    public String getPrsDescription() {
        return prsDescription;
    }

    public void setPrsDescription(String prsDescription) {
        this.prsDescription = prsDescription;
    }
    
    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }

    
}
