package asm.org.apache.commons.collections.functors;
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
public class PrototypeFactory$PrototypeSerializationFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_3, ACC_SUPER, "org/apache/commons/collections/functors/PrototypeFactory$PrototypeSerializationFactory", null, "java/lang/Object", new String[] { "org/apache/commons/collections/Factory", "java/io/Serializable" });

classWriter.visitInnerClass("org/apache/commons/collections/functors/PrototypeFactory$PrototypeSerializationFactory", "org/apache/commons/collections/functors/PrototypeFactory", "PrototypeSerializationFactory", ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections/functors/PrototypeFactory$1", "org/apache/commons/collections/functors/PrototypeFactory", null, ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(-8704966966139178833L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "iPrototype", "Ljava/io/Serializable;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/io/Serializable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/functors/PrototypeFactory$PrototypeSerializationFactory", "iPrototype", "Ljava/io/Serializable;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "create", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/io/IOException");
Label label6 = new Label();
Label label7 = new Label();
methodVisitor.visitTryCatchBlock(label6, label0, label7, "java/lang/ClassNotFoundException");
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label6, label0, label8, "java/io/IOException");
Label label9 = new Label();
methodVisitor.visitTryCatchBlock(label6, label0, label9, null);
Label label10 = new Label();
Label label11 = new Label();
Label label12 = new Label();
methodVisitor.visitTryCatchBlock(label10, label11, label12, "java/io/IOException");
Label label13 = new Label();
Label label14 = new Label();
Label label15 = new Label();
methodVisitor.visitTryCatchBlock(label13, label14, label15, "java/io/IOException");
methodVisitor.visitTryCatchBlock(label7, label10, label9, null);
methodVisitor.visitTypeInsn(NEW, "java/io/ByteArrayOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 512);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/ByteArrayOutputStream", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label6);
methodVisitor.visitTypeInsn(NEW, "java/io/ObjectOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/ObjectOutputStream", "<init>", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/functors/PrototypeFactory$PrototypeSerializationFactory", "iPrototype", "Ljava/io/Serializable;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectOutputStream", "writeObject", "(Ljava/lang/Object;)V", false);
methodVisitor.visitTypeInsn(NEW, "java/io/ByteArrayInputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ByteArrayOutputStream", "toByteArray", "()[B", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/ByteArrayInputStream", "<init>", "([B)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/io/ObjectInputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/ObjectInputStream", "<init>", "(Ljava/io/InputStream;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectInputStream", "readObject", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ByteArrayInputStream", "close", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ByteArrayOutputStream", "close", "()V", false);
methodVisitor.visitLabel(label4);
Label label16 = new Label();
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label16);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections/FunctorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/FunctorException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections/FunctorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/FunctorException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label10);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNULL, label11);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ByteArrayInputStream", "close", "()V", false);
methodVisitor.visitLabel(label11);
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label12);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label13);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNULL, label14);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ByteArrayOutputStream", "close", "()V", false);
methodVisitor.visitLabel(label14);
Label label17 = new Label();
methodVisitor.visitJumpInsn(GOTO, label17);
methodVisitor.visitLabel(label15);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label17);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "writeObject", "(Ljava/io/ObjectOutputStream;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections/functors/PrototypeFactory", "class$org$apache$commons$collections$functors$PrototypeFactory$PrototypeSerializationFactory", "Ljava/lang/Class;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitLdcInsn("org.apache.commons.collections.functors.PrototypeFactory$PrototypeSerializationFactory");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/PrototypeFactory", "class$", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/collections/functors/PrototypeFactory", "class$org$apache$commons$collections$functors$PrototypeFactory$PrototypeSerializationFactory", "Ljava/lang/Class;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections/functors/PrototypeFactory", "class$org$apache$commons$collections$functors$PrototypeFactory$PrototypeSerializationFactory", "Ljava/lang/Class;");
methodVisitor.visitLabel(label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/FunctorUtils", "checkUnsafeSerialization", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectOutputStream", "defaultWriteObject", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "readObject", "(Ljava/io/ObjectInputStream;)V", null, new String[] { "java/lang/ClassNotFoundException", "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections/functors/PrototypeFactory", "class$org$apache$commons$collections$functors$PrototypeFactory$PrototypeSerializationFactory", "Ljava/lang/Class;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitLdcInsn("org.apache.commons.collections.functors.PrototypeFactory$PrototypeSerializationFactory");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/PrototypeFactory", "class$", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/collections/functors/PrototypeFactory", "class$org$apache$commons$collections$functors$PrototypeFactory$PrototypeSerializationFactory", "Ljava/lang/Class;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections/functors/PrototypeFactory", "class$org$apache$commons$collections$functors$PrototypeFactory$PrototypeSerializationFactory", "Ljava/lang/Class;");
methodVisitor.visitLabel(label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/functors/FunctorUtils", "checkUnsafeSerialization", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectInputStream", "defaultReadObject", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljava/io/Serializable;Lorg/apache/commons/collections/functors/PrototypeFactory$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/functors/PrototypeFactory$PrototypeSerializationFactory", "<init>", "(Ljava/io/Serializable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
