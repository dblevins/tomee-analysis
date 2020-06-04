package asm.org.apache.openejb.persistence;
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
public class JtaEntityManagerRegistry$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/persistence/JtaEntityManagerRegistry$1", "Ljava/lang/ThreadLocal<Lorg/apache/openejb/persistence/JtaEntityManagerRegistry$ExtendedRegistry;>;", "java/lang/ThreadLocal", null);

classWriter.visitOuterClass("org/apache/openejb/persistence/JtaEntityManagerRegistry", null, null);

classWriter.visitInnerClass("org/apache/openejb/persistence/JtaEntityManagerRegistry$1", null, null, 0);

classWriter.visitInnerClass("org/apache/openejb/persistence/JtaEntityManagerRegistry$ExtendedRegistry", "org/apache/openejb/persistence/JtaEntityManagerRegistry", "ExtendedRegistry", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/persistence/JtaEntityManagerRegistry;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openejb/persistence/JtaEntityManagerRegistry;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/persistence/JtaEntityManagerRegistry$1", "this$0", "Lorg/apache/openejb/persistence/JtaEntityManagerRegistry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ThreadLocal", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initialValue", "()Lorg/apache/openejb/persistence/JtaEntityManagerRegistry$ExtendedRegistry;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManagerRegistry$ExtendedRegistry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/JtaEntityManagerRegistry$1", "this$0", "Lorg/apache/openejb/persistence/JtaEntityManagerRegistry;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManagerRegistry$ExtendedRegistry", "<init>", "(Lorg/apache/openejb/persistence/JtaEntityManagerRegistry;Lorg/apache/openejb/persistence/JtaEntityManagerRegistry$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "initialValue", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/JtaEntityManagerRegistry$1", "initialValue", "()Lorg/apache/openejb/persistence/JtaEntityManagerRegistry$ExtendedRegistry;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
