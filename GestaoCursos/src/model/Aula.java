package model;

public class Aula {

    private Modulo modulo;
    private String titulo;
    private String urlVideo;
    private int duracaoMinutos;

    public Aula(Modulo modulo, String titulo, String urlVideo, int duracaoMinutos) {
        this.modulo = modulo;
        this.titulo = titulo;
        this.urlVideo = urlVideo;
        this.duracaoMinutos = duracaoMinutos;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
}
