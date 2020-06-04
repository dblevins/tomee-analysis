package asm.org.apache.openejb.server.httpd;
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
public class EEFilter$CdiRequestDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/server/httpd/EEFilter$CdiRequest", null, "org/apache/openejb/server/httpd/EEFilter$NoCdiRequest", null);

classWriter.visitInnerClass("org/apache/openejb/server/httpd/EEFilter$CdiRequest", "org/apache/openejb/server/httpd/EEFilter", "CdiRequest", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper", "org/apache/openejb/server/httpd/EEFilter", "AsynContextWrapper", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/server/httpd/EEFilter$NoCdiRequest", "org/apache/openejb/server/httpd/EEFilter", "NoCdiRequest", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/servlet/http/HttpServletRequest;Lorg/apache/webbeans/config/WebBeansContext;Lorg/apache/openejb/server/httpd/EEFilter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/httpd/EEFilter$NoCdiRequest", "<init>", "(Ljavax/servlet/http/HttpServletRequest;Lorg/apache/openejb/server/httpd/EEFilter;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/httpd/EEFilter$CdiRequest", "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startAsync", "()Ljavax/servlet/AsyncContext;", null, new String[] { "java/lang/IllegalStateException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/httpd/EEFilter$NoCdiRequest", "startAsync", "()Ljavax/servlet/AsyncContext;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/httpd/EEFilter$CdiRequest", "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper", "<init>", "(Ljavax/servlet/AsyncContext;Ljavax/servlet/ServletRequest;Lorg/apache/webbeans/config/WebBeansContext;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startAsync", "(Ljavax/servlet/ServletRequest;Ljavax/servlet/ServletResponse;)Ljavax/servlet/AsyncContext;", null, new String[] { "java/lang/IllegalStateException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/httpd/EEFilter$NoCdiRequest", "startAsync", "(Ljavax/servlet/ServletRequest;Ljavax/servlet/ServletResponse;)Ljavax/servlet/AsyncContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/httpd/EEFilter$CdiRequest", "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper", "<init>", "(Ljavax/servlet/AsyncContext;Ljavax/servlet/ServletRequest;Lorg/apache/webbeans/config/WebBeansContext;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
