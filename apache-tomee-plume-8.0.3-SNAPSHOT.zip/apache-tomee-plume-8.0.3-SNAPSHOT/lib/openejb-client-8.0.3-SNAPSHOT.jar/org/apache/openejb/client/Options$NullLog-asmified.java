package asm.org.apache.openejb.client;
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
public class Options$NullLogDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/client/Options$NullLog", null, "java/lang/Object", new String[] { "org/apache/openejb/client/Options$Log" });

classWriter.visitInnerClass("org/apache/openejb/client/Options$NullLog", "org/apache/openejb/client/Options", "NullLog", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/client/Options$Log", "org/apache/openejb/client/Options", "Log", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isDebugEnabled", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isInfoEnabled", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isWarningEnabled", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "warning", "(Ljava/lang/String;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "warning", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "debug", "(Ljava/lang/String;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "debug", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "info", "(Ljava/lang/String;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "info", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}