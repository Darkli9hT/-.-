public class Drob {
    public int chisl;
    public int znam;
    public Drob(int x, int y){
        this.chisl=x;
        this.znam=y;
    }
    public Drob(){}
    public String getdrob(){return String.valueOf(chisl) + '/' + String.valueOf(znam);}
}
