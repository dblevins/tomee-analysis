package asm.org.apache.xml.security.stax.securityEvent;
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
public class KeyValueTokenSecurityEventDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/xml/security/stax/securityEvent/KeyValueTokenSecurityEvent", "Lorg/apache/xml/security/stax/securityEvent/TokenSecurityEvent<Lorg/apache/xml/security/stax/securityToken/SecurityToken;>;", "org/apache/xml/security/stax/securityEvent/TokenSecurityEvent", null);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityEvent/KeyValueTokenSecurityEvent$KeyValueTokenType", "org/apache/xml/security/stax/securityEvent/KeyValueTokenSecurityEvent", "KeyValueTokenType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event", "org/apache/xml/security/stax/securityEvent/SecurityEventConstants", "Event", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants", "KeyValueToken", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/TokenSecurityEvent", "<init>", "(Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKeyValueTokenType", "()Lorg/apache/xml/security/stax/securityEvent/KeyValueTokenSecurityEvent$KeyValueTokenType;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/IllegalArgumentException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "org/apache/xml/security/exceptions/XMLSecurityException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/KeyValueTokenSecurityEvent", "getSecurityToken", "()Lorg/apache/xml/security/stax/securityToken/SecurityToken;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/SecurityToken", "getPublicKey", "()Ljava/security/PublicKey;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/security/PublicKey", "getAlgorithm", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/stax/securityEvent/KeyValueTokenSecurityEvent$KeyValueTokenType", "valueOf", "(Ljava/lang/String;)Lorg/apache/xml/security/stax/securityEvent/KeyValueTokenSecurityEvent$KeyValueTokenType;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/IllegalArgumentException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/xml/security/exceptions/XMLSecurityException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
