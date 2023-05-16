package andycpp;


public class Money
{
    private int fAmount;       //货币余额
    private String fCurrency;  //货币类型
    public Money(int amount, String currency)
    {
        fAmount=amount;
        fCurrency=currency;
    }
    public int amount()
    {
        return fAmount;
    }
    public String currency()
    {
        return fCurrency;
    }
    public Money add(Money m)  //add方法把两个Money对象相加，合成一个Money对象
    {
        return new Money(amount()+m.amount(),currency());
    }
    public boolean equals(Object anObject)  //equals方法判断两个Money对象是否相等
    {
        if(anObject instanceof Money)
        {
            Money aMoney=(Money)anObject;
            return aMoney.currency().equals(currency())&&amount()==aMoney.amount();
        }
        return false;
    }
}


