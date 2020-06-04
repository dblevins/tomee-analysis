package asm.org.apache.commons.lang3.concurrent;
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
public class AbstractCircuitBreaker$State$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/commons/lang3/concurrent/AbstractCircuitBreaker$State$2", null, "org/apache/commons/lang3/concurrent/AbstractCircuitBreaker$State", null);

classWriter.visitOuterClass("org/apache/commons/lang3/concurrent/AbstractCircuitBreaker$State", null, null);

classWriter.visitInnerClass("org/apache/commons/lang3/concurrent/AbstractCircuitBreaker$State", "org/apache/commons/lang3/concurrent/AbstractCircuitBreaker", "State", ACC_PROTECTED | ACC_STATIC | ACC_ENUM | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/commons/lang3/concurrent/AbstractCircuitBreaker$State$2", null, null, ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/commons/lang3/concurrent/AbstractCircuitBreaker$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/lang/String;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/concurrent/AbstractCircuitBreaker$State", "<init>", "(Ljava/lang/String;ILorg/apache/commons/lang3/concurrent/AbstractCircuitBreaker$1;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "oppositeState", "()Lorg/apache/commons/lang3/concurrent/AbstractCircuitBreaker$State;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/concurrent/AbstractCircuitBreaker$State$2", "CLOSED", "Lorg/apache/commons/lang3/concurrent/AbstractCircuitBreaker$State;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
