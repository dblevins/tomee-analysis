package asm.org.apache.bval.jsr.valueextraction;
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
public class OptionalExtractor$ForObjectDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/bval/jsr/valueextraction/OptionalExtractor$ForObject", "Ljava/lang/Object;Ljavax/validation/valueextraction/ValueExtractor<Ljava/util/Optional<*>;>;", "java/lang/Object", new String[] { "javax/validation/valueextraction/ValueExtractor" });

{
annotationVisitor0 = classWriter.visitTypeAnnotation(268435456, TypePath.fromString("0;0;"), "Ljavax/validation/valueextraction/ExtractedValue;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/bval/jsr/valueextraction/OptionalExtractor$ForObject", "org/apache/bval/jsr/valueextraction/OptionalExtractor", "ForObject", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("javax/validation/valueextraction/ValueExtractor$ValueReceiver", "javax/validation/valueextraction/ValueExtractor", "ValueReceiver", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "extractValues", "(Ljava/util/Optional;Ljavax/validation/valueextraction/ValueExtractor$ValueReceiver;)V", "(Ljava/util/Optional<*>;Ljavax/validation/valueextraction/ValueExtractor$ValueReceiver;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "orElse", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/valueextraction/ValueExtractor$ValueReceiver", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "extractValues", "(Ljava/lang/Object;Ljavax/validation/valueextraction/ValueExtractor$ValueReceiver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Optional");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/valueextraction/OptionalExtractor$ForObject", "extractValues", "(Ljava/util/Optional;Ljavax/validation/valueextraction/ValueExtractor$ValueReceiver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
