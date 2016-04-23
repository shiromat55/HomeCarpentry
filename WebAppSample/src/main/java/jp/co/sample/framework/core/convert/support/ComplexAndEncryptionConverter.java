package jp.co.sample.framework.core.convert.support;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Description;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.GenericConverter;

import jp.co.sample.framework.format.annotation.ComplexAndEncryption;

/**
 * 【複合化・暗号化】Converter
 *
 * @see ComplexAndEncryptionConverter
 * @author shiromat55
 *
 */
@Description("個人的にはFormatterの方が分かり易いので非推奨！！")
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

			return "複：" + source + "：複";

		} else if (sourceType.hasAnnotation(ComplexAndEncryption.class)) {
			// ■レスポンス ← Model

			return "暗：" + source + "：暗";

		}

		return source;
	}
}
