package com.bolsadeideas.springboot.di.app.springbootdi.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
//@Component("miServicioSimple")
public class MiServicio implements IServicio{
    
    @Override
    public String operacion(){
        return "ejecutando algún proceso importante simple...";
    }
}
