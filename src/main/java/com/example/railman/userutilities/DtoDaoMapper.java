package com.example.railman.userutilities;

public interface DtoDaoMapper<D,E> {
    D toEntity(E e);

}
