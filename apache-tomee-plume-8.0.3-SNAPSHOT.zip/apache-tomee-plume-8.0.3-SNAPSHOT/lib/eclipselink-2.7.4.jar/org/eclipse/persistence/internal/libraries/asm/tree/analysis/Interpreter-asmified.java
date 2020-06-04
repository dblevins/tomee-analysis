package asm.org.eclipse.persistence.internal.libraries.asm.tree.analysis;
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

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/Interpreter", "<V::Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;>Ljava/lang/Object;", "java/lang/Object", null);

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
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/Interpreter", "api", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newValue", "(Lorg/eclipse/persistence/internal/libraries/asm/Type;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;", "(Lorg/eclipse/persistence/internal/libraries/asm/Type;)TV;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newParameterValue", "(ZILorg/eclipse/persistence/internal/libraries/asm/Type;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;", "(ZILorg/eclipse/persistence/internal/libraries/asm/Type;)TV;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/Interpreter", "newValue", "(Lorg/eclipse/persistence/internal/libraries/asm/Type;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newReturnTypeValue", "(Lorg/eclipse/persistence/internal/libraries/asm/Type;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;", "(Lorg/eclipse/persistence/internal/libraries/asm/Type;)TV;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/Interpreter", "newValue", "(Lorg/eclipse/persistence/internal/libraries/asm/Type;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newEmptyValue", "(I)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;", "(I)TV;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/Interpreter", "newValue", "(Lorg/eclipse/persistence/internal/libraries/asm/Type;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newExceptionValue", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/TryCatchBlockNode;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Frame;Lorg/eclipse/persistence/internal/libraries/asm/Type;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/TryCatchBlockNode;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Frame<TV;>;Lorg/eclipse/persistence/internal/libraries/asm/Type;)TV;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/Interpreter", "newValue", "(Lorg/eclipse/persistence/internal/libraries/asm/Type;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;)TV;", new String[] { "org/eclipse/persistence/internal/libraries/asm/tree/analysis/AnalyzerException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "copyOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;TV;)TV;", new String[] { "org/eclipse/persistence/internal/libraries/asm/tree/analysis/AnalyzerException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unaryOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;TV;)TV;", new String[] { "org/eclipse/persistence/internal/libraries/asm/tree/analysis/AnalyzerException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "binaryOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;TV;TV;)TV;", new String[] { "org/eclipse/persistence/internal/libraries/asm/tree/analysis/AnalyzerException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "ternaryOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;TV;TV;TV;)TV;", new String[] { "org/eclipse/persistence/internal/libraries/asm/tree/analysis/AnalyzerException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "naryOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Ljava/util/List;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Ljava/util/List<+TV;>;)TV;", new String[] { "org/eclipse/persistence/internal/libraries/asm/tree/analysis/AnalyzerException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "returnOperation", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;)V", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;TV;TV;)V", new String[] { "org/eclipse/persistence/internal/libraries/asm/tree/analysis/AnalyzerException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "merge", "(Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;)Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/Value;", "(TV;TV;)TV;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
