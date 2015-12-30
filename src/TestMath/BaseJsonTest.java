package TestMath;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public class  BaseJsonTest<T> {

	public T  getJsonBean(){
		T t = null;

//		Method method = this.getClass().getMethod("applyGetTpye",ArrayList.class); 
//
//		ParameterizedType parameterType = (ParameterizedType)method.getGenericParameterTypes()[0]; 
//
//		System.out.println(parameterType.getRawType()); 
//
//		System.out.println(parameterType.getActualTypeArguments()[0]); 

		
//		Class<? extends BaseJsonTest> class1 = this.getClass();
//		TypeVariable<?>[] typeParameters = class1.getTypeParameters();
		
		Type type = this.getClass().getGenericSuperclass();
		System.out.println("==============");
		Type trueType = ((ParameterizedType) type).getActualTypeArguments()[0];
		System.out.println("=============="+trueType);
		
		return t ;
	}
}
