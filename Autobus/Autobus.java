public class Autobus
{
    private String kennzeichen;
    private int sitzplatze;
    private boolean anhanger;
    
    public Autobus(String neuKennzeichen, int neuSitzplatze, boolean neuAnhanger)
    {
        setKennzeichen(neuKennzeichen);
        setSitzplatze(neuSitzplatze);
        setAnhanger(neuAnhanger);
    }
    
    public Autobus(String neuKennzeichen, int neuSitzplatze)
    {
        setKennzeichen(neuKennzeichen);
        setSitzplatze(neuSitzplatze);
        setAnhanger(true);
    }
    
    public Autobus(int neuSitzplatze, boolean neuAnhanger)
    {
        setKennzeichen("W36672T");
        setSitzplatze(neuSitzplatze);
        setAnhanger(true);
    }
    
    public Autobus(int neuSitzplatze)
    {
        setKennzeichen("W267RT");
        setAnhanger(true);
        if (neuSitzplatze > 7){
            setSitzplatze(neuSitzplatze);
            System.out.println("Das ist ein Bus");
        } else if (neuSitzplatze < 7)
        {
          setSitzplatze(neuSitzplatze);
          System.out.println("Das ist ein Auto");
        }
    }
    
    public String getKennzeichen()
    {
        return kennzeichen;
    }
    public int getSitzplatze()
    {
        return sitzplatze;
    }
    public boolean getAnhanger()
    {
        return anhanger;
    }
    public void setKennzeichen(String neuKennzeichen)
    {
        kennzeichen = neuKennzeichen;
    }
    public void setSitzplatze(int neuSitzplatze)
    {
        sitzplatze = neuSitzplatze;
    }
    public void setAnhanger(boolean neuAnhanger)
    {
        anhanger = neuAnhanger;
    }
}