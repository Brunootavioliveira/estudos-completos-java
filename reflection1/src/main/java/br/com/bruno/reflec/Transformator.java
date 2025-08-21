package br.com.bruno.reflec;

public class Transformator {
    //I: input/entrada
    //O: output/saida

    public <I, O> transform(I input) throws ClassNotFoundException {    //transformar para DTO qualquer tipo/classe, usando API GENERICS
        Class<?> source = input.getClass();
        Class<?> target = source. forName(source.getClass() + "DTO");
    }
}
