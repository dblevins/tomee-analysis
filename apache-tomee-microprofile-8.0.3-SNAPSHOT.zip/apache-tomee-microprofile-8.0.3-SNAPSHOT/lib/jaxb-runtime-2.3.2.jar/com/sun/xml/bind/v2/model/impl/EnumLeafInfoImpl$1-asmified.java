package asm.com.sun.xml.bind.v2.model.impl;
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
public class EnumLeafInfoImpl$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "com/sun/xml/bind/v2/model/impl/EnumLeafInfoImpl$1", "Ljava/lang/Object;Ljava/util/Iterator<Lcom/sun/xml/bind/v2/model/impl/EnumConstantImpl<TT;TC;TF;TM;>;>;", "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitOuterClass("com/sun/xml/bind/v2/model/impl/EnumLeafInfoImpl", "iterator", "()Ljava/util/Iterator;");

classWriter.visitInnerClass("com/sun/xml/bind/v2/model/impl/EnumLeafInfoImpl$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "next", "Lcom/sun/xml/bind/v2/model/impl/EnumConstantImpl;", "Lcom/sun/xml/bind/v2/model/impl/EnumConstantImpl<TT;TC;TF;TM;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/xml/bind/v2/model/impl/EnumLeafInfoImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/xml/bind/v2/model/impl/EnumLeafInfoImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/model/impl/EnumLeafInfoImpl$1", "this$0", "Lcom/sun/xml/bind/v2/model/impl/EnumLeafInfoImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/impl/EnumLeafInfoImpl$1", "this$0", "Lcom/sun/xml/bind/v2/model/impl/EnumLeafInfoImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/model/impl/EnumLeafInfoImpl", "access$000", "(Lcom/sun/xml/bind/v2/model/impl/EnumLeafInfoImpl;)Lcom/sun/xml/bind/v2/model/impl/EnumConstantImpl;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/model/impl/EnumLeafInfoImpl$1", "next", "Lcom/sun/xml/bind/v2/model/impl/EnumConstantImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/impl/EnumLeafInfoImpl$1", "next", "Lcom/sun/xml/bind/v2/model/impl/EnumConstantImpl;");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Lcom/sun/xml/bind/v2/model/impl/EnumConstantImpl;", "()Lcom/sun/xml/bind/v2/model/impl/EnumConstantImpl<TT;TC;TF;TM;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/impl/EnumLeafInfoImpl$1", "next", "Lcom/sun/xml/bind/v2/model/impl/EnumConstantImpl;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/impl/EnumLeafInfoImpl$1", "next", "Lcom/sun/xml/bind/v2/model/impl/EnumConstantImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/impl/EnumConstantImpl", "next", "Lcom/sun/xml/bind/v2/model/impl/EnumConstantImpl;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/model/impl/EnumLeafInfoImpl$1", "next", "Lcom/sun/xml/bind/v2/model/impl/EnumConstantImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/EnumLeafInfoImpl$1", "next", "()Lcom/sun/xml/bind/v2/model/impl/EnumConstantImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
