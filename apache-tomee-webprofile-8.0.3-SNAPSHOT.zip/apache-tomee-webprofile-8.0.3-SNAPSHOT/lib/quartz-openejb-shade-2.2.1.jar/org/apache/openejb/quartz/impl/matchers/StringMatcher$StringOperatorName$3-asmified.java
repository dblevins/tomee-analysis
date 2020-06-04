package asm.org.apache.openejb.quartz.impl.matchers;
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
public class StringMatcher$StringOperatorName$3Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName$3", null, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", null);

classWriter.visitOuterClass("org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", null, null);

classWriter.visitInnerClass("org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName$3", null, null, ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "org/apache/openejb/quartz/impl/matchers/StringMatcher", "StringOperatorName", ACC_PUBLIC | ACC_STATIC | ACC_ENUM | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/openejb/quartz/impl/matchers/StringMatcher$1", "org/apache/openejb/quartz/impl/matchers/StringMatcher", null, ACC_STATIC | ACC_SYNTHETIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/lang/String;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "<init>", "(Ljava/lang/String;ILorg/apache/openejb/quartz/impl/matchers/StringMatcher$1;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "evaluate", "(Ljava/lang/String;Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "endsWith", "(Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
