package aulaMarco;

class Filme {

    // atributos
    private String titulo;
    private int duracao;
    private int ano;
    private String sinopse;

    // os metodos da classe
    public String getTitulacao() {
        return this.titulo;
    }

    public void setTitulacao(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getSinopse() {
        return this.sinopse;
    }

}