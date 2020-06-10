
/**
 * 여기에 DVDPriceCalculate 클래스 설명을 작성하십시오.
 * 
 * @author (2018315036 양유석,2018315003 최세원, 2018315022 이지연) 
 * @version (20.06.10)
 */
public class DVDPriceCalculate
{
    /**
     * 예제 메소드 - DVD요금을 할인하는 메소드
     * 
     * @param  price/ age/ old   가격/ 나이/ 구작
     * @return     18세 이하 price*0.1 / 65세 이상 price*0.2 / 구작 price*0.5 
     */
    public double OffThePrice(double price, int age, int old)
    {
        boolean oldDVD = false;
        if (old >= 6){
            oldDVD = true;}
        else{
            oldDVD = false;}

        if(oldDVD == true)
        {
            return price = price * 0.5;
        }
        else if( age <= 18)
        {
            return price = price * 0.9;
        }
        else if (age >= 65 )
        {
            return price = price * 0.8; 
        }
        else
        {
            return price;
        }

        
        
    }
}
