package com.poli.taller1.services;


/**
 * Encargado de recibir una entrada y devolver una salida
 * con la finalidad de adaptar una estructura grande en una
 * solo con lo necesario
 *
 * @param <I> Entrada
 * @param <O> Salida
 */
public interface IMapper<I, O> {
    public O map(I in);
}
