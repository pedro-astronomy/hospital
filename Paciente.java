import java.util.Date;
import java.text.SimpleDateFormat;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.DataType;

@DatabaseTable(tableName = "Paciente")
public class Paciente
{   
    @DatabaseField(generatedId = true)
    private int idade;
    
    @DatabaseField
    private String nome;
    
    @DatabaseField
    public String CPF;
    
    @DatabaseField(dataType=DataType.DATE)
    public Date birthday;  
    
    @DatabaseField
    public String endereco;
    
    @DatabaseField
    public String sexo;
    
    
    
    public String printBirthday() {
        SimpleDateFormat dateFor = new SimpleDateFormat("dd/MM/yyyy");
        return dateFor.format(birthday);
    }

//Start GetterSetterExtension Source Code

    /**GET Method Propertie id*/
    public int getidade(){
        return this.idade;
    }//end method getId

    /**SET Method Propertie id*/
    public void setId(int id){
        this.idade = id;
    }//end method setId

    /**GET Method Propertie fullName*/
    public String getnome(){
        return this.nome;
    }//end method getFullName

    /**SET Method Propertie fullName*/
    public void setnome(String nome){
        this.nome = nome;
    }//end method setFullName

    /**GET Method Propertie registration*/
    public String getCPF(){
        return this.CPF;
    }//end method getRegistration

    /**SET Method Propertie registration*/
    public void setCPF(String CPF){
        this.CPF = CPF;
    }//end method setRegistration

    /**GET Method Propertie birthday*/
    public Date getBirthday(){
        return this.birthday;
    }//end method getBirthday

    /**SET Method Propertie birthday*/
    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }//end method setBirthday
    
    
    public void setendereco(String endereco){
        this.endereco=endereco;
    }
    
    public String getendereco(){
        return this.endereco;
    }
    
    public void setsexo(String sexo){
        this.sexo=sexo;
        
    }
    public String getsexo(){
        return this.sexo;
    }

//End GetterSetterExtension Source Code


}//End class