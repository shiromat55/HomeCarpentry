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

		result.add(new ConvertiblePair(String.class, String.class));

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
			// ■リクエスト → Model

			final String print = "複合対象：source：%s、source.caeAnnotaion：%s、target.caeAnnotaion：%s";
			System.out.println(String.format(print, new Object[] { source, sourceType.hasAnnotation(ComplexAndEncryption.class), targetType.hasAnnotation(ComplexAndEncryption.class) }));

			return "複：" + source + "：複";

		} else if (sourceType.hasAnnotation(ComplexAndEncryption.class)) {
			// ■レスポンス ← Model

			final String print = "暗号対象：source：%s、source.caeAnnotaion：%s、target.caeAnnotaion：%s";
			System.out.println(String.format(print, new Object[] { source, sourceType.hasAnnotation(ComplexAndEncryption.class), targetType.hasAnnotation(ComplexAndEncryption.class) }));

			return "暗：" + source + "：暗";

		}

		return source;
	}
}
