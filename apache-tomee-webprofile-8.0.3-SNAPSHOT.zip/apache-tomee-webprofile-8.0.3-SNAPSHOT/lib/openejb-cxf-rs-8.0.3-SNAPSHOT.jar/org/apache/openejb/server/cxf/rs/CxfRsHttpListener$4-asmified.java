package asm.org.apache.openejb.server.cxf.rs;
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
public class CxfRsHttpListener$4Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/server/cxf/rs/CxfRsHttpListener$4", null, "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationInInterceptor", null);

classWriter.visitOuterClass("org/apache/openejb/server/cxf/rs/CxfRsHttpListener", "configureFactory", "(Ljava/util/Collection;Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;Lorg/apache/cxf/jaxrs/JAXRSServerFactoryBean;Lorg/apache/webbeans/config/WebBeansContext;)V");

classWriter.visitInnerClass("org/apache/openejb/server/cxf/rs/CxfRsHttpListener$4", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/server/cxf/rs/CxfRsHttpListener;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openejb/server/cxf/rs/CxfRsHttpListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/cxf/rs/CxfRsHttpListener$4", "this$0", "Lorg/apache/openejb/server/cxf/rs/CxfRsHttpListener;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationInInterceptor", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getServiceObject", "(Lorg/apache/cxf/message/Message;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/rs/CxfRsHttpListener$4", "this$0", "Lorg/apache/openejb/server/cxf/rs/CxfRsHttpListener;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/cxf/rs/CxfRsHttpListener", "access$200", "(Lorg/apache/openejb/server/cxf/rs/CxfRsHttpListener;Lorg/apache/cxf/message/Message;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
