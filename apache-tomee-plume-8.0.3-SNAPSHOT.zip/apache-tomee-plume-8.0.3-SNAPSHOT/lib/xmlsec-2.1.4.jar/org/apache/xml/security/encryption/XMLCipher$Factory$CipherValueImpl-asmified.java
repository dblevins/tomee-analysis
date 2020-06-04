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
public class XMLCipher$Factory$CipherValueImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/xml/security/encryption/XMLCipher$Factory$CipherValueImpl", null, "java/lang/Object", new String[] { "org/apache/xml/security/encryption/CipherValue" });

classWriter.visitInnerClass("org/apache/xml/security/encryption/XMLCipher$Factory", "org/apache/xml/security/encryption/XMLCipher", "Factory", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/xml/security/encryption/XMLCipher$Factory$CipherValueImpl", "org/apache/xml/security/encryption/XMLCipher$Factory", "CipherValueImpl", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "cipherValue", "Ljava/lang/String;", null, null);
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
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/encryption/XMLCipher$Factory$CipherValueImpl", "this$1", "Lorg/apache/xml/security/encryption/XMLCipher$Factory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/encryption/XMLCipher$Factory$CipherValueImpl", "cipherValue", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValue", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/encryption/XMLCipher$Factory$CipherValueImpl", "cipherValue", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValue", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/encryption/XMLCipher$Factory$CipherValueImpl", "cipherValue", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "toElement", "()Lorg/w3c/dom/Element;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/encryption/XMLCipher$Factory$CipherValueImpl", "this$1", "Lorg/apache/xml/security/encryption/XMLCipher$Factory;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/encryption/XMLCipher$Factory", "this$0", "Lorg/apache/xml/security/encryption/XMLCipher;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/encryption/XMLCipher", "access$500", "(Lorg/apache/xml/security/encryption/XMLCipher;)Lorg/w3c/dom/Document;", false);
methodVisitor.visitLdcInsn("CipherValue");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/utils/XMLUtils", "createElementInEncryptionSpace", "(Lorg/w3c/dom/Document;Ljava/lang/String;)Lorg/w3c/dom/Element;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/encryption/XMLCipher$Factory$CipherValueImpl", "this$1", "Lorg/apache/xml/security/encryption/XMLCipher$Factory;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/encryption/XMLCipher$Factory", "this$0", "Lorg/apache/xml/security/encryption/XMLCipher;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/encryption/XMLCipher", "access$500", "(Lorg/apache/xml/security/encryption/XMLCipher;)Lorg/w3c/dom/Document;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/encryption/XMLCipher$Factory$CipherValueImpl", "cipherValue", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Document", "createTextNode", "(Ljava/lang/String;)Lorg/w3c/dom/Text;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "appendChild", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
