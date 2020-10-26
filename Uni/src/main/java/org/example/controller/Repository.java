package org.example.controller;

import java.util.List;

public interface Repository<T ,ID> {
  List<T> findAll();
  T findOne(ID id);
  T save(ID id);
   void update(T t);

}
