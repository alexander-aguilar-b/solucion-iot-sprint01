package models;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.Date;

@Entity(value = "DB.logdispositivo")
public class LogDispositivo {
    @Id
    private ObjectId _id;
    private String variable;
    private String valor;
    private String estado;
    private Date fecha;

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public ObjectId getId() {
        return _id;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
