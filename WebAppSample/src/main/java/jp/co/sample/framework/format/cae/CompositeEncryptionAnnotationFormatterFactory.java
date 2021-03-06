package jp.co.sample.framework.format.cae;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Parser;
import org.springframework.format.Printer;

import jp.co.sample.framework.format.annotation.CompositeEncryption;

/**
 * 【複合化・暗号化】FormatterFactory
 *
 * @see CompositeEncryptionAnnotationFormatterFactory
 * @author shiromat55
 *
 */
public class CompositeEncryptionAnnotationFormatterFactory implements AnnotationFormatterFactory<CompositeEncryption> {

	/** 対象フィールド型 */
	private static final Set<Class<?>> TARGET_FIELD_TYPES;
	static {
		Set<Class<?>> formatTypes = new HashSet<>(1);
		formatTypes.add(String.class);
		TARGET_FIELD_TYPES = Collections.unmodifiableSet(formatTypes);
	}

	/**
	 *
	 * {@inheritDoc}
	 * @see org.springframework.format.AnnotationFormatterFactory#getFieldTypes()
	 */
	@Override
	public Set<Class<?>> getFieldTypes() {

		return TARGET_FIELD_TYPES;
	}

	/**
	 *
	 * {@inheritDoc}
	 * @see org.springframework.format.AnnotationFormatterFactory#getPrinter(java.lang.annotation.Annotation, java.lang.Class)
	 */
	@Override
	public Printer<String> getPrinter(CompositeEncryption annotation, Class<?> fieldType) {

		return new CompositeEncryptionFormatter();
	}

	/**
	 *
	 * {@inheritDoc}
	 * @see org.springframework.format.AnnotationFormatterFactory#getParser(java.lang.annotation.Annotation, java.lang.Class)
	 */
	@Override
	public Parser<String> getParser(CompositeEncryption annotation, Class<?> fieldType) {

		return new CompositeEncryptionFormatter();
	}
}
