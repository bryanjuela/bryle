package es.bryle.digital.profesional.model.mapper;

import org.springframework.stereotype.Service;

import es.bryle.digital.profesional.model.entities.Sale;
import es.bryle.digital.profesional.model.vo.SaleVO;

@Service
public class SaleVOMapper {

	public SaleVO mapper(Sale source) {
		return mapper(source, new SaleVO());
	}

	public SaleVO mapper(Sale source, SaleVO target) {
		if(source.getId()!= null) {
			target.setId(source.getId());
		}
		
		if(source.getProfessional()!= null) {
			target.setProfessional(source.getProfessional().getId().toString());
		}
	
		if(source.getCar()!= null) {
			target.setCar(source.getCar().getId().toString());
		}
		
		if(source.getSaleDate()!= null) {
			//target.setSaleDate(source.getSaleDate().toString());
		}
		
		if(source.getPrice()!= null)
			target.setPrice(source.getPrice());
			
		return target;
	}
}
