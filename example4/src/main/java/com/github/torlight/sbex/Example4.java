package com.github.torlight.sbex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Example4 {
	
	private static final Logger logger=LoggerFactory.getLogger(Example4.class);
	
	public static void main(String[] args) {
        //PO转DTO
        PeopleEntity peopleEntity = new PeopleEntity(18, "yoyo", "13215849",
                "shanghai ", "fdhf@163.com");
        
        PeopleDTO peopleDTO = PeopleMapper.INSTANCE.entityToDTO(peopleEntity);

        //DTO转PO
        User user = new User(21, "jack");
        PeopleDTO newP = new PeopleDTO("000000","changsha ", "jack@163.com", user);
        PeopleEntity newEntity = new PeopleEntity();
        PeopleMapper.INSTANCE.updateEntityFromDto(newP, newEntity);


        logger.info("PO转DTO peopleEntity==>" + peopleEntity.toString() + "\n peopleDTO==>" + peopleDTO.toString());
        logger.info("DTO转PO PeopleDTO==>" + newP.toString() + "\n peopleDTO==>" + newEntity.toString());		
				
	}

}
