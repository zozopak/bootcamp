package org.example.controller;

import java.util.List;

public interface Observer <T extends Observable>{
   void updat(T observable);

}
