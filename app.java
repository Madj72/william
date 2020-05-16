package jsonProject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class app {

	public static void main(String[] args) {

		ObjectMapper objectMapper = new ObjectMapper();

		try {
			Employee[] myemployee = objectMapper.readValue(new File("employee.json"), Employee[].class);

			List<Object> employ = new ArrayList<>();
//			Collections.addAll(employ, myemployee);
//			System.out.println(myemployee[1].getId());
			int lengh = myemployee.length;
			List <Object> employeeList = new ArrayList <>();
			
			for(int i = 0; i<lengh ; i++){
				
			employeeList.add(new Employee(myemployee[i].getId(),myemployee[i].getName(),myemployee[i].getSalary()));	
				
				
				
			}
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
