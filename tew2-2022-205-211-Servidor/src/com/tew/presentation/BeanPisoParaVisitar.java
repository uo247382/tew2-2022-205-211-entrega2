package com.tew.presentation;

import java.io.Serializable;
import java.util.ResourceBundle;

import javax.faces.bean.*;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import com.tew.model.Piso;
import com.tew.model.PisoParaVisitar;

@ManagedBean(name="PisoParaVisitar")
@SessionScoped
public class BeanPisoParaVisitar extends PisoParaVisitar implements Serializable {
	private static final long serialVersionUID = 55556L;
	
	public BeanPisoParaVisitar() {
		iniciaPisoParaVisitar(null);
	}
//Este método es necesario para copiar el Piso a editar cuando
//se pincha el enlace Editar en la vista listado.xhtml. Podría sustituirse 
//por un método editar en BeanPisos.
	public void setPisoParaVisitar(PisoParaVisitar piso) {
		setP(piso.getP());
		setC(piso.getC());
		setFechaHoraCita(piso.getFechaHoraCita());
		setEstado(piso.getEstado());
	
		
	}
//Iniciamos los datos del Piso con los valores por defecto 
//extraídos del archivo de propiedades correspondiente
    public void iniciaPisoParaVisitar(ActionEvent event) {
	    FacesContext facesContext = FacesContext.getCurrentInstance();
    	    ResourceBundle bundle = 
 	        facesContext.getApplication().getResourceBundle(facesContext, "msgs");
    	    setP(null);
    	    setC(new Long(3));
    	    setFechaHoraCita(0L);
    	    setEstado(1);
	  }	      
}
