
package javaapp;

public class CalcExp {
    private double TotMiles;
    private double GasPrice;
    private double MPG;
    private double Park;
    private double Toll;
    private double TotGallons;
    private double TotGasExp;
    double TotExp;    

void setvalues(double a, double b, double c, double d, double e)
{
a=this.TotMiles;
b=this.GasPrice;
c=this.MPG;
d=this.Park;
e=this.Toll;
}
void CalcTG()
{
    this.TotGallons=this.TotMiles/this.MPG;
}
void CalcTGE()
{
    this.TotGasExp=this.GasPrice*this.TotGallons;
}
void CalcTE()
{
    this.TotExp=this.TotGasExp+this.Park+this.Toll;
}

public double getTotMiles() {
    return TotMiles;
}

public double getGasPrice() {
    return GasPrice;
}

public double getTotGallons() {
    return TotGallons;
}

public double getTotGasExp() {
    return TotGasExp;
}

public double getTotExp() {
    return TotExp;
}

}