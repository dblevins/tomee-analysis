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
public class XMLCipher$Factory$ReferenceListImpl$DataReferenceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/xml/security/encryption/XMLCipher$Factory$ReferenceListImpl$DataReference", null, "org/apache/xml/security/encryption/XMLCipher$Factory$ReferenceListImpl$ReferenceImpl", null);

classWriter.visitInnerClass("org/apache/xml/security/encryption/XMLCipher$Factory", "org/apache/xml/security/encryption/XMLCipher", "Factory", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/xml/security/encryption/XMLCipher$Factory$ReferenceListImpl", "org/apache/xml/security/encryption/XMLCipher$Factory", "ReferenceListImpl", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/xml/security/encryption/XMLCipher$Factory$ReferenceListImpl$DataReference", "org/apache/xml/security/encryption/XMLCipher$Factory$ReferenceListImpl", "DataReference", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/xml/security/encryption/XMLCipher$Factory$ReferenceListImpl$ReferenceImpl", "org/apache/xml/security/encryption/XMLCipher$Factory$ReferenceListImpl", "ReferenceImpl", ACC_PRIVATE | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$2", "Lorg/apache/xml/security/encryption/XMLCipher$Factory$ReferenceListImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/xml/security/encryption/XMLCipher$Factory$ReferenceListImpl;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/encryption/XMLCipher$Factory$ReferenceListImpl$DataReference", "this$2", "Lorg/apache/xml/security/encryption/XMLCipher$Factory$ReferenceListImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/encryption/XMLCipher$Factory$ReferenceListImpl$ReferenceImpl", "<init>", "(Lorg/apache/xml/security/encryption/XMLCipher$Factory$ReferenceListImpl;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("DataReference");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
