package asm.org.apache.openejb.terracotta.quartz;
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
public class DefaultClusteredJobStore$ShutdownHookDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/openejb/terracotta/quartz/DefaultClusteredJobStore$ShutdownHook", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitInnerClass("org/apache/openejb/terracotta/quartz/DefaultClusteredJobStore$ShutdownHook", "org/apache/openejb/terracotta/quartz/DefaultClusteredJobStore", "ShutdownHook", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "store", "Lorg/apache/openejb/terracotta/quartz/DefaultClusteredJobStore;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openejb/terracotta/quartz/DefaultClusteredJobStore;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/DefaultClusteredJobStore$ShutdownHook", "store", "Lorg/apache/openejb/terracotta/quartz/DefaultClusteredJobStore;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/DefaultClusteredJobStore$ShutdownHook", "store", "Lorg/apache/openejb/terracotta/quartz/DefaultClusteredJobStore;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/terracotta/quartz/DefaultClusteredJobStore", "access$100", "(Lorg/apache/openejb/terracotta/quartz/DefaultClusteredJobStore;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
