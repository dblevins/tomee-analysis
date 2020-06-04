package asm.org.apache.openejb.core.cmp.cmp2;
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
public class CmrSet$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/core/cmp/cmp2/CmrSet$2", "Ljava/lang/Object;Ljava/util/Iterator<TProxy;>;", "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitOuterClass("org/apache/openejb/core/cmp/cmp2/CmrSet", "iterator", "()Ljava/util/Iterator;");

classWriter.visitInnerClass("org/apache/openejb/core/cmp/cmp2/CmrSet$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "currentEntity", "Ljakarta/ejb/EntityBean;", "TBean;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "iterator", "Ljava/util/Iterator;", "Ljava/util/Iterator<TBean;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/core/cmp/cmp2/CmrSet;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openejb/core/cmp/cmp2/CmrSet;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/cmp/cmp2/CmrSet$2", "this$0", "Lorg/apache/openejb/core/cmp/cmp2/CmrSet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/cmp2/CmrSet$2", "this$0", "Lorg/apache/openejb/core/cmp/cmp2/CmrSet;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/cmp/cmp2/CmrSet", "access$100", "(Lorg/apache/openejb/core/cmp/cmp2/CmrSet;ZZ)Ljava/util/Collection;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/cmp/cmp2/CmrSet$2", "iterator", "Ljava/util/Iterator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/cmp2/CmrSet$2", "iterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljakarta/ejb/EJBLocalObject;", "()TProxy;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/cmp2/CmrSet$2", "this$0", "Lorg/apache/openejb/core/cmp/cmp2/CmrSet;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/cmp/cmp2/CmrSet", "access$200", "(Lorg/apache/openejb/core/cmp/cmp2/CmrSet;)Ljava/util/Collection;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/ConcurrentModificationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Entity has been deleted therefore this iterator can no longer be used");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ConcurrentModificationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/cmp2/CmrSet$2", "iterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/ejb/EntityBean");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/cmp/cmp2/CmrSet$2", "currentEntity", "Ljakarta/ejb/EntityBean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/cmp2/CmrSet$2", "this$0", "Lorg/apache/openejb/core/cmp/cmp2/CmrSet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/cmp2/CmrSet$2", "currentEntity", "Ljakarta/ejb/EntityBean;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/cmp/cmp2/CmrSet", "access$300", "(Lorg/apache/openejb/core/cmp/cmp2/CmrSet;Ljakarta/ejb/EntityBean;)Ljakarta/ejb/EJBLocalObject;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/cmp2/CmrSet$2", "this$0", "Lorg/apache/openejb/core/cmp/cmp2/CmrSet;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/cmp/cmp2/CmrSet", "access$200", "(Lorg/apache/openejb/core/cmp/cmp2/CmrSet;)Ljava/util/Collection;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/ConcurrentModificationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Entity has been deleted therefore this iterator can no longer be used");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ConcurrentModificationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/cmp2/CmrSet$2", "this$0", "Lorg/apache/openejb/core/cmp/cmp2/CmrSet;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/cmp/cmp2/CmrSet", "access$000", "(Lorg/apache/openejb/core/cmp/cmp2/CmrSet;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitTypeInsn(NEW, "java/util/ConcurrentModificationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Transaction has completed therefore this cmr collection can no longer be modified");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ConcurrentModificationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/cmp2/CmrSet$2", "iterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "remove", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/cmp2/CmrSet$2", "this$0", "Lorg/apache/openejb/core/cmp/cmp2/CmrSet;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/cmp/cmp2/CmrSet", "access$400", "(Lorg/apache/openejb/core/cmp/cmp2/CmrSet;)Ljava/lang/String;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/cmp2/CmrSet$2", "this$0", "Lorg/apache/openejb/core/cmp/cmp2/CmrSet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/cmp2/CmrSet$2", "currentEntity", "Ljakarta/ejb/EntityBean;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/cmp/cmp2/CmrSet", "access$600", "(Lorg/apache/openejb/core/cmp/cmp2/CmrSet;Ljava/lang/Object;)Lorg/apache/openejb/core/cmp/cmp2/Cmp2Entity;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/cmp2/CmrSet$2", "this$0", "Lorg/apache/openejb/core/cmp/cmp2/CmrSet;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/cmp/cmp2/CmrSet", "access$400", "(Lorg/apache/openejb/core/cmp/cmp2/CmrSet;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/cmp2/CmrSet$2", "this$0", "Lorg/apache/openejb/core/cmp/cmp2/CmrSet;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/cmp/cmp2/CmrSet", "access$500", "(Lorg/apache/openejb/core/cmp/cmp2/CmrSet;)Ljakarta/ejb/EntityBean;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/cmp/cmp2/Cmp2Entity", "OpenEJB_removeCmr", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/cmp/cmp2/CmrSet$2", "next", "()Ljakarta/ejb/EJBLocalObject;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
