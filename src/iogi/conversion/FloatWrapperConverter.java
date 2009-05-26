package iogi.conversion;

import iogi.reflection.Target;

public class FloatWrapperConverter extends TypeConverter<Float> {

	@Override
	public boolean isAbleToInstantiate(Target<?> target) {
		return target.getClassType() == Float.class;
	}
	
	@Override
	protected Float convert(String stringValue, Target<?> to) {
		return Float.valueOf(stringValue);
	}

}