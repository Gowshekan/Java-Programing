public class user
{
    String id,name,address,mobileno;

    public user(String id,String name,String address,String mobileno)
    {
        this.id=id;
        this.name=name;
        this.address=address;
        this.mobileno=mobileno;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }
}