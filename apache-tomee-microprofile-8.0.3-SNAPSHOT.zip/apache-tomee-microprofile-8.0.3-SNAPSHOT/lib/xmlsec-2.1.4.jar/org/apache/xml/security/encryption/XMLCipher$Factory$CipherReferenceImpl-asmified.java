package asm.org.apache.xml.security.encryption;
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
public class XMLCipher$Factory$CipherReferenceImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/xml/security/encryption/XMLCipher$Factory$CipherReferenceImpl", null, "java/lang/Object", new String[] { "org/apache/xml/security/encryption/CipherReference" });

classWriter.visitInnerClass("org/apache/xml/security/encryption/XMLCipher$Factory", "org/apache/xml/security/encryption/XMLCipher", "Factory", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/xml/security/encryption/XMLCipher$Factory$CipherReferenceImpl", "org/apache/xml/security/encryption/XMLCipher$Factory", "CipherReferenceImpl", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/xml/security/encryption/XMLCipher$Factory$TransformsImpl", "org/apache/xml/security/encryption/XMLCipher$Factory", "TransformsImpl", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "referenceURI", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "referenceTransforms", "Lorg/apache/xml/security/encryption/Transforms;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "referenceNode", "Lorg/w3c/dom/Attr;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/xml/security/encryption/XMLCipher$Factory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/xml/security/encryption/XMLCipher$Factory;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/encryption/XMLCipher$Factory$CipherReferenceImpl", "this$1", "Lorg/apache/xml/security/encryption/XMLCipher$Factory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/encryption/XMLCipher$Factory$CipherReferenceImpl", "referenceURI", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/encryption/XMLCipher$Factory$CipherReferenceImpl", "referenceNode", "Lorg/w3c/dom/Attr;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/xml/security/encryption/XMLCipher$Factory;Lorg/w3c/dom/Attr;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/encryption/XMLCipher$Factory$CipherReferenceImpl", "this$1", "Lorg/apache/xml/security/encryption/XMLCipher$Factory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getNodeValue", "()Ljava/lang/String;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/encryption/XMLCipher$Factory$CipherReferenceImpl", "referenceURI", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/encryption/XMLCipher$Factory$CipherReferenceImpl", "referenceNode", "Lorg/w3c/dom/Attr;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getURI", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/encryption/XMLCipher$Factory$CipherReferenceImpl", "referenceURI", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getURIAsAttr", "()Lorg/w3c/dom/Attr;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/encryption/XMLCipher$Factory$CipherReferenceImpl", "referenceNode", "Lorg/w3c/dom/Attr;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTransforms", "()Lorg/apache/xml/security/encryption/Transforms;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/encryption/XMLCipher$Factory$CipherReferenceImpl", "referenceTransforms", "Lorg/apache/xml/security/encryption/Transforms;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTransforms", "(Lorg/apache/xml/security/encryption/Transforms;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/encryption/XMLCipher$Factory$CipherReferenceImpl", "referenceTransforms", "Lorg/apache/xml/security/encryption/Transforms;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "toElement", "()Lorg/w3c/dom/Element;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/encryption/XMLCipher$Factory$CipherReferenceImpl", "this$1", "Lorg/apache/xml/security/encryption/XMLCipher$Factory;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/encryption/XMLCipher$Factory", "this$0", "Lorg/apache/xml/security/encryption/XMLCipher;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/encryption/XMLCipher", "access$500", "(Lorg/apache/xml/security/encryption/XMLCipher;)Lorg/w3c/dom/Document;", false);
methodVisitor.visitLdcInsn("CipherReference");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/utils/XMLUtils", "createElementInEncryptionSpace", "(Lorg/w3c/dom/Document;Ljava/lang/String;)Lorg/w3c/dom/Element;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn("URI");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/encryption/XMLCipher$Factory$CipherReferenceImpl", "referenceURI", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "setAttributeNS", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/encryption/XMLCipher$Factory$CipherReferenceImpl", "referenceTransforms", "Lorg/apache/xml/security/encryption/Transforms;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/encryption/XMLCipher$Factory$CipherReferenceImpl", "referenceTransforms", "Lorg/apache/xml/security/encryption/Transforms;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xml/security/encryption/XMLCipher$Factory$TransformsImpl");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/encryption/XMLCipher$Factory$TransformsImpl", "toElement", "()Lorg/w3c/dom/Element;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "appendChild", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/w3c/dom/Element"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
