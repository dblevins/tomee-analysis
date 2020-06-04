package asm.org.apache.openejb.server.webservices.saaj;
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
public class SoapFactoryImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/server/webservices/saaj/SoapFactoryImpl", null, "javax/xml/soap/SOAPFactory", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/soap/SOAPFactory", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getSOAPFactory", "()Ljavax/xml/soap/SOAPFactory;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("javax.xml.soap.SOAPFactory");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/webservices/saaj/SaajFactoryFinder", "find", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/soap/SOAPFactory");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createDetail", "()Ljavax/xml/soap/Detail;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/webservices/saaj/SoapFactoryImpl", "getSOAPFactory", "()Ljavax/xml/soap/SOAPFactory;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/soap/SOAPFactory", "createDetail", "()Ljavax/xml/soap/Detail;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createElement", "(Ljavax/xml/soap/Name;)Ljavax/xml/soap/SOAPElement;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/webservices/saaj/SoapFactoryImpl", "getSOAPFactory", "()Ljavax/xml/soap/SOAPFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/soap/SOAPFactory", "createElement", "(Ljavax/xml/soap/Name;)Ljavax/xml/soap/SOAPElement;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createElement", "(Ljava/lang/String;)Ljavax/xml/soap/SOAPElement;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/webservices/saaj/SoapFactoryImpl", "getSOAPFactory", "()Ljavax/xml/soap/SOAPFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/soap/SOAPFactory", "createElement", "(Ljava/lang/String;)Ljavax/xml/soap/SOAPElement;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/soap/SOAPElement;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/webservices/saaj/SoapFactoryImpl", "getSOAPFactory", "()Ljavax/xml/soap/SOAPFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/soap/SOAPFactory", "createElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/soap/SOAPElement;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createFault", "()Ljavax/xml/soap/SOAPFault;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/webservices/saaj/SoapFactoryImpl", "getSOAPFactory", "()Ljavax/xml/soap/SOAPFactory;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/soap/SOAPFactory", "createFault", "()Ljavax/xml/soap/SOAPFault;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createFault", "(Ljava/lang/String;Ljavax/xml/namespace/QName;)Ljavax/xml/soap/SOAPFault;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/webservices/saaj/SoapFactoryImpl", "getSOAPFactory", "()Ljavax/xml/soap/SOAPFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/soap/SOAPFactory", "createFault", "(Ljava/lang/String;Ljavax/xml/namespace/QName;)Ljavax/xml/soap/SOAPFault;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createName", "(Ljava/lang/String;)Ljavax/xml/soap/Name;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/webservices/saaj/SoapFactoryImpl", "getSOAPFactory", "()Ljavax/xml/soap/SOAPFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/soap/SOAPFactory", "createName", "(Ljava/lang/String;)Ljavax/xml/soap/Name;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/soap/Name;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/webservices/saaj/SoapFactoryImpl", "getSOAPFactory", "()Ljavax/xml/soap/SOAPFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/soap/SOAPFactory", "createName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/soap/Name;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
