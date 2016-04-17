package jp.co.sample.framework.core.convert.support;

import java.util.HashSet;
import java.util.Set;

import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.GenericConverter;

import jp.co.sample.framework.web.bind.annotation.ComplexAndEncryption;

public class ComplexAndEncryptionConverter implements GenericConverter {

	/**
	 *
	 * {@inheritDoc}
	 * @see org.springframework.core.convert.converter.GenericConverter#getConvertibleTypes()
	 */
	@Override
	public Set<ConvertiblePair> getConvertibleTypes() {
		
		Set<ConvertiblePair> result = new HashSet<>(1);
		
		ConvertiblePair pair = new ConvertiblePair(String.class, String.class);
		
		result.add(pair);
		
		return result;
	}

	/**
	 *
	 * {@inheritDoc}
	 * @see org.springframework.core.convert.converter.GenericConverter#convert(java.lang.Object, org.springframework.core.convert.TypeDescriptor, org.springframework.core.convert.TypeDescriptor)
	 */
	@Override
	public Object convert(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
		
		if (targetType.hasAnnotation(ComplexAndEncryption.class)) {
			
			
			
		}
		
		return null;
	}
}
