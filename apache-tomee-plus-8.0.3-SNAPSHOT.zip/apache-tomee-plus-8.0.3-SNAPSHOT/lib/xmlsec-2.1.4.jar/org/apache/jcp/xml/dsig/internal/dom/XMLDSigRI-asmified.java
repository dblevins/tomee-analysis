package asm.org.apache.jcp.xml.dsig.internal.dom;
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
public class XMLDSigRIDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/jcp/xml/dsig/internal/dom/XMLDSigRI", null, "java/security/Provider", null);

classWriter.visitInnerClass("org/apache/jcp/xml/dsig/internal/dom/XMLDSigRI$ProviderService", "org/apache/jcp/xml/dsig/internal/dom/XMLDSigRI", "ProviderService", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jcp/xml/dsig/internal/dom/XMLDSigRI$1", null, null, 0);

classWriter.visitInnerClass("java/security/Provider$Service", "java/security/Provider", "Service", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(-5049765099299494554L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "INFO", "Ljava/lang/String;", null, "Apache Santuario XMLDSig (DOM XMLSignatureFactory; DOM KeyInfoFactory; C14N 1.0, C14N 1.1, Exclusive C14N, Base64, Enveloped, XPath, XPath2, XSLT TransformServices)");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ApacheXMLDSig");
methodVisitor.visitLdcInsn(new Double("2.14"));
methodVisitor.visitLdcInsn("Apache Santuario XMLDSig (DOM XMLSignatureFactory; DOM KeyInfoFactory; C14N 1.0, C14N 1.1, Exclusive C14N, Base64, Enveloped, XPath, XPath2, XSLT TransformServices)");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/Provider", "<init>", "(Ljava/lang/String;DLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/jcp/xml/dsig/internal/dom/XMLDSigRI$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jcp/xml/dsig/internal/dom/XMLDSigRI$1", "<init>", "(Lorg/apache/jcp/xml/dsig/internal/dom/XMLDSigRI;Ljava/security/Provider;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/jcp/xml/dsig/internal/dom/XMLDSigRI;Ljava/security/Provider$Service;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jcp/xml/dsig/internal/dom/XMLDSigRI", "putService", "(Ljava/security/Provider$Service;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/jcp/xml/dsig/internal/dom/XMLDSigRI;Ljava/security/Provider$Service;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jcp/xml/dsig/internal/dom/XMLDSigRI", "putService", "(Ljava/security/Provider$Service;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/apache/jcp/xml/dsig/internal/dom/XMLDSigRI;Ljava/security/Provider$Service;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jcp/xml/dsig/internal/dom/XMLDSigRI", "putService", "(Ljava/security/Provider$Service;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lorg/apache/jcp/xml/dsig/internal/dom/XMLDSigRI;Ljava/security/Provider$Service;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jcp/xml/dsig/internal/dom/XMLDSigRI", "putService", "(Ljava/security/Provider$Service;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lorg/apache/jcp/xml/dsig/internal/dom/XMLDSigRI;Ljava/security/Provider$Service;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jcp/xml/dsig/internal/dom/XMLDSigRI", "putService", "(Ljava/security/Provider$Service;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "(Lorg/apache/jcp/xml/dsig/internal/dom/XMLDSigRI;Ljava/security/Provider$Service;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jcp/xml/dsig/internal/dom/XMLDSigRI", "putService", "(Ljava/security/Provider$Service;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$600", "(Lorg/apache/jcp/xml/dsig/internal/dom/XMLDSigRI;Ljava/security/Provider$Service;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jcp/xml/dsig/internal/dom/XMLDSigRI", "putService", "(Ljava/security/Provider$Service;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$700", "(Lorg/apache/jcp/xml/dsig/internal/dom/XMLDSigRI;Ljava/security/Provider$Service;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jcp/xml/dsig/internal/dom/XMLDSigRI", "putService", "(Ljava/security/Provider$Service;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$800", "(Lorg/apache/jcp/xml/dsig/internal/dom/XMLDSigRI;Ljava/security/Provider$Service;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jcp/xml/dsig/internal/dom/XMLDSigRI", "putService", "(Ljava/security/Provider$Service;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$900", "(Lorg/apache/jcp/xml/dsig/internal/dom/XMLDSigRI;Ljava/security/Provider$Service;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jcp/xml/dsig/internal/dom/XMLDSigRI", "putService", "(Ljava/security/Provider$Service;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1000", "(Lorg/apache/jcp/xml/dsig/internal/dom/XMLDSigRI;Ljava/security/Provider$Service;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jcp/xml/dsig/internal/dom/XMLDSigRI", "putService", "(Ljava/security/Provider$Service;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1100", "(Lorg/apache/jcp/xml/dsig/internal/dom/XMLDSigRI;Ljava/security/Provider$Service;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jcp/xml/dsig/internal/dom/XMLDSigRI", "putService", "(Ljava/security/Provider$Service;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1200", "(Lorg/apache/jcp/xml/dsig/internal/dom/XMLDSigRI;Ljava/security/Provider$Service;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jcp/xml/dsig/internal/dom/XMLDSigRI", "putService", "(Ljava/security/Provider$Service;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
