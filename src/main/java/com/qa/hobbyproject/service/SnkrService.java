package com.qa.hobbyproject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.qa.hobbyproject.domain.SneakerDom;

@Service

public class SnkrService {
	
	// list for storing data without db
		private List<SneakerDom> sneakers = new ArrayList<>();
		
		
		//create
		public SneakerDom createSneaker(SneakerDom s) {
			this.sneakers.add(s);
			// get sneaker from list by index in a var called created
			SneakerDom created = this.sneakers.get(this.sneakers.size() - 1);
			return created;
		}
		
		
		//get all
		public List<SneakerDom> getAllSnkrs() {
			return this.sneakers;
		}
		
		//get one
		public SneakerDom getSnkr(Integer id) {
			return this.sneakers.get(id);
		}
		
		//update
		public SneakerDom replaceSnkr(Integer id, SneakerDom repSnkr) {
			SneakerDom body = this.sneakers.set(id, repSnkr);
			return body;
		}
		
		//delete
		public void removeSnkr(@PathVariable Integer id) {
			this.sneakers.remove(id.intValue());
			
		}
}
