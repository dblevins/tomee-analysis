package asm.org.apache.openejb.util;
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
public class JuliLogStreamFactory$OpenEJBLogManager$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openejb/util/JuliLogStreamFactory$OpenEJBLogManager$1", null, "java/lang/Thread", null);

classWriter.visitOuterClass("org/apache/openejb/util/JuliLogStreamFactory$OpenEJBLogManager", null, null);

classWriter.visitInnerClass("org/apache/openejb/util/JuliLogStreamFactory$OpenEJBLogManager", "org/apache/openejb/util/JuliLogStreamFactory", "OpenEJBLogManager", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/util/JuliLogStreamFactory$OpenEJBLogManager$1", null, null, ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$mgr", "Ljava/util/logging/LogManager;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/util/logging/LogManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/JuliLogStreamFactory$OpenEJBLogManager$1", "val$mgr", "Ljava/util/logging/LogManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Thread", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/JuliLogStreamFactory$OpenEJBLogManager$1", "val$mgr", "Ljava/util/logging/LogManager;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/util/JuliLogStreamFactory$OpenEJBLogManager");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/JuliLogStreamFactory$OpenEJBLogManager", "forceReset", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
