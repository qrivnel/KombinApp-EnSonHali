public abstract class Ustluk extends Giyim {
    public abstract String altlikGetir(String renk);
    public String ayakkabiGetir(String renk){
        String[] ayakkabilar = {"Günlük Ayakkabı", "Spor Ayakkabı"};
        int randomSayi = (int) (Math.random() * 2);
        return okuRenkGetir(renk) +" "+  ayakkabilar[randomSayi];
    }
}
