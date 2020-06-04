package asm.com.fasterxml.jackson.databind.deser.impl;
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
public class PropertyValueDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "com/fasterxml/jackson/databind/deser/impl/PropertyValue", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/deser/impl/PropertyValue$Map", "com/fasterxml/jackson/databind/deser/impl/PropertyValue", "Map", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/deser/impl/PropertyValue$Any", "com/fasterxml/jackson/databind/deser/impl/PropertyValue", "Any", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/deser/impl/PropertyValue$Regular", "com/fasterxml/jackson/databind/deser/impl/PropertyValue", "Regular", ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "next", "Lcom/fasterxml/jackson/databind/deser/impl/PropertyValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "value", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lcom/fasterxml/jackson/databind/deser/impl/PropertyValue;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/deser/impl/PropertyValue", "next", "Lcom/fasterxml/jackson/databind/deser/impl/PropertyValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/deser/impl/PropertyValue", "value", "Ljava/lang/Object;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "assign", "(Ljava/lang/Object;)V", null, new String[] { "java/io/IOException", "com/fasterxml/jackson/core/JsonProcessingException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
