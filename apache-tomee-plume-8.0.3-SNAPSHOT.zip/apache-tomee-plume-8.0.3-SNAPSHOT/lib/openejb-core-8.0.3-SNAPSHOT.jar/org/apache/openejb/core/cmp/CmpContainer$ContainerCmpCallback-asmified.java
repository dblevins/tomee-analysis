package asm.org.apache.openejb.core.cmp;
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
public class CmpContainer$ContainerCmpCallbackDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/core/cmp/CmpContainer$ContainerCmpCallback", null, "java/lang/Object", new String[] { "org/apache/openejb/core/cmp/CmpCallback" });

classWriter.visitInnerClass("org/apache/openejb/core/cmp/CmpContainer$ContainerCmpCallback", "org/apache/openejb/core/cmp/CmpContainer", "ContainerCmpCallback", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/core/cmp/CmpContainer$1", null, null, ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/core/cmp/CmpContainer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/openejb/core/cmp/CmpContainer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/cmp/CmpContainer$ContainerCmpCallback", "this$0", "Lorg/apache/openejb/core/cmp/CmpContainer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEntityContext", "(Ljavax/ejb/EntityBean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/CmpContainer$ContainerCmpCallback", "this$0", "Lorg/apache/openejb/core/cmp/CmpContainer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/cmp/CmpContainer", "access$300", "(Lorg/apache/openejb/core/cmp/CmpContainer;Ljavax/ejb/EntityBean;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unsetEntityContext", "(Ljavax/ejb/EntityBean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/CmpContainer$ContainerCmpCallback", "this$0", "Lorg/apache/openejb/core/cmp/CmpContainer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/cmp/CmpContainer", "access$400", "(Lorg/apache/openejb/core/cmp/CmpContainer;Ljavax/ejb/EntityBean;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ejbActivate", "(Ljavax/ejb/EntityBean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/CmpContainer$ContainerCmpCallback", "this$0", "Lorg/apache/openejb/core/cmp/CmpContainer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/cmp/CmpContainer", "access$500", "(Lorg/apache/openejb/core/cmp/CmpContainer;Ljavax/ejb/EntityBean;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ejbPassivate", "(Ljavax/ejb/EntityBean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/CmpContainer$ContainerCmpCallback", "this$0", "Lorg/apache/openejb/core/cmp/CmpContainer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/cmp/CmpContainer", "access$600", "(Lorg/apache/openejb/core/cmp/CmpContainer;Ljavax/ejb/EntityBean;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ejbLoad", "(Ljavax/ejb/EntityBean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/CmpContainer$ContainerCmpCallback", "this$0", "Lorg/apache/openejb/core/cmp/CmpContainer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/cmp/CmpContainer", "access$700", "(Lorg/apache/openejb/core/cmp/CmpContainer;Ljavax/ejb/EntityBean;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ejbStore", "(Ljavax/ejb/EntityBean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/CmpContainer$ContainerCmpCallback", "this$0", "Lorg/apache/openejb/core/cmp/CmpContainer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/cmp/CmpContainer", "access$200", "(Lorg/apache/openejb/core/cmp/CmpContainer;Ljavax/ejb/EntityBean;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ejbRemove", "(Ljavax/ejb/EntityBean;)V", null, new String[] { "javax/ejb/RemoveException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/CmpContainer$ContainerCmpCallback", "this$0", "Lorg/apache/openejb/core/cmp/CmpContainer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/cmp/CmpContainer", "access$800", "(Lorg/apache/openejb/core/cmp/CmpContainer;Ljavax/ejb/EntityBean;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/openejb/core/cmp/CmpContainer;Lorg/apache/openejb/core/cmp/CmpContainer$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/cmp/CmpContainer$ContainerCmpCallback", "<init>", "(Lorg/apache/openejb/core/cmp/CmpContainer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
