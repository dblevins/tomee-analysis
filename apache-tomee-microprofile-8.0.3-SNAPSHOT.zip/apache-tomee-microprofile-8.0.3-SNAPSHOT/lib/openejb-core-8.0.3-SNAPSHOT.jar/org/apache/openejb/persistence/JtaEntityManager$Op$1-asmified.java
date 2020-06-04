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
public class JtaEntityManager$Op$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openejb/persistence/JtaEntityManager$Op$1", null, "org/apache/openejb/persistence/JtaEntityManager$Timer", null);

classWriter.visitOuterClass("org/apache/openejb/persistence/JtaEntityManager$Op", null, null);

classWriter.visitInnerClass("org/apache/openejb/persistence/JtaEntityManager$Op", "org/apache/openejb/persistence/JtaEntityManager", "Op", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/openejb/persistence/JtaEntityManager$Op$1", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/persistence/JtaEntityManager$Timer", "org/apache/openejb/persistence/JtaEntityManager", "Timer", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openejb/persistence/JtaEntityManager$Op;Lorg/apache/openejb/persistence/JtaEntityManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Timer", "<init>", "(Lorg/apache/openejb/persistence/JtaEntityManager$Op;Lorg/apache/openejb/persistence/JtaEntityManager;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "stop", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
