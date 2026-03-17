package mx.unam.fesa.ico.tarea5.tarea5.modelo;

public class Mascota {
    private String animal;
    private String raza;
    private String foto;

    public Mascota(String animal, String raza, String foto) {
        this.animal = animal;
        this.raza = raza;
        this.foto = foto;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "animal='" + animal + '\'' +
                ", raza='" + raza + '\'' +
                ", foto='" + foto + '\'' +
                '}';
    }
}
