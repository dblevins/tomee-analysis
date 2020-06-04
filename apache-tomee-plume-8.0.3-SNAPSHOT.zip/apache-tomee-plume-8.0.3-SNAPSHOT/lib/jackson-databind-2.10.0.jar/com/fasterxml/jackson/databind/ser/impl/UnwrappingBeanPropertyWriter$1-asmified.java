package asm.com.fasterxml.jackson.databind.ser.impl;
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
public class UnwrappingBeanPropertyWriter$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "com/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter$1", null, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatVisitorWrapper$Base", null);

classWriter.visitOuterClass("com/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter", "depositSchemaProperty", "(Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;Lcom/fasterxml/jackson/databind/SerializerProvider;)V");

classWriter.visitInnerClass("com/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter$1", null, null, 0);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatVisitorWrapper$Base", "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatVisitorWrapper", "Base", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$visitor", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter$1", "this$0", "Lcom/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter$1", "val$visitor", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatVisitorWrapper$Base", "<init>", "(Lcom/fasterxml/jackson/databind/SerializerProvider;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "expectObjectFormat", "(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;", null, new String[] { "com/fasterxml/jackson/databind/JsonMappingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter$1", "val$visitor", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
