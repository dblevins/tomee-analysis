package asm.org.apache.bval.constraints;
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
public class FutureValidatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/bval/constraints/FutureValidator", "<T::Ljava/lang/Comparable<TT;>;>Lorg/apache/bval/constraints/TimeValidator<Ljavax/validation/constraints/Future;TT;>;", "org/apache/bval/constraints/TimeValidator", null);

classWriter.visitInnerClass("org/apache/bval/constraints/FutureValidator$ForYearMonth", "org/apache/bval/constraints/FutureValidator", "ForYearMonth", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/constraints/FutureValidator$ForYear", "org/apache/bval/constraints/FutureValidator", "ForYear", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/constraints/FutureValidator$ForMonthDay", "org/apache/bval/constraints/FutureValidator", "ForMonthDay", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/constraints/FutureValidator$ForChronoZonedDateTime", "org/apache/bval/constraints/FutureValidator", "ForChronoZonedDateTime", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/constraints/FutureValidator$ForOffsetTime", "org/apache/bval/constraints/FutureValidator", "ForOffsetTime", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/constraints/FutureValidator$ForOffsetDateTime", "org/apache/bval/constraints/FutureValidator", "ForOffsetDateTime", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/constraints/FutureValidator$ForLocalTime", "org/apache/bval/constraints/FutureValidator", "ForLocalTime", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/constraints/FutureValidator$ForChronoLocalDateTime", "org/apache/bval/constraints/FutureValidator", "ForChronoLocalDateTime", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/constraints/FutureValidator$ForChronoLocalDate", "org/apache/bval/constraints/FutureValidator", "ForChronoLocalDate", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/constraints/FutureValidator$ForInstant", "org/apache/bval/constraints/FutureValidator", "ForInstant", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/constraints/FutureValidator$ForCalendar", "org/apache/bval/constraints/FutureValidator", "ForCalendar", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/constraints/FutureValidator$ForDate", "org/apache/bval/constraints/FutureValidator", "ForDate", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "TEST", "Ljava/util/function/IntPredicate;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/util/function/Function;)V", "(Ljava/util/function/Function<Ljava/time/Clock;TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/constraints/FutureValidator", "TEST", "Ljava/util/function/IntPredicate;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/constraints/TimeValidator", "<init>", "(Ljava/util/function/Function;Ljava/util/function/IntPredicate;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/util/function/Function;Ljava/util/Comparator;)V", "(Ljava/util/function/Function<Ljava/time/Clock;TT;>;Ljava/util/Comparator<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/constraints/FutureValidator", "TEST", "Ljava/util/function/IntPredicate;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/constraints/TimeValidator", "<init>", "(Ljava/util/function/Function;Ljava/util/Comparator;Ljava/util/function/IntPredicate;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$static$0", "(I)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
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
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInvokeDynamicInsn("test", "()Ljava/util/function/IntPredicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(I)Z"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/constraints/FutureValidator", "lambda$static$0", "(I)Z", false), Type.getType("(I)Z")});
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/constraints/FutureValidator", "TEST", "Ljava/util/function/IntPredicate;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
