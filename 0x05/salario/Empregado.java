public class Empregado {
    public double salarioFixo;

   public Empregado(double salarioFixo) {
       super();
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double calcularBonus(Departamento departamento){
        if (departamento.alcancouMeta()){
            return salarioFixo*0.1;
        } else {
            return 0.00f;
        }
    }

    public double calcularSalarioTotal(Departamento departamento) {
        return calcularBonus(departamento) + salarioFixo;
    }
}
