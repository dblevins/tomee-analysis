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
public class Logger$3Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openejb/util/Logger$3", "Ljava/lang/Object;Lorg/apache/openejb/util/Computable<Lorg/apache/openejb/util/Logger$LoggerKey;Lorg/apache/openejb/util/Logger;>;", "java/lang/Object", new String[] { "org/apache/openejb/util/Computable" });

classWriter.visitOuterClass("org/apache/openejb/util/Logger", null, null);

classWriter.visitInnerClass("org/apache/openejb/util/Logger$3", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/util/Logger$LoggerKey", "org/apache/openejb/util/Logger", "LoggerKey", ACC_PROTECTED | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "compute", "(Lorg/apache/openejb/util/Logger$LoggerKey;)Lorg/apache/openejb/util/Logger;", null, new String[] { "java/lang/InterruptedException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/util/Logger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Logger$LoggerKey", "category", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Logger", "access$000", "()Lorg/apache/openejb/util/LogStreamFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Logger$LoggerKey", "category", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/util/LogStreamFactory", "createLogStream", "(Lorg/apache/openejb/util/LogCategory;)Lorg/apache/openejb/util/LogStream;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Logger$LoggerKey", "baseName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/Logger", "<init>", "(Lorg/apache/openejb/util/LogCategory;Lorg/apache/openejb/util/LogStream;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "compute", "(Ljava/lang/Object;)Ljava/lang/Object;", null, new String[] { "java/lang/InterruptedException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/util/Logger$LoggerKey");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Logger$3", "compute", "(Lorg/apache/openejb/util/Logger$LoggerKey;)Lorg/apache/openejb/util/Logger;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
