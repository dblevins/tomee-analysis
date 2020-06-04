package asm.jakarta.xml.rpc;
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
public class ServiceFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "jakarta/xml/rpc/ServiceFactory", null, "java/lang/Object", null);

classWriter.visitInnerClass("jakarta/xml/rpc/FactoryFinder$ConfigurationError", "jakarta/xml/rpc/FactoryFinder", "ConfigurationError", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERVICEFACTORY_PROPERTY", "Ljava/lang/String;", null, "jakarta.xml.rpc.ServiceFactory");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newInstance", "()Ljakarta/xml/rpc/ServiceFactory;", null, new String[] { "jakarta/xml/rpc/ServiceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "jakarta/xml/rpc/FactoryFinder$ConfigurationError");
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/xml/rpc/ServiceFactory;"));
methodVisitor.visitLdcInsn("org.apache.axis.client.ServiceFactory");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/xml/rpc/FactoryFinder", "find", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/xml/rpc/ServiceFactory");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitTypeInsn(NEW, "jakarta/xml/rpc/ServiceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/rpc/FactoryFinder$ConfigurationError", "getException", "()Ljava/lang/Exception;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/xml/rpc/ServiceException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createService", "(Ljava/net/URL;Ljavax/xml/namespace/QName;)Ljakarta/xml/rpc/Service;", null, new String[] { "jakarta/xml/rpc/ServiceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createService", "(Ljavax/xml/namespace/QName;)Ljakarta/xml/rpc/Service;", null, new String[] { "jakarta/xml/rpc/ServiceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "loadService", "(Ljava/lang/Class;)Ljakarta/xml/rpc/Service;", null, new String[] { "jakarta/xml/rpc/ServiceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "loadService", "(Ljava/net/URL;Ljava/lang/Class;Ljava/util/Properties;)Ljakarta/xml/rpc/Service;", null, new String[] { "jakarta/xml/rpc/ServiceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "loadService", "(Ljava/net/URL;Ljavax/xml/namespace/QName;Ljava/util/Properties;)Ljakarta/xml/rpc/Service;", null, new String[] { "jakarta/xml/rpc/ServiceException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
