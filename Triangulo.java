public class Triangulo implements FiguraGeometrica {

    private double base;
    private double altura;
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public void setBase(double base){
        this.base=base;
    }

    public double getBase(){
        return this.base;
    }

    public void setAltura(double altura){
        this.altura=altura;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setLadoA(double ladoA){
        this.ladoA=ladoA;
    }

    public double getLadoA(){
        return this.ladoA;
    }

    public void setLadoB(double ladoB){
        this.ladoB=ladoB;
    }

    public double getLadoB(){
        return this.ladoB;
    }

    public void setLadoC(double ladoC){
        this.ladoC=ladoC;
    }

    public double getLadoC(){
        return this.ladoC;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return this.base*this.altura/2;
    }

    @Override
    public String getNomeFigura() {
        // TODO Auto-generated method stub
        return "Triangulo";
    }

    @Override
    public double getPerimetro() {
        // TODO Auto-generated method stub
        return ladoA+ladoB+ladoC;
    }
    
    
}
