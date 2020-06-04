package asm.com.fasterxml.jackson.databind;
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
public class PropertyNamingStrategyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "com/fasterxml/jackson/databind/PropertyNamingStrategy", null, "java/lang/Object", new String[] { "java/io/Serializable" });

classWriter.visitInnerClass("com/fasterxml/jackson/databind/PropertyNamingStrategy$PascalCaseStrategy", "com/fasterxml/jackson/databind/PropertyNamingStrategy", "PascalCaseStrategy", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy", "com/fasterxml/jackson/databind/PropertyNamingStrategy", "LowerCaseWithUnderscoresStrategy", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/PropertyNamingStrategy$LowerDotCaseStrategy", "com/fasterxml/jackson/databind/PropertyNamingStrategy", "LowerDotCaseStrategy", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/PropertyNamingStrategy$KebabCaseStrategy", "com/fasterxml/jackson/databind/PropertyNamingStrategy", "KebabCaseStrategy", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/PropertyNamingStrategy$LowerCaseStrategy", "com/fasterxml/jackson/databind/PropertyNamingStrategy", "LowerCaseStrategy", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/PropertyNamingStrategy$UpperCamelCaseStrategy", "com/fasterxml/jackson/databind/PropertyNamingStrategy", "UpperCamelCaseStrategy", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/PropertyNamingStrategy$SnakeCaseStrategy", "com/fasterxml/jackson/databind/PropertyNamingStrategy", "SnakeCaseStrategy", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/PropertyNamingStrategy$PropertyNamingStrategyBase", "com/fasterxml/jackson/databind/PropertyNamingStrategy", "PropertyNamingStrategyBase", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SNAKE_CASE", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPPER_CAMEL_CASE", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LOWER_CAMEL_CASE", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LOWER_CASE", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEBAB_CASE", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LOWER_DOT_CASE", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "PASCAL_CASE_TO_CAMEL_CASE", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nameForField", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;Ljava/lang/String;)Ljava/lang/String;", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfig<*>;Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;Ljava/lang/String;)Ljava/lang/String;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nameForGetterMethod", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;Ljava/lang/String;)Ljava/lang/String;", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfig<*>;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;Ljava/lang/String;)Ljava/lang/String;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nameForSetterMethod", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;Ljava/lang/String;)Ljava/lang/String;", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfig<*>;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;Ljava/lang/String;)Ljava/lang/String;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nameForConstructorParameter", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;Ljava/lang/String;)Ljava/lang/String;", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfig<*>;Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;Ljava/lang/String;)Ljava/lang/String;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/PropertyNamingStrategy$SnakeCaseStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/PropertyNamingStrategy$SnakeCaseStrategy", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/PropertyNamingStrategy", "SNAKE_CASE", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/PropertyNamingStrategy$UpperCamelCaseStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/PropertyNamingStrategy$UpperCamelCaseStrategy", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/PropertyNamingStrategy", "UPPER_CAMEL_CASE", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/PropertyNamingStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/PropertyNamingStrategy", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/PropertyNamingStrategy", "LOWER_CAMEL_CASE", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/PropertyNamingStrategy$LowerCaseStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/PropertyNamingStrategy$LowerCaseStrategy", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/PropertyNamingStrategy", "LOWER_CASE", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/PropertyNamingStrategy$KebabCaseStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/PropertyNamingStrategy$KebabCaseStrategy", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/PropertyNamingStrategy", "KEBAB_CASE", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/PropertyNamingStrategy$LowerDotCaseStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/PropertyNamingStrategy$LowerDotCaseStrategy", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/PropertyNamingStrategy", "LOWER_DOT_CASE", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/PropertyNamingStrategy", "SNAKE_CASE", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/PropertyNamingStrategy", "CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/PropertyNamingStrategy", "UPPER_CAMEL_CASE", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/PropertyNamingStrategy", "PASCAL_CASE_TO_CAMEL_CASE", "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
