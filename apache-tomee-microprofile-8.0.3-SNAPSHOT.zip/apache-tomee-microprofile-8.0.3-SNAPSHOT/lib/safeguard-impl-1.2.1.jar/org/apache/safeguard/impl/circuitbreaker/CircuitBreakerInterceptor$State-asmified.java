package asm.org.apache.safeguard.impl.circuitbreaker;
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
public class CircuitBreakerInterceptor$StateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER | ACC_ENUM | ACC_ABSTRACT, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State", "Ljava/lang/Enum<Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State", "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor", "State", ACC_PRIVATE | ACC_STATIC | ACC_ENUM | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State$3", null, null, ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State$2", null, null, ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State$1", null, null, ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl", "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor", "CircuitBreakerImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckIntervalData", "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor", "CheckIntervalData", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CLOSED", "Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HALF_OPEN", "Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OPEN", "Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State", "$VALUES", "[Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "isCheckIntervalFinished", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl;Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckIntervalData;J)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckIntervalData", "access$900", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckIntervalData;)J", false);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl", "access$1800", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl;)J", false);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isStateTransition", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl;Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckIntervalData;Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckIntervalData;)Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljava/lang/String;ILorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1900", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State;Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl;Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckIntervalData;J)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State", "isCheckIntervalFinished", "(Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CircuitBreakerImpl;Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$CheckIntervalData;J)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CLOSED");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State$1", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State", "CLOSED", "Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HALF_OPEN");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State$2", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State", "HALF_OPEN", "Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OPEN");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State$3", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State", "OPEN", "Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State", "CLOSED", "Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State", "HALF_OPEN", "Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State", "OPEN", "Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State", "$VALUES", "[Lorg/apache/safeguard/impl/circuitbreaker/CircuitBreakerInterceptor$State;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
