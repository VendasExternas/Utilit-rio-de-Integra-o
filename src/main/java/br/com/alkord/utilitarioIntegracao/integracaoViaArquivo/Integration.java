package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo;

import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

@SuppressWarnings("unchecked")
public abstract class Integration {

	public abstract String processIntegration(String[] args) throws Exception;

	void processCSV(HashMap<String, String> registerFields, Object object)
			throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException,
			ClassNotFoundException, InstantiationException {
		for (String index : registerFields.keySet()) {
			if (StringUtils.isBlank(registerFields.get(index)))
				continue;

			ArrayList<String> fields = new ArrayList<>();
			Collections.addAll(fields, index.split("\\."));

			String field = fields.remove(0);

			if (object.getClass().getDeclaredField(field).getType().getName().equals(ArrayList.class.getName()))
				processArray(object, fields, field, registerFields.get(index));
			else if (!object.getClass().getDeclaredField(field).getType().getName().equals(String.class.getName()))
				processObject(fields, field, object, registerFields.get(index));
			else
				object.getClass().getDeclaredMethod("set" + field, String.class).invoke(object, registerFields.get(index));
		}
	}

	private void processArray(Object objectSuper, ArrayList<String> fields, String field, String value)
			throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException,
			NoSuchMethodException, InvocationTargetException {
		if (objectSuper.getClass().getDeclaredMethod("get" + field).invoke(objectSuper) == null)
			objectSuper.getClass().getDeclaredMethod("set" + field, objectSuper.getClass().getDeclaredField(field).getType())
					.invoke(objectSuper, Class.forName(objectSuper.getClass().getDeclaredField(field).getType().getName()).newInstance());

		ArrayList<Object> objectsList = (ArrayList<Object>) objectSuper.getClass()
				.getDeclaredMethod("get" + field).invoke(objectSuper);

		Object object;

		if (objectsList.isEmpty()) {
			object = Class.forName(((ParameterizedType) objectSuper.getClass().getDeclaredField(field).getGenericType())
					.getActualTypeArguments()[0].getTypeName()).newInstance();
			objectsList.add(object);
		}
		else
			object = objectsList.get(0);

		if (object.getClass().getDeclaredField(fields.get(0)).getType().getName().equals(String.class.getName()))
			processValue(fields, object, value);
		else
			processObject(fields, fields.remove(0), object, value);
	}

	private void processObject(ArrayList<String> fields, String field, Object objectSuper, String value)
			throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException,
			ClassNotFoundException, InstantiationException {
		Object object = objectSuper.getClass().getDeclaredMethod("get" + field).invoke(objectSuper);

		if (object == null) {
			object = Class.forName(objectSuper.getClass().getDeclaredField(field).getType().getName()).newInstance();
			objectSuper.getClass().getDeclaredMethod("set" + field, objectSuper.getClass().getDeclaredField(field).getType())
					.invoke(objectSuper, object);
		}

		if (object.getClass().getDeclaredField(fields.get(0)).getType().getName().equals(String.class.getName()))
			processValue(fields, object, value);
		else
			processObject(fields, fields.remove(0), object, value);
	}

	private void processValue(ArrayList<String> fields, Object object, String value)
			throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		object.getClass().getDeclaredMethod("set" + fields.remove(0), String.class).invoke(object, value);
	}
}
