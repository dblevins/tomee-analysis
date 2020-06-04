package asm.org.apache.cxf.service.model;
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
public class UnwrappedOperationInfoDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/service/model/UnwrappedOperationInfo", null, "org/apache/cxf/service/model/OperationInfo", null);

{
fieldVisitor = classWriter.visitField(0, "wrappedOp", "Lorg/apache/cxf/service/model/OperationInfo;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/service/model/OperationInfo;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/service/model/OperationInfo", "<init>", "(Lorg/apache/cxf/service/model/OperationInfo;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/service/model/UnwrappedOperationInfo", "wrappedOp", "Lorg/apache/cxf/service/model/OperationInfo;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/service/model/UnwrappedOperationInfo", "wrappedOp", "Lorg/apache/cxf/service/model/OperationInfo;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/UnwrappedOperationInfo", "setDelegate", "(Lorg/apache/cxf/service/model/AbstractPropertiesHolder;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWrappedOperation", "()Lorg/apache/cxf/service/model/OperationInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/service/model/UnwrappedOperationInfo", "wrappedOp", "Lorg/apache/cxf/service/model/OperationInfo;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isUnwrapped", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addFault", "(Ljavax/xml/namespace/QName;Ljavax/xml/namespace/QName;)Lorg/apache/cxf/service/model/FaultInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/service/model/UnwrappedOperationInfo", "wrappedOp", "Lorg/apache/cxf/service/model/OperationInfo;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/OperationInfo", "addFault", "(Ljavax/xml/namespace/QName;Ljavax/xml/namespace/QName;)Lorg/apache/cxf/service/model/FaultInfo;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFault", "(Ljavax/xml/namespace/QName;)Lorg/apache/cxf/service/model/FaultInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/service/model/UnwrappedOperationInfo", "wrappedOp", "Lorg/apache/cxf/service/model/OperationInfo;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/OperationInfo", "getFault", "(Ljavax/xml/namespace/QName;)Lorg/apache/cxf/service/model/FaultInfo;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFaults", "()Ljava/util/Collection;", "()Ljava/util/Collection<Lorg/apache/cxf/service/model/FaultInfo;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/service/model/UnwrappedOperationInfo", "wrappedOp", "Lorg/apache/cxf/service/model/OperationInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/OperationInfo", "getFaults", "()Ljava/util/Collection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOutput", "(Ljava/lang/String;Lorg/apache/cxf/service/model/MessageInfo;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/service/model/OperationInfo", "setOutput", "(Ljava/lang/String;Lorg/apache/cxf/service/model/MessageInfo;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/service/model/UnwrappedOperationInfo", "wrappedOp", "Lorg/apache/cxf/service/model/OperationInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/OperationInfo", "getOutput", "()Lorg/apache/cxf/service/model/MessageInfo;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/MessageInfo", "setDelegate", "(Lorg/apache/cxf/service/model/AbstractPropertiesHolder;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setInput", "(Ljava/lang/String;Lorg/apache/cxf/service/model/MessageInfo;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/service/model/OperationInfo", "setInput", "(Ljava/lang/String;Lorg/apache/cxf/service/model/MessageInfo;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/service/model/UnwrappedOperationInfo", "wrappedOp", "Lorg/apache/cxf/service/model/OperationInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/OperationInfo", "getInput", "()Lorg/apache/cxf/service/model/MessageInfo;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/MessageInfo", "setDelegate", "(Lorg/apache/cxf/service/model/AbstractPropertiesHolder;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
