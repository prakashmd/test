/**
 * 
 */
package com.anthem.tat.jasonutil;

import java.io.IOException;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * @author AF43847
 *
 */
public class CustomDateSerializer extends JsonSerializer<LocalDate> {

	private static DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.fasterxml.jackson.databind.JsonSerializer#serialize(java.lang.Object,
	 * com.fasterxml.jackson.core.JsonGenerator,
	 * com.fasterxml.jackson.databind.SerializerProvider)
	 */
	@Override
	public void serialize(LocalDate value, JsonGenerator gen, SerializerProvider arg2)
			throws IOException, JsonProcessingException {
		// TODO Auto-generated method stub
		System.out.println("Date from Custom date serializer =" + value);
		gen.writeString(formatter.print(value));

	}

}