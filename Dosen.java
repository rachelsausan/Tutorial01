
public class Dosen {
	
	private String name;
    private String pelajaran;
    
    // ini method setter
    public void setName(String name){
    	
    	this.name = name;
    	
    }
    
    public void setPelajaran(String pelajaran){
    	this.pelajaran = pelajaran;
	}
    
    // ini method getter
    public String getName(){
    	return this.name;
    }
    
    public String getPelajaran(){
    	return this.pelajaran;
	}
}
