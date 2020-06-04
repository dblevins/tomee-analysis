package asm.com.fasterxml.jackson.databind.cfg;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class BaseSettingsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "com/fasterxml/jackson/databind/cfg/BaseSettings", null, "java/lang/Object", new String[] { "java/io/Serializable" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DEFAULT_TIMEZONE", "Ljava/util/TimeZone;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_classIntrospector", "Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_annotationIntrospector", "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_propertyNamingStrategy", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_typeFactory", "Lcom/fasterxml/jackson/databind/type/TypeFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_typeResolverBuilder", "Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;", "Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_typeValidator", "Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_dateFormat", "Ljava/text/DateFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_handlerInstantiator", "Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_locale", "Ljava/util/Locale;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_timeZone", "Ljava/util/TimeZone;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_defaultBase64", "Lcom/fasterxml/jackson/core/Base64Variant;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;Ljava/text/DateFormat;Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;Ljava/util/Locale;Ljava/util/TimeZone;Lcom/fasterxml/jackson/core/Base64Variant;Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;)V", "(Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder<*>;Ljava/text/DateFormat;Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;Ljava/util/Locale;Ljava/util/TimeZone;Lcom/fasterxml/jackson/core/Base64Variant;Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_classIntrospector", "Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_annotationIntrospector", "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_propertyNamingStrategy", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeFactory", "Lcom/fasterxml/jackson/databind/type/TypeFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeResolverBuilder", "Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_dateFormat", "Ljava/text/DateFormat;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_handlerInstantiator", "Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_locale", "Ljava/util/Locale;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_timeZone", "Ljava/util/TimeZone;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_defaultBase64", "Lcom/fasterxml/jackson/core/Base64Variant;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeValidator", "Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 12);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_DEPRECATED, "<init>", "(Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;Ljava/text/DateFormat;Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;Ljava/util/Locale;Ljava/util/TimeZone;Lcom/fasterxml/jackson/core/Base64Variant;)V", "(Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder<*>;Ljava/text/DateFormat;Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;Ljava/util/Locale;Ljava/util/TimeZone;Lcom/fasterxml/jackson/core/Base64Variant;)V", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "<init>", "(Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;Ljava/text/DateFormat;Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;Ljava/util/Locale;Ljava/util/TimeZone;Lcom/fasterxml/jackson/core/Base64Variant;Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(12, 11);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "copy", "()Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/cfg/BaseSettings");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_classIntrospector", "Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/introspect/ClassIntrospector", "copy", "()Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_annotationIntrospector", "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_propertyNamingStrategy", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeFactory", "Lcom/fasterxml/jackson/databind/type/TypeFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeResolverBuilder", "Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_dateFormat", "Ljava/text/DateFormat;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_handlerInstantiator", "Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_locale", "Ljava/util/Locale;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_timeZone", "Ljava/util/TimeZone;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_defaultBase64", "Lcom/fasterxml/jackson/core/Base64Variant;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeValidator", "Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "<init>", "(Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;Ljava/text/DateFormat;Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;Ljava/util/Locale;Ljava/util/TimeZone;Lcom/fasterxml/jackson/core/Base64Variant;Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(13, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withClassIntrospector", "(Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_classIntrospector", "Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/cfg/BaseSettings");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_annotationIntrospector", "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_propertyNamingStrategy", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeFactory", "Lcom/fasterxml/jackson/databind/type/TypeFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeResolverBuilder", "Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_dateFormat", "Ljava/text/DateFormat;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_handlerInstantiator", "Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_locale", "Ljava/util/Locale;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_timeZone", "Ljava/util/TimeZone;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_defaultBase64", "Lcom/fasterxml/jackson/core/Base64Variant;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeValidator", "Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "<init>", "(Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;Ljava/text/DateFormat;Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;Ljava/util/Locale;Ljava/util/TimeZone;Lcom/fasterxml/jackson/core/Base64Variant;Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(13, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withAnnotationIntrospector", "(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_annotationIntrospector", "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/cfg/BaseSettings");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_classIntrospector", "Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_propertyNamingStrategy", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeFactory", "Lcom/fasterxml/jackson/databind/type/TypeFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeResolverBuilder", "Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_dateFormat", "Ljava/text/DateFormat;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_handlerInstantiator", "Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_locale", "Ljava/util/Locale;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_timeZone", "Ljava/util/TimeZone;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_defaultBase64", "Lcom/fasterxml/jackson/core/Base64Variant;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeValidator", "Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "<init>", "(Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;Ljava/text/DateFormat;Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;Ljava/util/Locale;Ljava/util/TimeZone;Lcom/fasterxml/jackson/core/Base64Variant;Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(13, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withInsertedAnnotationIntrospector", "(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_annotationIntrospector", "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/databind/introspect/AnnotationIntrospectorPair", "create", "(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)Lcom/fasterxml/jackson/databind/AnnotationIntrospector;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "withAnnotationIntrospector", "(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withAppendedAnnotationIntrospector", "(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_annotationIntrospector", "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/databind/introspect/AnnotationIntrospectorPair", "create", "(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)Lcom/fasterxml/jackson/databind/AnnotationIntrospector;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "withAnnotationIntrospector", "(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withPropertyNamingStrategy", "(Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_propertyNamingStrategy", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/cfg/BaseSettings");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_classIntrospector", "Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_annotationIntrospector", "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeFactory", "Lcom/fasterxml/jackson/databind/type/TypeFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeResolverBuilder", "Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_dateFormat", "Ljava/text/DateFormat;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_handlerInstantiator", "Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_locale", "Ljava/util/Locale;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_timeZone", "Ljava/util/TimeZone;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_defaultBase64", "Lcom/fasterxml/jackson/core/Base64Variant;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeValidator", "Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "<init>", "(Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;Ljava/text/DateFormat;Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;Ljava/util/Locale;Ljava/util/TimeZone;Lcom/fasterxml/jackson/core/Base64Variant;Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(13, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withTypeFactory", "(Lcom/fasterxml/jackson/databind/type/TypeFactory;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeFactory", "Lcom/fasterxml/jackson/databind/type/TypeFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/cfg/BaseSettings");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_classIntrospector", "Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_annotationIntrospector", "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_propertyNamingStrategy", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeResolverBuilder", "Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_dateFormat", "Ljava/text/DateFormat;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_handlerInstantiator", "Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_locale", "Ljava/util/Locale;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_timeZone", "Ljava/util/TimeZone;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_defaultBase64", "Lcom/fasterxml/jackson/core/Base64Variant;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeValidator", "Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "<init>", "(Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;Ljava/text/DateFormat;Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;Ljava/util/Locale;Ljava/util/TimeZone;Lcom/fasterxml/jackson/core/Base64Variant;Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(13, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withTypeResolverBuilder", "(Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", "(Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder<*>;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeResolverBuilder", "Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/cfg/BaseSettings");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_classIntrospector", "Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_annotationIntrospector", "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_propertyNamingStrategy", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeFactory", "Lcom/fasterxml/jackson/databind/type/TypeFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_dateFormat", "Ljava/text/DateFormat;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_handlerInstantiator", "Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_locale", "Ljava/util/Locale;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_timeZone", "Ljava/util/TimeZone;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_defaultBase64", "Lcom/fasterxml/jackson/core/Base64Variant;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeValidator", "Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "<init>", "(Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;Ljava/text/DateFormat;Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;Ljava/util/Locale;Ljava/util/TimeZone;Lcom/fasterxml/jackson/core/Base64Variant;Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(13, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withDateFormat", "(Ljava/text/DateFormat;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_dateFormat", "Ljava/text/DateFormat;");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "hasExplicitTimeZone", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_timeZone", "Ljava/util/TimeZone;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_force", "(Ljava/text/DateFormat;Ljava/util/TimeZone;)Ljava/text/DateFormat;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/cfg/BaseSettings");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_classIntrospector", "Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_annotationIntrospector", "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_propertyNamingStrategy", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeFactory", "Lcom/fasterxml/jackson/databind/type/TypeFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeResolverBuilder", "Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_handlerInstantiator", "Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_locale", "Ljava/util/Locale;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_timeZone", "Ljava/util/TimeZone;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_defaultBase64", "Lcom/fasterxml/jackson/core/Base64Variant;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeValidator", "Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "<init>", "(Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;Ljava/text/DateFormat;Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;Ljava/util/Locale;Ljava/util/TimeZone;Lcom/fasterxml/jackson/core/Base64Variant;Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(13, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withHandlerInstantiator", "(Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_handlerInstantiator", "Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/cfg/BaseSettings");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_classIntrospector", "Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_annotationIntrospector", "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_propertyNamingStrategy", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeFactory", "Lcom/fasterxml/jackson/databind/type/TypeFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeResolverBuilder", "Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_dateFormat", "Ljava/text/DateFormat;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_locale", "Ljava/util/Locale;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_timeZone", "Ljava/util/TimeZone;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_defaultBase64", "Lcom/fasterxml/jackson/core/Base64Variant;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeValidator", "Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "<init>", "(Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;Ljava/text/DateFormat;Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;Ljava/util/Locale;Ljava/util/TimeZone;Lcom/fasterxml/jackson/core/Base64Variant;Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(13, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "with", "(Ljava/util/Locale;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_locale", "Ljava/util/Locale;");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/cfg/BaseSettings");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_classIntrospector", "Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_annotationIntrospector", "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_propertyNamingStrategy", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeFactory", "Lcom/fasterxml/jackson/databind/type/TypeFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeResolverBuilder", "Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_dateFormat", "Ljava/text/DateFormat;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_handlerInstantiator", "Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_timeZone", "Ljava/util/TimeZone;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_defaultBase64", "Lcom/fasterxml/jackson/core/Base64Variant;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeValidator", "Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "<init>", "(Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;Ljava/text/DateFormat;Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;Ljava/util/Locale;Ljava/util/TimeZone;Lcom/fasterxml/jackson/core/Base64Variant;Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(13, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "with", "(Ljava/util/TimeZone;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_timeZone", "Ljava/util/TimeZone;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_dateFormat", "Ljava/text/DateFormat;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_force", "(Ljava/text/DateFormat;Ljava/util/TimeZone;)Ljava/text/DateFormat;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/cfg/BaseSettings");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_classIntrospector", "Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_annotationIntrospector", "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_propertyNamingStrategy", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeFactory", "Lcom/fasterxml/jackson/databind/type/TypeFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeResolverBuilder", "Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_handlerInstantiator", "Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_locale", "Ljava/util/Locale;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_defaultBase64", "Lcom/fasterxml/jackson/core/Base64Variant;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeValidator", "Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "<init>", "(Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;Ljava/text/DateFormat;Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;Ljava/util/Locale;Ljava/util/TimeZone;Lcom/fasterxml/jackson/core/Base64Variant;Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(13, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "with", "(Lcom/fasterxml/jackson/core/Base64Variant;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_defaultBase64", "Lcom/fasterxml/jackson/core/Base64Variant;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/cfg/BaseSettings");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_classIntrospector", "Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_annotationIntrospector", "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_propertyNamingStrategy", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeFactory", "Lcom/fasterxml/jackson/databind/type/TypeFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeResolverBuilder", "Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_dateFormat", "Ljava/text/DateFormat;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_handlerInstantiator", "Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_locale", "Ljava/util/Locale;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_timeZone", "Ljava/util/TimeZone;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeValidator", "Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "<init>", "(Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;Ljava/text/DateFormat;Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;Ljava/util/Locale;Ljava/util/TimeZone;Lcom/fasterxml/jackson/core/Base64Variant;Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(13, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "with", "(Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeValidator", "Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/cfg/BaseSettings");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_classIntrospector", "Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_annotationIntrospector", "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_propertyNamingStrategy", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeFactory", "Lcom/fasterxml/jackson/databind/type/TypeFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeResolverBuilder", "Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_dateFormat", "Ljava/text/DateFormat;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_handlerInstantiator", "Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_locale", "Ljava/util/Locale;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_timeZone", "Ljava/util/TimeZone;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_defaultBase64", "Lcom/fasterxml/jackson/core/Base64Variant;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "<init>", "(Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;Ljava/text/DateFormat;Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;Ljava/util/Locale;Ljava/util/TimeZone;Lcom/fasterxml/jackson/core/Base64Variant;Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(13, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClassIntrospector", "()Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_classIntrospector", "Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotationIntrospector", "()Lcom/fasterxml/jackson/databind/AnnotationIntrospector;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_annotationIntrospector", "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPropertyNamingStrategy", "()Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_propertyNamingStrategy", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTypeFactory", "()Lcom/fasterxml/jackson/databind/type/TypeFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeFactory", "Lcom/fasterxml/jackson/databind/type/TypeFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTypeResolverBuilder", "()Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;", "()Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeResolverBuilder", "Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPolymorphicTypeValidator", "()Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_typeValidator", "Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDateFormat", "()Ljava/text/DateFormat;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_dateFormat", "Ljava/text/DateFormat;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHandlerInstantiator", "()Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_handlerInstantiator", "Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLocale", "()Ljava/util/Locale;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_locale", "Ljava/util/Locale;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTimeZone", "()Ljava/util/TimeZone;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_timeZone", "Ljava/util/TimeZone;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/cfg/BaseSettings", "DEFAULT_TIMEZONE", "Ljava/util/TimeZone;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/TimeZone"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/util/TimeZone"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasExplicitTimeZone", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_timeZone", "Ljava/util/TimeZone;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBase64Variant", "()Lcom/fasterxml/jackson/core/Base64Variant;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/BaseSettings", "_defaultBase64", "Lcom/fasterxml/jackson/core/Base64Variant;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "_force", "(Ljava/text/DateFormat;Ljava/util/TimeZone;)Ljava/text/DateFormat;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "com/fasterxml/jackson/databind/util/StdDateFormat");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/databind/util/StdDateFormat");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/util/StdDateFormat", "withTimeZone", "(Ljava/util/TimeZone;)Lcom/fasterxml/jackson/databind/util/StdDateFormat;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/text/DateFormat", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/text/DateFormat");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/text/DateFormat", "setTimeZone", "(Ljava/util/TimeZone;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("UTC");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/TimeZone", "getTimeZone", "(Ljava/lang/String;)Ljava/util/TimeZone;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/cfg/BaseSettings", "DEFAULT_TIMEZONE", "Ljava/util/TimeZone;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
