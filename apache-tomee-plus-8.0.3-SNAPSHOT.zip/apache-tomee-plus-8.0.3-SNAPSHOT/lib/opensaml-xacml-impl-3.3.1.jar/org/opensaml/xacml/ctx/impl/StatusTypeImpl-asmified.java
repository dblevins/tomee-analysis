package asm.org.opensaml.xacml.ctx.impl;
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
public class StatusTypeImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/xacml/ctx/impl/StatusTypeImpl", null, "org/opensaml/xacml/impl/AbstractXACMLObject", new String[] { "org/opensaml/xacml/ctx/StatusType" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "statusCode", "Lorg/opensaml/xacml/ctx/StatusCodeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "statusMessage", "Lorg/opensaml/xacml/ctx/StatusMessageType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "statusDetail", "Lorg/opensaml/xacml/ctx/StatusDetailType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xacml/impl/AbstractXACMLObject", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStatusCode", "()Lorg/opensaml/xacml/ctx/StatusCodeType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/ctx/impl/StatusTypeImpl", "statusCode", "Lorg/opensaml/xacml/ctx/StatusCodeType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setStatusCode", "(Lorg/opensaml/xacml/ctx/StatusCodeType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/ctx/impl/StatusTypeImpl", "statusCode", "Lorg/opensaml/xacml/ctx/StatusCodeType;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xacml/ctx/impl/StatusTypeImpl", "prepareForAssignment", "(Lorg/opensaml/core/xml/XMLObject;Lorg/opensaml/core/xml/XMLObject;)Lorg/opensaml/core/xml/XMLObject;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xacml/ctx/StatusCodeType");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xacml/ctx/impl/StatusTypeImpl", "statusCode", "Lorg/opensaml/xacml/ctx/StatusCodeType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOrderedChildren", "()Ljava/util/List;", "()Ljava/util/List<Lorg/opensaml/core/xml/XMLObject;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/ctx/impl/StatusTypeImpl", "statusCode", "Lorg/opensaml/xacml/ctx/StatusCodeType;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/ctx/impl/StatusTypeImpl", "statusCode", "Lorg/opensaml/xacml/ctx/StatusCodeType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/ArrayList"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/ctx/impl/StatusTypeImpl", "statusMessage", "Lorg/opensaml/xacml/ctx/StatusMessageType;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/ctx/impl/StatusTypeImpl", "statusMessage", "Lorg/opensaml/xacml/ctx/StatusMessageType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/ctx/impl/StatusTypeImpl", "statusDetail", "Lorg/opensaml/xacml/ctx/StatusDetailType;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/ctx/impl/StatusTypeImpl", "statusDetail", "Lorg/opensaml/xacml/ctx/StatusDetailType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableList", "(Ljava/util/List;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStatusMessage", "()Lorg/opensaml/xacml/ctx/StatusMessageType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/ctx/impl/StatusTypeImpl", "statusMessage", "Lorg/opensaml/xacml/ctx/StatusMessageType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setStatusMessage", "(Lorg/opensaml/xacml/ctx/StatusMessageType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/ctx/impl/StatusTypeImpl", "statusMessage", "Lorg/opensaml/xacml/ctx/StatusMessageType;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xacml/ctx/impl/StatusTypeImpl", "prepareForAssignment", "(Lorg/opensaml/core/xml/XMLObject;Lorg/opensaml/core/xml/XMLObject;)Lorg/opensaml/core/xml/XMLObject;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xacml/ctx/StatusMessageType");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xacml/ctx/impl/StatusTypeImpl", "statusMessage", "Lorg/opensaml/xacml/ctx/StatusMessageType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStatusDetail", "()Lorg/opensaml/xacml/ctx/StatusDetailType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/ctx/impl/StatusTypeImpl", "statusDetail", "Lorg/opensaml/xacml/ctx/StatusDetailType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setStatusDetail", "(Lorg/opensaml/xacml/ctx/StatusDetailType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/ctx/impl/StatusTypeImpl", "statusDetail", "Lorg/opensaml/xacml/ctx/StatusDetailType;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xacml/ctx/impl/StatusTypeImpl", "prepareForAssignment", "(Lorg/opensaml/core/xml/XMLObject;Lorg/opensaml/core/xml/XMLObject;)Lorg/opensaml/core/xml/XMLObject;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xacml/ctx/StatusDetailType");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xacml/ctx/impl/StatusTypeImpl", "statusDetail", "Lorg/opensaml/xacml/ctx/StatusDetailType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
