
public class Contact {

    private String name;
    private String fatherName;
    private String telephone;


    public Contact(String aName, String aFatherName, String aTelephone){
        name = aName;
        fatherName = aFatherName;
        telephone = aTelephone;
    }

    @Override
    public String toString() {
        return name+" - "+telephone;
    }

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public int hashCode(){
        return name.hashCode() + fatherName.hashCode();
    }

    public boolean equals(Object o){
        if(o instanceof Contact){
            Contact other = (Contact)o;
            if(name.equals(other.name) && fatherName.equals(other.fatherName)){
                return true;
            }
        }
        return false;
    }


}
