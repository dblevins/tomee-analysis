package asm.org.apache.cxf.jaxrs.client.spec;
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
public class ClientBuilderImpl$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl$1", null, "org/apache/cxf/jaxrs/client/spec/ClientImpl", null);

classWriter.visitOuterClass("org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "build", "()Ljavax/ws/rs/client/Client;");

classWriter.visitInnerClass("org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/jaxrs/client/spec/ClientBuilderImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/jaxrs/client/spec/ClientBuilderImpl;Ljavax/ws/rs/core/Configuration;Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl$1", "this$0", "Lorg/apache/cxf/jaxrs/client/spec/ClientBuilderImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/client/spec/ClientImpl", "<init>", "(Ljavax/ws/rs/core/Configuration;Lorg/apache/cxf/jaxrs/client/spec/TLSConfiguration;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/client/spec/ClientImpl", "close", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl$1", "this$0", "Lorg/apache/cxf/jaxrs/client/spec/ClientBuilderImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/client/spec/ClientBuilderImpl", "access$000", "(Lorg/apache/cxf/jaxrs/client/spec/ClientBuilderImpl;)Lorg/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl", "close", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
