package asm.org.apache.openejb.server.cxf.client;
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
public class SaajOutInterceptorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/server/cxf/client/SaajOutInterceptor", null, "org/apache/openejb/server/cxf/client/SaajInterceptor", null);

classWriter.visitInnerClass("org/apache/openejb/server/webservices/saaj/SaajUniverse$Type", "org/apache/openejb/server/webservices/saaj/SaajUniverse", "Type", ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/server/webservices/saaj/SaajUniverse;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("setup");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/cxf/client/SaajInterceptor", "<init>", "(Ljava/lang/String;Lorg/apache/openejb/server/webservices/saaj/SaajUniverse;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "handleMessage", "(Lorg/apache/cxf/message/Message;)V", null, new String[] { "org/apache/cxf/interceptor/Fault" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/client/SaajOutInterceptor", "universe", "Lorg/apache/openejb/server/webservices/saaj/SaajUniverse;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/server/webservices/saaj/SaajUniverse", "DEFAULT", "Lorg/apache/openejb/server/webservices/saaj/SaajUniverse$Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/webservices/saaj/SaajUniverse", "set", "(Lorg/apache/openejb/server/webservices/saaj/SaajUniverse$Type;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "handleFault", "(Lorg/apache/cxf/message/Message;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/client/SaajOutInterceptor", "universe", "Lorg/apache/openejb/server/webservices/saaj/SaajUniverse;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/webservices/saaj/SaajUniverse", "unset", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
