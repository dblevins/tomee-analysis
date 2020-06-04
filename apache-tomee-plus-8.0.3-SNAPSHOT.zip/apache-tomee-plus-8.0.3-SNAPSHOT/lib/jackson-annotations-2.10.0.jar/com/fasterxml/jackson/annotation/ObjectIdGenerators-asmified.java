package asm.com.fasterxml.jackson.annotation;
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
public class ObjectIdGeneratorsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "com/fasterxml/jackson/annotation/ObjectIdGenerators", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/fasterxml/jackson/annotation/ObjectIdGenerators$StringIdGenerator", "com/fasterxml/jackson/annotation/ObjectIdGenerators", "StringIdGenerator", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/annotation/ObjectIdGenerators$UUIDGenerator", "com/fasterxml/jackson/annotation/ObjectIdGenerators", "UUIDGenerator", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/annotation/ObjectIdGenerators$IntSequenceGenerator", "com/fasterxml/jackson/annotation/ObjectIdGenerators", "IntSequenceGenerator", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/annotation/ObjectIdGenerators$PropertyGenerator", "com/fasterxml/jackson/annotation/ObjectIdGenerators", "PropertyGenerator", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("com/fasterxml/jackson/annotation/ObjectIdGenerators$None", "com/fasterxml/jackson/annotation/ObjectIdGenerators", "None", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("com/fasterxml/jackson/annotation/ObjectIdGenerators$Base", "com/fasterxml/jackson/annotation/ObjectIdGenerators", "Base", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
