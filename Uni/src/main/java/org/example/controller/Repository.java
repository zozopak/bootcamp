package org.example.controller;

import java.util.List;

public interface Repository<T ,ID> {
  List<T> findAll();
  T findOne(ID id);
  void save(T t);
   void update(T t);

}
