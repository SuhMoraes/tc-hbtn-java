public class Telefone {

    private String codArea;
    private String num;

    public Telefone(String codArea, String num) {
        this.codArea = codArea;
        this.num = num;
    }

    public String getCodArea() {
        return codArea;
    }

    public void setCodArea(String codArea) {
        this.codArea = codArea;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "( " + codArea + ")" + num;
    }
}

