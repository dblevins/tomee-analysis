package asm.org.apache.xbean.asm7.commons;
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
public class SerialVersionUIDAdderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", null, "org/apache/xbean/asm7/ClassVisitor", null);

classWriter.visitInnerClass("org/apache/xbean/asm7/commons/SerialVersionUIDAdder$Item", "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "Item", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "CLINIT", "Ljava/lang/String;", null, "<clinit>");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "computeSvuid", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "hasSvuid", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "access", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "interfaces", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "svuidFields", "Ljava/util/Collection;", "Ljava/util/Collection<Lorg/apache/xbean/asm7/commons/SerialVersionUIDAdder$Item;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "hasStaticInitializer", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "svuidConstructors", "Ljava/util/Collection;", "Ljava/util/Collection<Lorg/apache/xbean/asm7/commons/SerialVersionUIDAdder$Item;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "svuidMethods", "Ljava/util/Collection;", "Ljava/util/Collection<Lorg/apache/xbean/asm7/commons/SerialVersionUIDAdder$Item;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/xbean/asm7/ClassVisitor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(458752));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "<init>", "(ILorg/apache/xbean/asm7/ClassVisitor;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xbean/asm7/commons/SerialVersionUIDAdder;"));
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(ILorg/apache/xbean/asm7/ClassVisitor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/ClassVisitor", "<init>", "(ILorg/apache/xbean/asm7/ClassVisitor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 16384);
methodVisitor.visitInsn(IAND);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "computeSvuid", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "computeSvuid", "Z");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "access", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "interfaces", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "svuidFields", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "svuidConstructors", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "svuidMethods", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "interfaces", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/ClassVisitor", "visit", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitMethod", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/xbean/asm7/MethodVisitor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "computeSvuid", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLdcInsn("<clinit>");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "hasStaticInitializer", "Z");
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(SIPUSH, 3391);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IAND);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitLdcInsn("<init>");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "svuidConstructors", "Ljava/util/Collection;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder$Item");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder$Item", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label2);
methodVisitor.visitLdcInsn("<clinit>");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "svuidMethods", "Ljava/util/Collection;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder$Item");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder$Item", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/ClassVisitor", "visitMethod", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/xbean/asm7/MethodVisitor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitField", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/xbean/asm7/FieldVisitor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "computeSvuid", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLdcInsn("serialVersionUID");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "computeSvuid", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "hasSvuid", "Z");
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IAND);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(SIPUSH, 136);
methodVisitor.visitInsn(IAND);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(SIPUSH, 223);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "svuidFields", "Ljava/util/Collection;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder$Item");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder$Item", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/ClassVisitor", "visitField", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/xbean/asm7/FieldVisitor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitInnerClass", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "name", "Ljava/lang/String;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "access", "I");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/ClassVisitor", "visitInnerClass", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitEnd", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "computeSvuid", "Z");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "hasSvuid", "Z");
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "computeSVUID", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "addSVUID", "(J)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Error while computing SVUID for ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/ClassVisitor", "visitEnd", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasSVUID", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "hasSvuid", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "addSVUID", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitLdcInsn("serialVersionUID");
methodVisitor.visitLdcInsn("J");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/ClassVisitor", "visitField", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/xbean/asm7/FieldVisitor;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/FieldVisitor", "visitEnd", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "computeSVUID", "()J", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Throwable");
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label6, null);
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
methodVisitor.visitTryCatchBlock(label7, label8, label9, "java/lang/Throwable");
Label label10 = new Label();
methodVisitor.visitTryCatchBlock(label5, label10, label6, null);
Label label11 = new Label();
Label label12 = new Label();
Label label13 = new Label();
methodVisitor.visitTryCatchBlock(label11, label12, label13, "java/lang/Throwable");
Label label14 = new Label();
Label label15 = new Label();
Label label16 = new Label();
methodVisitor.visitTryCatchBlock(label14, label15, label16, "java/lang/Throwable");
Label label17 = new Label();
methodVisitor.visitTryCatchBlock(label14, label15, label17, null);
Label label18 = new Label();
Label label19 = new Label();
Label label20 = new Label();
methodVisitor.visitTryCatchBlock(label18, label19, label20, "java/lang/Throwable");
Label label21 = new Label();
methodVisitor.visitTryCatchBlock(label16, label21, label17, null);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitVarInsn(LSTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/io/ByteArrayOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/ByteArrayOutputStream", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label14);
methodVisitor.visitTypeInsn(NEW, "java/io/DataOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/DataOutputStream", "<init>", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "name", "Ljava/lang/String;");
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "replace", "(CC)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/DataOutputStream", "writeUTF", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "access", "I");
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitIntInsn(SIPUSH, 512);
methodVisitor.visitInsn(IAND);
Label label22 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label22);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "svuidMethods", "Ljava/util/Collection;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "isEmpty", "()Z", true);
Label label23 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label23);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitIntInsn(SIPUSH, -1025);
methodVisitor.visitInsn(IAND);
Label label24 = new Label();
methodVisitor.visitJumpInsn(GOTO, label24);
methodVisitor.visitLabel(label23);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitIntInsn(SIPUSH, 1024);
methodVisitor.visitInsn(IOR);
methodVisitor.visitLabel(label24);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitLabel(label22);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitIntInsn(SIPUSH, 1553);
methodVisitor.visitInsn(IAND);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/DataOutputStream", "writeInt", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "interfaces", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "sort", "([Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "interfaces", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 10);
Label label25 = new Label();
methodVisitor.visitLabel(label25);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitVarInsn(ILOAD, 9);
Label label26 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label26);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "replace", "(CC)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/DataOutputStream", "writeUTF", "(Ljava/lang/String;)V", false);
methodVisitor.visitIincInsn(10, 1);
methodVisitor.visitJumpInsn(GOTO, label25);
methodVisitor.visitLabel(label26);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "svuidFields", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "writeItems", "(Ljava/util/Collection;Ljava/io/DataOutput;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "hasStaticInitializer", "Z");
Label label27 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label27);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("<clinit>");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/DataOutputStream", "writeUTF", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/DataOutputStream", "writeInt", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("()V");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/DataOutputStream", "writeUTF", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label27);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "svuidConstructors", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "writeItems", "(Ljava/util/Collection;Ljava/io/DataOutput;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "svuidMethods", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "writeItems", "(Ljava/util/Collection;Ljava/io/DataOutput;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/DataOutputStream", "flush", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ByteArrayOutputStream", "toByteArray", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder", "computeSHAdigest", "([B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "min", "(II)I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 9);
Label label28 = new Label();
methodVisitor.visitLabel(label28);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitJumpInsn(IFLT, label4);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LOR);
methodVisitor.visitVarInsn(LSTORE, 1);
methodVisitor.visitIincInsn(9, -1);
methodVisitor.visitJumpInsn(GOTO, label28);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitJumpInsn(IFNULL, label15);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label29 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label29);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/DataOutputStream", "close", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(POP2);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label29);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/DataOutputStream", "close", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitLabel(label10);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label30 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label30);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label31 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label31);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/DataOutputStream", "close", "()V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitJumpInsn(GOTO, label30);
methodVisitor.visitLabel(label9);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitInsn(POP2);
methodVisitor.visitJumpInsn(GOTO, label30);
methodVisitor.visitLabel(label31);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/DataOutputStream", "close", "()V", false);
methodVisitor.visitLabel(label30);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label15);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label32 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label32);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label33 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label33);
methodVisitor.visitLabel(label11);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ByteArrayOutputStream", "close", "()V", false);
methodVisitor.visitLabel(label12);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label13);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(POP2);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label33);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ByteArrayOutputStream", "close", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label16);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label17);
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitLabel(label21);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label34 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label34);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label35 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label35);
methodVisitor.visitLabel(label18);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ByteArrayOutputStream", "close", "()V", false);
methodVisitor.visitLabel(label19);
methodVisitor.visitJumpInsn(GOTO, label34);
methodVisitor.visitLabel(label20);
methodVisitor.visitVarInsn(ASTORE, 15);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitInsn(POP2);
methodVisitor.visitJumpInsn(GOTO, label34);
methodVisitor.visitLabel(label35);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ByteArrayOutputStream", "close", "()V", false);
methodVisitor.visitLabel(label34);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label32);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(4, 16);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "computeSHAdigest", "([B)[B", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/security/NoSuchAlgorithmException");
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn("SHA");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/MessageDigest", "getInstance", "(Ljava/lang/String;)Ljava/security/MessageDigest;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/MessageDigest", "digest", "([B)[B", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "writeItems", "(Ljava/util/Collection;Ljava/io/DataOutput;Z)V", "(Ljava/util/Collection<Lorg/apache/xbean/asm7/commons/SerialVersionUIDAdder$Item;>;Ljava/io/DataOutput;Z)V", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder$Item");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/xbean/asm7/commons/SerialVersionUIDAdder$Item;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "sort", "([Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 6);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 5);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder$Item", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeUTF", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder$Item", "access", "I");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeInt", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder$Item", "descriptor", "Ljava/lang/String;");
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "replace", "(CC)Ljava/lang/String;", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/SerialVersionUIDAdder$Item", "descriptor", "Ljava/lang/String;");
methodVisitor.visitLabel(label3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeUTF", "(Ljava/lang/String;)V", true);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}