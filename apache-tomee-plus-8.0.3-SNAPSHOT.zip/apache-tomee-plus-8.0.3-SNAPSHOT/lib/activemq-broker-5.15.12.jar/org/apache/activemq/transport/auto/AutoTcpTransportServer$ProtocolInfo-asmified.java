package asm.org.apache.activemq.transport.auto;
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
public class AutoTcpTransportServer$ProtocolInfoDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/transport/auto/AutoTcpTransportServer$ProtocolInfo", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/activemq/transport/auto/AutoTcpTransportServer$ProtocolInfo", "org/apache/activemq/transport/auto/AutoTcpTransportServer", "ProtocolInfo", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "detectedTransportFactory", "Lorg/apache/activemq/transport/tcp/TcpTransportFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "detectedWireFormatFactory", "Lorg/apache/activemq/wireformat/WireFormatFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/transport/auto/AutoTcpTransportServer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/transport/auto/AutoTcpTransportServer;Lorg/apache/activemq/transport/tcp/TcpTransportFactory;Lorg/apache/activemq/wireformat/WireFormatFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/auto/AutoTcpTransportServer$ProtocolInfo", "this$0", "Lorg/apache/activemq/transport/auto/AutoTcpTransportServer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/auto/AutoTcpTransportServer$ProtocolInfo", "detectedTransportFactory", "Lorg/apache/activemq/transport/tcp/TcpTransportFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/auto/AutoTcpTransportServer$ProtocolInfo", "detectedWireFormatFactory", "Lorg/apache/activemq/wireformat/WireFormatFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
