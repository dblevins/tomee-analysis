package asm.org.apache.geronimo.javamail.store.pop3;
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
public class POP3SSLStoreDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/javamail/store/pop3/POP3SSLStore", null, "org/apache/geronimo/javamail/store/pop3/POP3Store", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/mail/Session;Ljakarta/mail/URLName;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("pop3s");
methodVisitor.visitIntInsn(SIPUSH, 995);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/javamail/store/pop3/POP3Store", "<init>", "(Ljakarta/mail/Session;Ljakarta/mail/URLName;Ljava/lang/String;IZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
