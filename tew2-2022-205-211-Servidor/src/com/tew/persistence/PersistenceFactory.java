package com.tew.persistence;

import com.tew.model.PisoParaVisitar;
import com.tew.persistence.PisoDao;

/**
 * Interfaz de la factoria que suministra implementaciones reales de la fachada 
 * de persistencia para cada Entidad del Modelo (en este caso solo hay 
 * una: Alumno; pero en futuras versiones habr�� m��s)
 *  
 * @author alb
 *
 */
public interface PersistenceFactory {
	
	PisoDao createPisoDao();
	ClienteDao createClienteDao();
	// ... otros m��todos factoria para Daos de otras entidades del modelo ...
	AgenteDao createAgenteDao();
	PisosParaVisitarDao createPisoParaVisitarDao();
	ReiniciarDataBaseDao reiniciar();
}

