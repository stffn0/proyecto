public class Orden {
    private int id;
    private int numeroMesa;
    private int idMesero;
    private String estado;

    public Orden(int id, int numeroMesa, int idMesero, String estado) {
        this.id = id;
        this.numeroMesa = numeroMesa;
        this.idMesero = idMesero;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
