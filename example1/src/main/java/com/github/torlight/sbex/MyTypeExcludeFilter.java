package com.github.torlight.sbex;

import java.io.IOException;

import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;


public class MyTypeExcludeFilter extends TypeExcludeFilter {

	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		
		if("com.github.torlight.sbex.User".equals(metadataReader.getClassMetadata().getClassName())){
			return true;
		}
		
		return false;
	}
	
}
