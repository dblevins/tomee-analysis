package asm.org.apache.wss4j.stax.securityEvent;
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

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/wss4j/stax/securityEvent/KeyValueTokenSecurityEvent", "Lorg/apache/xml/security/stax/securityEvent/TokenSecurityEvent<Lorg/apache/wss4j/stax/securityToken/KeyValueSecurityToken;>;", "org/apache/xml/security/stax/securityEvent/TokenSecurityEvent", null);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event", "org/apache/xml/security/stax/securityEvent/SecurityEventConstants", "Event", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/securityEvent/WSSecurityEventConstants", "KeyValueToken", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/TokenSecurityEvent", "<init>", "(Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
