package asm.jakarta.websocket;
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
public class ClientEndpointConfig$Builder$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "jakarta/websocket/ClientEndpointConfig$Builder$1", null, "jakarta/websocket/ClientEndpointConfig$Configurator", null);

classWriter.visitOuterClass("jakarta/websocket/ClientEndpointConfig$Builder", null, null);

classWriter.visitInnerClass("jakarta/websocket/ClientEndpointConfig$Builder", "jakarta/websocket/ClientEndpointConfig", "Builder", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("jakarta/websocket/ClientEndpointConfig$Builder$1", null, null, ACC_STATIC);

classWriter.visitInnerClass("jakarta/websocket/ClientEndpointConfig$Configurator", "jakarta/websocket/ClientEndpointConfig", "Configurator", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/websocket/ClientEndpointConfig$Configurator", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
