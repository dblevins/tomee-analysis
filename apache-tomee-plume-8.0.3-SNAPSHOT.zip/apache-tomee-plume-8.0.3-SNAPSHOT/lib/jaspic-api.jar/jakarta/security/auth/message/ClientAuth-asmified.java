package asm.jakarta.security.auth.message;
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
public class ClientAuthDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/security/auth/message/ClientAuth", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "secureRequest", "(Ljakarta/security/auth/message/MessageInfo;Ljakarta/security/auth/Subject;)Ljakarta/security/auth/message/AuthStatus;", null, new String[] { "jakarta/security/auth/message/AuthException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "validateResponse", "(Ljakarta/security/auth/message/MessageInfo;Ljakarta/security/auth/Subject;Ljakarta/security/auth/Subject;)Ljakarta/security/auth/message/AuthStatus;", null, new String[] { "jakarta/security/auth/message/AuthException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "cleanSubject", "(Ljakarta/security/auth/message/MessageInfo;Ljakarta/security/auth/Subject;)V", null, new String[] { "jakarta/security/auth/message/AuthException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
