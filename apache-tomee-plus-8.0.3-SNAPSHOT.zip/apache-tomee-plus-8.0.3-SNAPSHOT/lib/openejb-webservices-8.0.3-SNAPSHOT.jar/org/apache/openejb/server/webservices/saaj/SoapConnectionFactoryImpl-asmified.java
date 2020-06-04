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
public class SoapConnectionFactoryImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/server/webservices/saaj/SoapConnectionFactoryImpl", null, "javax/xml/soap/SOAPConnectionFactory", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/soap/SOAPConnectionFactory", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getSOAPConnectionFactory", "()Ljavax/xml/soap/SOAPConnectionFactory;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("javax.xml.soap.SOAPConnectionFactory");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/webservices/saaj/SaajFactoryFinder", "find", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/soap/SOAPConnectionFactory");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createConnection", "()Ljavax/xml/soap/SOAPConnection;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/webservices/saaj/SoapConnectionFactoryImpl", "getSOAPConnectionFactory", "()Ljavax/xml/soap/SOAPConnectionFactory;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/soap/SOAPConnectionFactory", "createConnection", "()Ljavax/xml/soap/SOAPConnection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
