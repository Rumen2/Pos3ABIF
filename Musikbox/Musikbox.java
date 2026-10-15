public class Musikbox 
{
    private String hersteller;
    private int lautstaerke;
    private boolean bluetooth;

    public Musikbox(String neuHersteller, int neuLautstaerke, boolean neuBluetooth)
    {
        setHersteller(neuHersteller);
        setLautstaerke(neuLautstaerke);
        setBluetooth(neuBluetooth);
        
    }
    
    public void printMusikbox()
    {
        System.out.println(hersteller + " Musikbox: " + lautstaerke + " Lautstaerke - " + bluetooth);
    }

     public String getHersteller()
    {
        return hersteller;
    }
    public int getLautstaerker()
    {
        return lautstaerke;
    }
    public boolean getBluetooth()
    {
        return bluetooth;
    }
    public void setHersteller(String neuHersteller)
    {
        hersteller = neuHersteller;
    }
    public void setLautstaerke(int neuLautstaerke)
    {
        lautstaerke = neuLautstaerke;
    }
    public void setBluetooth(boolean neuBluetooth)
    {
        bluetooth = neuBluetooth;
    }





}


