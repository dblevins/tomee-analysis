package asm.org.apache.catalina.connector;
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
public class RequestFacade$GetRequestDispatcherPrivilegedActionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/catalina/connector/RequestFacade$GetRequestDispatcherPrivilegedAction", "Ljava/lang/Object;Ljava/security/PrivilegedAction<Ljavax/servlet/RequestDispatcher;>;", "java/lang/Object", new String[] { "java/security/PrivilegedAction" });

classWriter.visitInnerClass("org/apache/catalina/connector/RequestFacade$GetRequestDispatcherPrivilegedAction", "org/apache/catalina/connector/RequestFacade", "GetRequestDispatcherPrivilegedAction", ACC_PRIVATE | ACC_FINAL);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "path", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/catalina/connector/RequestFacade;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/catalina/connector/RequestFacade;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/RequestFacade$GetRequestDispatcherPrivilegedAction", "this$0", "Lorg/apache/catalina/connector/RequestFacade;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/RequestFacade$GetRequestDispatcherPrivilegedAction", "path", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()Ljavax/servlet/RequestDispatcher;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/RequestFacade$GetRequestDispatcherPrivilegedAction", "this$0", "Lorg/apache/catalina/connector/RequestFacade;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/RequestFacade", "request", "Lorg/apache/catalina/connector/Request;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/RequestFacade$GetRequestDispatcherPrivilegedAction", "path", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Request", "getRequestDispatcher", "(Ljava/lang/String;)Ljavax/servlet/RequestDispatcher;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "run", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/RequestFacade$GetRequestDispatcherPrivilegedAction", "run", "()Ljavax/servlet/RequestDispatcher;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
