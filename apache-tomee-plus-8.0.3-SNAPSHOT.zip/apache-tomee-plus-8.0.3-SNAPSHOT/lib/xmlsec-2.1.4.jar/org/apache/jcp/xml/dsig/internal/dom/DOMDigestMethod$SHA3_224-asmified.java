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
public class DOMDigestMethod$SHA3_224Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/jcp/xml/dsig/internal/dom/DOMDigestMethod$SHA3_224", null, "org/apache/jcp/xml/dsig/internal/dom/DOMDigestMethod", null);

classWriter.visitInnerClass("org/apache/jcp/xml/dsig/internal/dom/DOMDigestMethod$SHA3_224", "org/apache/jcp/xml/dsig/internal/dom/DOMDigestMethod", "SHA3_224", ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/security/spec/AlgorithmParameterSpec;)V", null, new String[] { "java/security/InvalidAlgorithmParameterException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jcp/xml/dsig/internal/dom/DOMDigestMethod", "<init>", "(Ljava/security/spec/AlgorithmParameterSpec;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/w3c/dom/Element;)V", null, new String[] { "javax/xml/crypto/MarshalException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jcp/xml/dsig/internal/dom/DOMDigestMethod", "<init>", "(Lorg/w3c/dom/Element;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAlgorithm", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("http://www.w3.org/2007/05/xmldsig-more#sha3-224");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getMessageDigestAlgorithm", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("SHA3-224");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
