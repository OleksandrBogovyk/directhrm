package directhrm.entity;

public class Organization {
    
    public void setId(int id) {
        this.id = id;
    }
        
    public void setOrganizationName(String organization_name) {
        this.organization_name = organization_name;
    } 
    
    public void setOrganizationZip(int organization_zip) {
        this.organization_zip = organization_zip;
    } 
    
    public void setOrganizationCity(String organization_name) {
        this.organization_name = organization_name;
    }
    
    public void setOrganizationAddress(String organization_address) {
        this.organization_address = organization_address;
    }
    
    public void setOrganizationPhone(String organization_phone) {
        this.organization_phone = organization_phone;
    }
    
    public void setOrganizationEmail(String organization_email) {
        this.organization_email = organization_email;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getOrganizationName() {
        return this.organization_name;
    }
    

	private int id;
	
        private String organization_name;
        private int organization_zip;
        private String organization_city;
        private String organization_address;
        private String organization_phone;
        private String organization_email;
        
}        
