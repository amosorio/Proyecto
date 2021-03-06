package entities;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by santi on 14/10/2016.
 * Modified by Juan Carlos on 23/10/2016
 */
@NamedQueries({
        @NamedQuery(name="Novedad.getNovedades",
                query="SELECT e FROM Novedad e"),
        @NamedQuery(name="Novedad.findByEntidadId",
        query = "SELECT e FROM Novedad e where e.entidad.id = :entidadId")
})
@Entity
public class Novedad implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Date fechaCreacion;
    private Date fechaInicio;
    private Date fechaFin;
    private String tipo;

    @ManyToOne
    @JoinColumn(name="entidad_id", nullable = false)
    private Entidad entidad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Entidad getEntidad() {
        return entidad;
    }

    public void setEntidad(Entidad entidad) {
        this.entidad = entidad;
    }
}
