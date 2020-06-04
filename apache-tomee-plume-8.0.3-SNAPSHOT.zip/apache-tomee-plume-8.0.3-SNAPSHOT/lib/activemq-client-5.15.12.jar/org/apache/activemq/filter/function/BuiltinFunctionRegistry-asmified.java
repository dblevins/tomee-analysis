package asm.org.apache.activemq.filter.function;
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
public class BuiltinFunctionRegistryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/filter/function/BuiltinFunctionRegistry", null, "java/lang/Object", null);

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "register", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("INLIST");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/filter/function/inListFunction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/filter/function/inListFunction", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/filter/FunctionCallExpression", "registerFunction", "(Ljava/lang/String;Lorg/apache/activemq/filter/function/FilterFunction;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLdcInsn("MAKELIST");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/filter/function/makeListFunction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/filter/function/makeListFunction", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/filter/FunctionCallExpression", "registerFunction", "(Ljava/lang/String;Lorg/apache/activemq/filter/function/FilterFunction;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLdcInsn("REGEX");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/filter/function/regexMatchFunction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/filter/function/regexMatchFunction", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/filter/FunctionCallExpression", "registerFunction", "(Ljava/lang/String;Lorg/apache/activemq/filter/function/FilterFunction;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLdcInsn("REPLACE");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/filter/function/replaceFunction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/filter/function/replaceFunction", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/filter/FunctionCallExpression", "registerFunction", "(Ljava/lang/String;Lorg/apache/activemq/filter/function/FilterFunction;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLdcInsn("SPLIT");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/filter/function/splitFunction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/filter/function/splitFunction", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/filter/FunctionCallExpression", "registerFunction", "(Ljava/lang/String;Lorg/apache/activemq/filter/function/FilterFunction;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
