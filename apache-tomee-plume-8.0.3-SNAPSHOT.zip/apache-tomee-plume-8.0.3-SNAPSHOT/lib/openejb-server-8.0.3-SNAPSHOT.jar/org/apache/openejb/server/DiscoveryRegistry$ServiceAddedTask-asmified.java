package asm.org.apache.openejb.server;
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
public class DiscoveryRegistry$ServiceAddedTaskDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/server/DiscoveryRegistry$ServiceAddedTask", null, "org/apache/openejb/server/DiscoveryRegistry$Task", null);

classWriter.visitInnerClass("org/apache/openejb/server/DiscoveryRegistry$ServiceAddedTask", "org/apache/openejb/server/DiscoveryRegistry", "ServiceAddedTask", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/server/DiscoveryRegistry$Task", "org/apache/openejb/server/DiscoveryRegistry", "Task", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/server/DiscoveryListener;Ljava/net/URI;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/DiscoveryRegistry$Task", "<init>", "(Lorg/apache/openejb/server/DiscoveryListener;Ljava/net/URI;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/DiscoveryRegistry$ServiceAddedTask", "discoveryListener", "Lorg/apache/openejb/server/DiscoveryListener;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/DiscoveryRegistry$ServiceAddedTask", "discoveryListener", "Lorg/apache/openejb/server/DiscoveryListener;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/DiscoveryRegistry$ServiceAddedTask", "service", "Ljava/net/URI;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/server/DiscoveryListener", "serviceAdded", "(Ljava/net/URI;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
