package ru.sbrf.efx.entrypoint;

import ru.sbrf.efx.Hello;

import ru.sbrf.Data;

import java.util.Properties;

public class Main {

    public Main(final Properties props)
    {
        System.out.println(props);
    }

    public static void main(final String[] args)
    {
        new Hello().sayHello();
        System.out.println(new Data(1, 2));
    }

    public int fewArgsMethod(
        final int a,
        final int b,
        final int c)
    {
        return a + b + c;
    }
}
