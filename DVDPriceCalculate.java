
/**
 * 여기에 DVDPriceCalculate 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class DVDPriceCalculate
{
    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     * 
     * @param  y   메소드의 예제 매개변수
     * @return     x 더하기 y 
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
