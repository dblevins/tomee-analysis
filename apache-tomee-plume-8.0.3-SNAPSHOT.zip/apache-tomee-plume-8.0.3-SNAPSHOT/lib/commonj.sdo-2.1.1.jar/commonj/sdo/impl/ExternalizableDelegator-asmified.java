package asm.commonj.sdo.impl;
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
public class ExternalizableDelegatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "commonj/sdo/impl/ExternalizableDelegator", null, "java/lang/Object", new String[] { "java/io/Externalizable" });

classWriter.visitInnerClass("commonj/sdo/impl/ExternalizableDelegator$Resolvable", "commonj/sdo/impl/ExternalizableDelegator", "Resolvable", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_TRANSIENT, "delegate", "Lcommonj/sdo/impl/ExternalizableDelegator$Resolvable;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "commonj/sdo/impl/HelperProvider", "createResolvable", "()Lcommonj/sdo/impl/ExternalizableDelegator$Resolvable;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "commonj/sdo/impl/ExternalizableDelegator", "delegate", "Lcommonj/sdo/impl/ExternalizableDelegator$Resolvable;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "commonj/sdo/impl/HelperProvider", "createResolvable", "(Ljava/lang/Object;)Lcommonj/sdo/impl/ExternalizableDelegator$Resolvable;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "commonj/sdo/impl/ExternalizableDelegator", "delegate", "Lcommonj/sdo/impl/ExternalizableDelegator$Resolvable;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeExternal", "(Ljava/io/ObjectOutput;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "commonj/sdo/impl/ExternalizableDelegator", "delegate", "Lcommonj/sdo/impl/ExternalizableDelegator$Resolvable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/impl/ExternalizableDelegator$Resolvable", "writeExternal", "(Ljava/io/ObjectOutput;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "readExternal", "(Ljava/io/ObjectInput;)V", null, new String[] { "java/io/IOException", "java/lang/ClassNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "commonj/sdo/impl/ExternalizableDelegator", "delegate", "Lcommonj/sdo/impl/ExternalizableDelegator$Resolvable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/impl/ExternalizableDelegator$Resolvable", "readExternal", "(Ljava/io/ObjectInput;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "readResolve", "()Ljava/lang/Object;", null, new String[] { "java/io/ObjectStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "commonj/sdo/impl/ExternalizableDelegator", "delegate", "Lcommonj/sdo/impl/ExternalizableDelegator$Resolvable;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/impl/ExternalizableDelegator$Resolvable", "readResolve", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
