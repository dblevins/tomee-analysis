package asm.org.apache.cxf.transport;
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
public class AbstractDestination$AbstractBackChannelConduitDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/cxf/transport/AbstractDestination$AbstractBackChannelConduit", null, "org/apache/cxf/transport/AbstractConduit", null);

classWriter.visitInnerClass("org/apache/cxf/transport/AbstractDestination$AbstractBackChannelConduit", "org/apache/cxf/transport/AbstractDestination", "AbstractBackChannelConduit", ACC_PROTECTED | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/transport/AbstractDestination;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/transport/AbstractDestination;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/AbstractDestination$AbstractBackChannelConduit", "this$0", "Lorg/apache/cxf/transport/AbstractDestination;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/transport/AbstractDestination", "access$000", "()Lorg/apache/cxf/ws/addressing/EndpointReferenceType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/AbstractConduit", "<init>", "(Lorg/apache/cxf/ws/addressing/EndpointReferenceType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMessageObserver", "(Lorg/apache/cxf/transport/MessageObserver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getLogger", "()Ljava/util/logging/Logger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/AbstractDestination$AbstractBackChannelConduit", "this$0", "Lorg/apache/cxf/transport/AbstractDestination;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/AbstractDestination", "getLogger", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
