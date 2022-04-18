package Lab5.Challenge1;

import java.lang.reflect.InvocationTargetException;

public class ExchangeDesk <F extends Currency, T extends Currency>{

    public T convert(F from, Class<T> toClass) throws NoSuchMethodException, InvocationTargetException, InstantiationException,
            IllegalAccessException {

        float value = from.getValue() * from.getRate();

        return toClass.getDeclaredConstructor(Float.class).newInstance(value);
    }
}
