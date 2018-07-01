/**
 * 
 */
package com.cricket.cricketscorerapp.wicket.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.cricketscorerapp.delivery.service.DeliveryService;
import com.cricket.cricketscorerapp.wicket.domain.Wicket;
import com.cricket.cricketscorerapp.wicket.repository.WicketRepository;

/**
 * @author Audumbar Nevarekar
 *
 */
@Service
public class WicketServiceImpl implements WicketService {

	@Autowired
	WicketRepository wicketRepository;

	@Autowired
	DeliveryService deliveryService;
	/* (non-Javadoc)
	 * @see com.cricket.cricketscorerapp.wicket.service.WicketService#addWicket(com.cricket.cricketscorerapp.wicket.domain.Wicket)
	 */
	@Override
	public Wicket addWicket(Wicket wicket) {
		wicket.setCreatedOn(new Date());
		wicket.setModifiedOn(new Date());
		
		Wicket savedEntity = wicketRepository.save(wicket);
		//add wicket to this delivery
		//deliveryService.updateDelivery();
		return savedEntity;
	}
	
	public Wicket getWicket(String wicketId) {
		return (wicketRepository.findById(wicketId)).get();
	}
}
