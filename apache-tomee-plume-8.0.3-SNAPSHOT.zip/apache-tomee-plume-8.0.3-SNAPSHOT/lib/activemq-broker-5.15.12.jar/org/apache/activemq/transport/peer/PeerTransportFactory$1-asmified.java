package asm.org.apache.activemq.transport.peer;
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
public class PeerTransportFactory$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/transport/peer/PeerTransportFactory$1", null, "org/apache/activemq/transport/vm/VMTransportFactory", null);

classWriter.visitOuterClass("org/apache/activemq/transport/peer/PeerTransportFactory", "createTransportFactory", "(Ljava/net/URI;)Lorg/apache/activemq/transport/vm/VMTransportFactory;");

classWriter.visitInnerClass("org/apache/activemq/transport/peer/PeerTransportFactory$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$finalLocation", "Ljava/net/URI;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/transport/peer/PeerTransportFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/transport/peer/PeerTransportFactory;Ljava/net/URI;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/peer/PeerTransportFactory$1", "this$0", "Lorg/apache/activemq/transport/peer/PeerTransportFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/peer/PeerTransportFactory$1", "val$finalLocation", "Ljava/net/URI;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/vm/VMTransportFactory", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doConnect", "(Ljava/net/URI;)Lorg/apache/activemq/transport/Transport;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/peer/PeerTransportFactory$1", "val$finalLocation", "Ljava/net/URI;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/vm/VMTransportFactory", "doConnect", "(Ljava/net/URI;)Lorg/apache/activemq/transport/Transport;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doCompositeConnect", "(Ljava/net/URI;)Lorg/apache/activemq/transport/Transport;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/peer/PeerTransportFactory$1", "val$finalLocation", "Ljava/net/URI;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/vm/VMTransportFactory", "doCompositeConnect", "(Ljava/net/URI;)Lorg/apache/activemq/transport/Transport;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
