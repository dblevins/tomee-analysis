package asm.org.apache.xbean.asm7.tree.analysis;
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
public class InterpreterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/xbean/asm7/tree/analysis/Interpreter", "<V::Lorg/apache/xbean/asm7/tree/analysis/Value;>Ljava/lang/Object;", "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "api", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/analysis/Interpreter", "api", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newValue", "(Lorg/apache/xbean/asm7/Type;)Lorg/apache/xbean/asm7/tree/analysis/Value;", "(Lorg/apache/xbean/asm7/Type;)TV;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newParameterValue", "(ZILorg/apache/xbean/asm7/Type;)Lorg/apache/xbean/asm7/tree/analysis/Value;", "(ZILorg/apache/xbean/asm7/Type;)TV;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/analysis/Interpreter", "newValue", "(Lorg/apache/xbean/asm7/Type;)Lorg/apache/xbean/asm7/tree/analysis/Value;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newReturnTypeValue", "(Lorg/apache/xbean/asm7/Type;)Lorg/apache/xbean/asm7/tree/analysis/Value;", "(Lorg/apache/xbean/asm7/Type;)TV;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/analysis/Interpreter", "newValue", "(Lorg/apache/xbean/asm7/Type;)Lorg/apache/xbean/asm7/tree/analysis/Value;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newEmptyValue", "(I)Lorg/apache/xbean/asm7/tree/analysis/Value;", "(I)TV;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/analysis/Interpreter", "newValue", "(Lorg/apache/xbean/asm7/Type;)Lorg/apache/xbean/asm7/tree/analysis/Value;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newExceptionValue", "(Lorg/apache/xbean/asm7/tree/TryCatchBlockNode;Lorg/apache/xbean/asm7/tree/analysis/Frame;Lorg/apache/xbean/asm7/Type;)Lorg/apache/xbean/asm7/tree/analysis/Value;", "(Lorg/apache/xbean/asm7/tree/TryCatchBlockNode;Lorg/apache/xbean/asm7/tree/analysis/Frame<TV;>;Lorg/apache/xbean/asm7/Type;)TV;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/analysis/Interpreter", "newValue", "(Lorg/apache/xbean/asm7/Type;)Lorg/apache/xbean/asm7/tree/analysis/Value;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;)Lorg/apache/xbean/asm7/tree/analysis/Value;", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;)TV;", new String[] { "org/apache/xbean/asm7/tree/analysis/AnalyzerException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "copyOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Lorg/apache/xbean/asm7/tree/analysis/Value;)Lorg/apache/xbean/asm7/tree/analysis/Value;", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;TV;)TV;", new String[] { "org/apache/xbean/asm7/tree/analysis/AnalyzerException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unaryOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Lorg/apache/xbean/asm7/tree/analysis/Value;)Lorg/apache/xbean/asm7/tree/analysis/Value;", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;TV;)TV;", new String[] { "org/apache/xbean/asm7/tree/analysis/AnalyzerException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "binaryOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Lorg/apache/xbean/asm7/tree/analysis/Value;Lorg/apache/xbean/asm7/tree/analysis/Value;)Lorg/apache/xbean/asm7/tree/analysis/Value;", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;TV;TV;)TV;", new String[] { "org/apache/xbean/asm7/tree/analysis/AnalyzerException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "ternaryOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Lorg/apache/xbean/asm7/tree/analysis/Value;Lorg/apache/xbean/asm7/tree/analysis/Value;Lorg/apache/xbean/asm7/tree/analysis/Value;)Lorg/apache/xbean/asm7/tree/analysis/Value;", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;TV;TV;TV;)TV;", new String[] { "org/apache/xbean/asm7/tree/analysis/AnalyzerException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "naryOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Ljava/util/List;)Lorg/apache/xbean/asm7/tree/analysis/Value;", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Ljava/util/List<+TV;>;)TV;", new String[] { "org/apache/xbean/asm7/tree/analysis/AnalyzerException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "returnOperation", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;Lorg/apache/xbean/asm7/tree/analysis/Value;Lorg/apache/xbean/asm7/tree/analysis/Value;)V", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;TV;TV;)V", new String[] { "org/apache/xbean/asm7/tree/analysis/AnalyzerException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "merge", "(Lorg/apache/xbean/asm7/tree/analysis/Value;Lorg/apache/xbean/asm7/tree/analysis/Value;)Lorg/apache/xbean/asm7/tree/analysis/Value;", "(TV;TV;)TV;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
